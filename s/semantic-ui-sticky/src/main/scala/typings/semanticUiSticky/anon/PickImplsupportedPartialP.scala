package typings.semanticUiSticky.anon

import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'supported'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl>> */
trait PickImplsupportedPartialP
  extends StObject
     with Param {
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var bound: js.UndefOr[String] = js.undefined
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var supported: String
  
  var top: js.UndefOr[String] = js.undefined
}
object PickImplsupportedPartialP {
  
  inline def apply(supported: String): PickImplsupportedPartialP = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsupportedPartialP]
  }
  
  extension [Self <: PickImplsupportedPartialP](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
