package typings.reactOverlays.anon

import typings.reactOverlays.esmUsePopperMod.State
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceUpdate extends js.Object {
  
  var arrowProps: (Record[String, _]) with Ref = js.native
  
  def forceUpdate(): Unit = js.native
  
  var placement: typings.reactOverlays.esmUsePopperMod.Placement = js.native
  
  var props: (Record[String, _]) with Style = js.native
  
  var show: Boolean = js.native
  
  var state: js.UndefOr[State] = js.native
  
  def update(): Unit = js.native
}
object ForceUpdate {
  
  @scala.inline
  def apply(
    arrowProps: (Record[String, _]) with Ref,
    forceUpdate: () => Unit,
    placement: typings.reactOverlays.esmUsePopperMod.Placement,
    props: (Record[String, _]) with Style,
    show: Boolean,
    update: () => Unit
  ): ForceUpdate = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ForceUpdate]
  }
  
  @scala.inline
  implicit class ForceUpdateOps[Self <: ForceUpdate] (val x: Self) extends AnyVal {
    
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
    def setArrowProps(value: (Record[String, _]) with Ref): Self = this.set("arrowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: typings.reactOverlays.esmUsePopperMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: (Record[String, _]) with Style): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
