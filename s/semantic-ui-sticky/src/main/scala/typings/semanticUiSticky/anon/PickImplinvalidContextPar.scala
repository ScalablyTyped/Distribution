package typings.semanticUiSticky.anon

import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'invalidContext'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl>> */
trait PickImplinvalidContextPar
  extends StObject
     with Param {
  
  var container: js.UndefOr[String] = js.undefined
  
  var elementSize: js.UndefOr[String] = js.undefined
  
  var invalidContext: String
  
  var method: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplinvalidContextPar {
  
  inline def apply(invalidContext: String): PickImplinvalidContextPar = {
    val __obj = js.Dynamic.literal(invalidContext = invalidContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidContextPar]
  }
  
  extension [Self <: PickImplinvalidContextPar](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setElementSize(value: String): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
    
    inline def setElementSizeUndefined: Self = StObject.set(x, "elementSize", js.undefined)
    
    inline def setInvalidContext(value: String): Self = StObject.set(x, "invalidContext", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
