package typings.primereact.pickListTransferControlsMod

import typings.primereact.anon.DirectionOriginalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickListTransferControlsProps extends js.Object {
  
  var onTransfer: js.UndefOr[js.Function1[/* e */ DirectionOriginalEvent, Unit]] = js.native
  
  var source: js.UndefOr[js.Array[_]] = js.native
  
  var sourceSelection: js.UndefOr[js.Array[_]] = js.native
  
  var target: js.UndefOr[js.Array[_]] = js.native
  
  var targetSelection: js.UndefOr[js.Array[_]] = js.native
}
object PickListTransferControlsProps {
  
  @scala.inline
  def apply(): PickListTransferControlsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListTransferControlsProps]
  }
  
  @scala.inline
  implicit class PickListTransferControlsPropsOps[Self <: PickListTransferControlsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnTransfer(value: /* e */ DirectionOriginalEvent => Unit): Self = this.set("onTransfer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransfer: Self = this.set("onTransfer", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[_]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceSelectionVarargs(value: js.Any*): Self = this.set("sourceSelection", js.Array(value :_*))
    
    @scala.inline
    def setSourceSelection(value: js.Array[_]): Self = this.set("sourceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSelection: Self = this.set("sourceSelection", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: js.Any*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[_]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetSelectionVarargs(value: js.Any*): Self = this.set("targetSelection", js.Array(value :_*))
    
    @scala.inline
    def setTargetSelection(value: js.Array[_]): Self = this.set("targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSelection: Self = this.set("targetSelection", js.undefined)
  }
}
