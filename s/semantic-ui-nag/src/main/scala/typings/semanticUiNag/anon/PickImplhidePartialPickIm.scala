package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, 'hide'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl>> */
trait PickImplhidePartialPickIm
  extends StObject
     with Param {
  
  var hide: String
  
  var show: js.UndefOr[String] = js.undefined
}
object PickImplhidePartialPickIm {
  
  inline def apply(hide: String): PickImplhidePartialPickIm = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhidePartialPickIm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplhidePartialPickIm] (val x: Self) extends AnyVal {
    
    inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
