package typings.reactTagsinput.mod

import typings.react.mod.ChangeEvent
import typings.reactTagsinput.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderInputProps[Tag] extends InputProps {
  
  def addTag(tag: Tag): Unit = js.native
  
  def onChange(e: ChangeEvent[Value]): Unit = js.native
  
  def ref(r: js.Any): Unit = js.native
  
   // parameter is either a DOM element or a mounted React component
  val value: Tag = js.native
}
object RenderInputProps {
  
  @scala.inline
  def apply[Tag](addTag: Tag => Unit, onChange: ChangeEvent[Value] => Unit, ref: js.Any => Unit, value: Tag): RenderInputProps[Tag] = {
    val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1(addTag), onChange = js.Any.fromFunction1(onChange), ref = js.Any.fromFunction1(ref), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInputProps[Tag]]
  }
  
  @scala.inline
  implicit class RenderInputPropsOps[Self <: RenderInputProps[_], Tag] (val x: Self with RenderInputProps[Tag]) extends AnyVal {
    
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
    def setAddTag(value: Tag => Unit): Self = this.set("addTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChange(value: ChangeEvent[Value] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: js.Any => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: Tag): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
