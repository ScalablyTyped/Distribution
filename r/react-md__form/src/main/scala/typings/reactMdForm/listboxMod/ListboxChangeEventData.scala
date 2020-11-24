package typings.reactMdForm.listboxMod

import typings.reactMdForm.utilsMod.ListboxOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@react-md/form.@react-md/form/types/select/Listbox.ListboxProps>, 'id' | 'valueKey' | 'value' | 'options'> & std.Pick<@react-md/form.@react-md/form/types/select/Listbox.ListboxProps, 'name'> */
@js.native
trait ListboxChangeEventData extends js.Object {
  
  var id: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.Array[ListboxOption] = js.native
  
  var value: String = js.native
  
  var valueKey: String = js.native
}
object ListboxChangeEventData {
  
  @scala.inline
  def apply(id: String, options: js.Array[ListboxOption], value: String, valueKey: String): ListboxChangeEventData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListboxChangeEventData]
  }
  
  @scala.inline
  implicit class ListboxChangeEventDataOps[Self <: ListboxChangeEventData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: ListboxOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[ListboxOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
