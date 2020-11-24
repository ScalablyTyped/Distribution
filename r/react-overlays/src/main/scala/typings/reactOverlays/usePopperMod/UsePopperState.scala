package typings.reactOverlays.usePopperMod

import typings.reactOverlays.anon.PartialCSSStyleDeclaratio
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsePopperState extends js.Object {
  
  var attributes: Record[String, Record[String, _]] = js.native
  
  def forceUpdate(): Unit = js.native
  
  var placement: Placement = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var styles: Record[String, PartialCSSStyleDeclaratio] = js.native
  
  def update(): Unit = js.native
}
object UsePopperState {
  
  @scala.inline
  def apply(
    attributes: Record[String, Record[String, _]],
    forceUpdate: () => Unit,
    placement: Placement,
    styles: Record[String, PartialCSSStyleDeclaratio],
    update: () => Unit
  ): UsePopperState = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[UsePopperState]
  }
  
  @scala.inline
  implicit class UsePopperStateOps[Self <: UsePopperState] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Record[String, Record[String, _]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: Record[String, PartialCSSStyleDeclaratio]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
