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
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplParent]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplParentMutableBuilder[Self <: PartialPickImplkeyofImplParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
  }
}
