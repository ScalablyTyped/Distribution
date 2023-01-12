package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, 'show'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl>> */
trait PickImplshowPartialPickIm
  extends StObject
     with Param {
  
  var hide: js.UndefOr[String] = js.undefined
  
  var show: String
}
object PickImplshowPartialPickIm {
  
  inline def apply(show: String): PickImplshowPartialPickIm = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowPartialPickIm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplshowPartialPickIm] (val x: Self) extends AnyVal {
    
    inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
