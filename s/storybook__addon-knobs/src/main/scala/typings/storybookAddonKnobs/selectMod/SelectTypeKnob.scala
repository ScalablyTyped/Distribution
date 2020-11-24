package typings.storybookAddonKnobs.selectMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectTypeKnob[T /* <: SelectTypeKnobValue */] extends KnobControlConfig[T] {
  
  var options: SelectTypeOptionsProp[T] = js.native
}
object SelectTypeKnob {
  
  @scala.inline
  def apply[T /* <: SelectTypeKnobValue */](name: String, options: SelectTypeOptionsProp[T], value: T): SelectTypeKnob[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectTypeKnob[T]]
  }
  
  @scala.inline
  implicit class SelectTypeKnobOps[Self <: SelectTypeKnob[_], T /* <: SelectTypeKnobValue */] (val x: Self with SelectTypeKnob[T]) extends AnyVal {
    
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
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: SelectTypeOptionsProp[T]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
