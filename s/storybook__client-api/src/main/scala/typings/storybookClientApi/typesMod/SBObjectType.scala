package typings.storybookClientApi.typesMod

import typings.std.Record
import typings.storybookClientApi.storybookClientApiStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.SBBaseType & {  name :'object',   value :std.Record<string, @storybook/client-api.@storybook/client-api/dist/types.SBType>} */
@js.native
trait SBObjectType extends SBType {
  
  var name: `object` = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: Record[String, SBType] = js.native
}
object SBObjectType {
  
  @scala.inline
  def apply(name: `object`, value: Record[String, SBType]): SBObjectType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBObjectType]
  }
  
  @scala.inline
  implicit class SBObjectTypeOps[Self <: SBObjectType] (val x: Self) extends AnyVal {
    
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
    def setName(value: `object`): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Record[String, SBType]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
