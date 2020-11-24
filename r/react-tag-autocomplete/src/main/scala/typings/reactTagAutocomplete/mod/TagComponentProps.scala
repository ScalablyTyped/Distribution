package typings.reactTagAutocomplete.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagComponentProps extends js.Object {
  
  var classNames: ClassNames = js.native
  
  def onDelete(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
  
  var tag: Tag = js.native
}
object TagComponentProps {
  
  @scala.inline
  def apply(
    classNames: ClassNames,
    onDelete: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    tag: Tag
  ): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagComponentProps]
  }
  
  @scala.inline
  implicit class TagComponentPropsOps[Self <: TagComponentProps] (val x: Self) extends AnyVal {
    
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
    def setClassNames(value: ClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDelete(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
