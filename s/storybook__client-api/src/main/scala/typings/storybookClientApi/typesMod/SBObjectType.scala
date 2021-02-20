package typings.storybookClientApi.typesMod

import typings.std.Record
import typings.storybookClientApi.storybookClientApiStrings.`object`
import org.scalablytyped.runtime.StObject
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
  implicit class SBObjectTypeMutableBuilder[Self <: SBObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: `object`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValue(value: Record[String, SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
