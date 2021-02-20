package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.SBBaseType & {  name :'other',   value :string} */
@js.native
trait SBOtherType extends SBType {
  
  var name: other = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: String = js.native
}
object SBOtherType {
  
  @scala.inline
  def apply(name: other, value: String): SBOtherType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBOtherType]
  }
  
  @scala.inline
  implicit class SBOtherTypeMutableBuilder[Self <: SBOtherType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: other): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
