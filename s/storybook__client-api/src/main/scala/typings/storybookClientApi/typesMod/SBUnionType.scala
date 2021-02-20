package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.SBBaseType & {  name :'union',   value :std.Array<@storybook/client-api.@storybook/client-api/dist/types.SBType>} */
@js.native
trait SBUnionType extends SBType {
  
  var name: union = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: js.Array[SBType] = js.native
}
object SBUnionType {
  
  @scala.inline
  def apply(name: union, value: js.Array[SBType]): SBUnionType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBUnionType]
  }
  
  @scala.inline
  implicit class SBUnionTypeMutableBuilder[Self <: SBUnionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: union): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: SBType*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
