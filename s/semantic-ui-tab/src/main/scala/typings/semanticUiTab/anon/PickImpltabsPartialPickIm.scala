package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, 'tabs'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl>> */
trait PickImpltabsPartialPickIm
  extends StObject
     with Param {
  
  var parent: js.UndefOr[String] = js.undefined
  
  var tabs: String & js.UndefOr[String]
}
object PickImpltabsPartialPickIm {
  
  inline def apply(tabs: String & js.UndefOr[String]): PickImpltabsPartialPickIm = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltabsPartialPickIm]
  }
  
  extension [Self <: PickImpltabsPartialPickIm](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTabs(value: String & js.UndefOr[String]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
  }
}
