package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl>> */
trait PartialPickImplkeyofImplHide extends StObject {
  
  var hide: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplHide {
  
  inline def apply(): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
  
  extension [Self <: PartialPickImplkeyofImplHide](x: Self) {
    
    inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
