package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.enum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.SBBaseType & {  name :'enum',   value :std.Array<string | number>} */
@js.native
trait SBEnumType extends SBType {
  
  var name: enum = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var value: js.Array[String | Double] = js.native
}
object SBEnumType {
  
  @scala.inline
  def apply(name: enum, value: js.Array[String | Double]): SBEnumType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBEnumType]
  }
  
  @scala.inline
  implicit class SBEnumTypeMutableBuilder[Self <: SBEnumType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: enum): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[String | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
