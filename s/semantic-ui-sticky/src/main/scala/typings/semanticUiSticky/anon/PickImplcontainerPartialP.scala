package typings.semanticUiSticky.anon

import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'container'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl>> */
trait PickImplcontainerPartialP
  extends StObject
     with Param {
  
  var container: String & js.UndefOr[String]
  
  var elementSize: js.UndefOr[String] = js.undefined
  
  var invalidContext: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplcontainerPartialP {
  
  inline def apply(container: String & js.UndefOr[String]): PickImplcontainerPartialP = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontainerPartialP]
  }
  
  extension [Self <: PickImplcontainerPartialP](x: Self) {
    
    inline def setContainer(value: String & js.UndefOr[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setElementSize(value: String): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
    
    inline def setElementSizeUndefined: Self = StObject.set(x, "elementSize", js.undefined)
    
    inline def setInvalidContext(value: String): Self = StObject.set(x, "invalidContext", value.asInstanceOf[js.Any])
    
    inline def setInvalidContextUndefined: Self = StObject.set(x, "invalidContext", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
