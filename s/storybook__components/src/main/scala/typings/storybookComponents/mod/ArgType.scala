package typings.storybookComponents.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgType
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `if`: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Conditional */ Any
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ArgType {
  
  inline def apply(): ArgType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgType] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIf(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Conditional */ Any
    ): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
