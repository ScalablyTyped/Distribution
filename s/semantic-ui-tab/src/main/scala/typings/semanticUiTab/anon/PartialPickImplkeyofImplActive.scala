package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ClassNameSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplActive {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplActiveMutableBuilder[Self <: PartialPickImplkeyofImplActive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
