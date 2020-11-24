package typings.storybookComponents.controlsTypesMod

import typings.storybookComponents.typesMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlProps[T] extends js.Object {
  
  var argType: js.UndefOr[ArgType] = js.native
  
  var defaultValue: js.UndefOr[T] = js.native
  
  var name: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  def onChange(value: T): T | Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var value: js.UndefOr[T] = js.native
}
object ControlProps {
  
  @scala.inline
  def apply[T](name: String, onChange: T => T | Unit): ControlProps[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ControlProps[T]]
  }
  
  @scala.inline
  implicit class ControlPropsOps[Self <: ControlProps[_], T] (val x: Self with ControlProps[T]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: T => T | Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgType(value: ArgType): Self = this.set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgType: Self = this.set("argType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: T): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* evt */ js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* evt */ js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
