package typings.reactOverlays.dropdownMenuMod

import typings.reactOverlays.anon.Arialabelledby
import typings.reactOverlays.anon.Ref
import typings.std.Event
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDropdownMenuValue extends js.Object {
  
  var alignEnd: js.UndefOr[Boolean] = js.native
  
  var arrowProps: (Record[String, _]) with Ref = js.native
  
  def close(e: Event): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  
  var hasShown: Boolean = js.native
  
  var props: (Record[String, _]) with Arialabelledby = js.native
  
  var show: Boolean = js.native
  
  def update(): Unit = js.native
}
object UseDropdownMenuValue {
  
  @scala.inline
  def apply(
    arrowProps: (Record[String, _]) with Ref,
    close: Event => Unit,
    forceUpdate: () => Unit,
    hasShown: Boolean,
    props: (Record[String, _]) with Arialabelledby,
    show: Boolean,
    update: () => Unit
  ): UseDropdownMenuValue = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], close = js.Any.fromFunction1(close), forceUpdate = js.Any.fromFunction0(forceUpdate), hasShown = hasShown.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[UseDropdownMenuValue]
  }
  
  @scala.inline
  implicit class UseDropdownMenuValueOps[Self <: UseDropdownMenuValue] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Event => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasShown(value: Boolean): Self = this.set("hasShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: (Record[String, _]) with Arialabelledby): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlignEnd(value: Boolean): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignEnd: Self = this.set("alignEnd", js.undefined)
  }
}
