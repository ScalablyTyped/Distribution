package typings.rcFieldForm.anon

import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.rcFieldForm.esInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencies extends StObject {
  
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  
  var initialValue: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[NamePath] = js.undefined
  
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}
object Dependencies {
  
  inline def apply(): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependencies]
  }
  
  extension [Self <: Dependencies](x: Self) {
    
    inline def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
