package typings.storybookCsf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookCsf.storybookCsfStrings.boolean
import typings.storybookCsf.storybookCsfStrings.function
import typings.storybookCsf.storybookCsfStrings.number
import typings.storybookCsf.storybookCsfStrings.string
import typings.storybookCsf.storybookCsfStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputType
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `if`: js.UndefOr[Conditional] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[SBType | boolean | string | number | function | symbol] = js.undefined
}
object InputType {
  
  inline def apply(): InputType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputType] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIf(value: Conditional): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: SBType | boolean | string | number | function | symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
