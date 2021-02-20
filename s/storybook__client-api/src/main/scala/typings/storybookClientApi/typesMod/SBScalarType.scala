package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.boolean
import typings.storybookClientApi.storybookClientApiStrings.function
import typings.storybookClientApi.storybookClientApiStrings.number
import typings.storybookClientApi.storybookClientApiStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.SBBaseType & {  name :'boolean' | 'string' | 'number' | 'function'} */
@js.native
trait SBScalarType extends SBType {
  
  var name: boolean | string | number | function = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
}
object SBScalarType {
  
  @scala.inline
  def apply(name: boolean | string | number | function): SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBScalarType]
  }
  
  @scala.inline
  implicit class SBScalarTypeMutableBuilder[Self <: SBScalarType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: boolean | string | number | function): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
