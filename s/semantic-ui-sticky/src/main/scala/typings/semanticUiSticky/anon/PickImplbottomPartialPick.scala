package typings.semanticUiSticky.anon

import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'bottom'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl>> */
trait PickImplbottomPartialPick
  extends StObject
     with Param {
  
  var bottom: String
  
  var bound: js.UndefOr[String] = js.undefined
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var supported: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[String] = js.undefined
}
object PickImplbottomPartialPick {
  
  inline def apply(bottom: String): PickImplbottomPartialPick = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbottomPartialPick]
  }
  
  extension [Self <: PickImplbottomPartialPick](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
