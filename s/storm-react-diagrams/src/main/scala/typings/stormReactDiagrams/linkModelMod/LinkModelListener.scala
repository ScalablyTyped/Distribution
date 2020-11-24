package typings.stormReactDiagrams.linkModelMod

import typings.stormReactDiagrams.anon.BaseEventLinkModelLinkMod
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkModelListener extends BaseModelListener {
  
  var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.native
  
  var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.native
}
object LinkModelListener {
  
  @scala.inline
  def apply(): LinkModelListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkModelListener]
  }
  
  @scala.inline
  implicit class LinkModelListenerOps[Self <: LinkModelListener] (val x: Self) extends AnyVal {
    
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
    def setSourcePortChanged(value: /* event */ BaseEventLinkModelLinkMod => Unit): Self = this.set("sourcePortChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSourcePortChanged: Self = this.set("sourcePortChanged", js.undefined)
    
    @scala.inline
    def setTargetPortChanged(value: /* event */ BaseEventLinkModelLinkMod => Unit): Self = this.set("targetPortChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTargetPortChanged: Self = this.set("targetPortChanged", js.undefined)
  }
}
