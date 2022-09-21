package typings.semanticUiRating.anon

import typings.semanticUiRating.SemanticUI.Rating.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'loading'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl>> */
trait PickImplloadingPartialPic
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[String] = js.undefined
  
  var loading: String & js.UndefOr[String]
}
object PickImplloadingPartialPic {
  
  inline def apply(loading: String & js.UndefOr[String]): PickImplloadingPartialPic = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadingPartialPic]
  }
  
  extension [Self <: PickImplloadingPartialPic](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setLoading(value: String & js.UndefOr[String]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
