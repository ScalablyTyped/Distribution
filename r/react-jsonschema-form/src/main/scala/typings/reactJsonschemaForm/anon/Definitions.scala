package typings.reactJsonschemaForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactJsonschemaForm.mod.Field
import typings.reactJsonschemaForm.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definitions extends js.Object {
  
  var definitions: StringDictionary[js.Any] = js.native
  
  var fields: StringDictionary[Field] = js.native
  
  var formContext: js.Any = js.native
  
  var widgets: StringDictionary[Widget] = js.native
}
object Definitions {
  
  @scala.inline
  def apply(
    definitions: StringDictionary[js.Any],
    fields: StringDictionary[Field],
    formContext: js.Any,
    widgets: StringDictionary[Widget]
  ): Definitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
  
  @scala.inline
  implicit class DefinitionsOps[Self <: Definitions] (val x: Self) extends AnyVal {
    
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
    def setDefinitions(value: StringDictionary[js.Any]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: StringDictionary[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgets(value: StringDictionary[Widget]): Self = this.set("widgets", value.asInstanceOf[js.Any])
  }
}
