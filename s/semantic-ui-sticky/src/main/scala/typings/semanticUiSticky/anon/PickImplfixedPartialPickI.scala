package typings.semanticUiSticky.anon

import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'fixed'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl>> */
trait PickImplfixedPartialPickI
  extends StObject
     with Param {
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var bound: js.UndefOr[String] = js.undefined
  
  var fixed: String
  
  var supported: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[String] = js.undefined
}
object PickImplfixedPartialPickI {
  
  inline def apply(fixed: String): PickImplfixedPartialPickI = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfixedPartialPickI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplfixedPartialPickI] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
