package typings.semanticUiSticky.anon

import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'top'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl>> */
trait PickImpltopPartialPickImp
  extends StObject
     with Param {
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var bound: js.UndefOr[String] = js.undefined
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var supported: js.UndefOr[String] = js.undefined
  
  var top: String & js.UndefOr[String]
}
object PickImpltopPartialPickImp {
  
  inline def apply(top: String & js.UndefOr[String]): PickImpltopPartialPickImp = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltopPartialPickImp]
  }
  
  extension [Self <: PickImpltopPartialPickImp](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    inline def setTop(value: String & js.UndefOr[String]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
