package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplParent extends StObject {
  
  var parent: js.UndefOr[String] = js.undefined
  
  var tabs: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplParent {
  
  inline def apply(): PartialPickImplkeyofImplParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplParent]
  }
  
  extension [Self <: PartialPickImplkeyofImplParent](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
  }
}
