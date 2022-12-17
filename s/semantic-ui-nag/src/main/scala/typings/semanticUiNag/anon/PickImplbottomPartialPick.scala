package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl, 'bottom'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl>> */
trait PickImplbottomPartialPick
  extends StObject
     with Param {
  
  var bottom: String
  
  var fixed: js.UndefOr[String] = js.undefined
}
object PickImplbottomPartialPick {
  
  inline def apply(bottom: String): PickImplbottomPartialPick = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbottomPartialPick]
  }
  
  extension [Self <: PickImplbottomPartialPick](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
  }
}
