package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, 'parent'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl>> */
trait PickImplparentPartialPick
  extends StObject
     with Param {
  
  var parent: String
  
  var tabs: js.UndefOr[String] = js.undefined
}
object PickImplparentPartialPick {
  
  inline def apply(parent: String): PickImplparentPartialPick = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparentPartialPick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplparentPartialPick] (val x: Self) extends AnyVal {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
  }
}
