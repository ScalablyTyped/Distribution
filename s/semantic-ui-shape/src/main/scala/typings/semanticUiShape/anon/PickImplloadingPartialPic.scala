package typings.semanticUiShape.anon

import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, 'loading'> & std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl>> */
trait PickImplloadingPartialPic
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var animating: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[String] = js.undefined
  
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
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setLoading(value: String & js.UndefOr[String]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
