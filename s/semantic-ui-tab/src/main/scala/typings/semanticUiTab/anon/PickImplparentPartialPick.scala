package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, 'parent'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl>> */
trait PickImplparentPartialPick
  extends StObject
     with Param {
  
  var parent: String & js.UndefOr[String]
  
  var tabs: js.UndefOr[String] = js.undefined
}
object PickImplparentPartialPick {
  
  inline def apply(parent: String & js.UndefOr[String]): PickImplparentPartialPick = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparentPartialPick]
  }
  
  extension [Self <: PickImplparentPartialPick](x: Self) {
    
    inline def setParent(value: String & js.UndefOr[String]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
  }
}
