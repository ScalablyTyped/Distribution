package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.SBBaseType & {  name :'array',   value :@storybook/client-api.@storybook/client-api/dist/types.SBType} */
@js.native
trait SBArrayType extends SBType {
  
  var name: array = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: SBType = js.native
}
object SBArrayType {
  
  @scala.inline
  def apply(name: array, value: SBType): SBArrayType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBArrayType]
  }
  
  @scala.inline
  implicit class SBArrayTypeMutableBuilder[Self <: SBArrayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: array): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValue(value: SBType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
