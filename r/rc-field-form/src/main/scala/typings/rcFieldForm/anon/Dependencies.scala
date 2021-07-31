package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencies extends StObject {
  
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  
  var initialValue: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[NamePath] = js.undefined
  
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}
object Dependencies {
  
  @scala.inline
  def apply(): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependencies]
  }
  
  @scala.inline
  implicit class DependenciesMutableBuilder[Self <: Dependencies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setInitialValue(value: js.Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
