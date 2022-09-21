package typings.semanticUiShape.anon

import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, 'hidden'> & std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl>> */
trait PickImplhiddenPartialPick
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var animating: js.UndefOr[String] = js.undefined
  
  var hidden: String & js.UndefOr[String]
  
  var loading: js.UndefOr[String] = js.undefined
}
object PickImplhiddenPartialPick {
  
  inline def apply(hidden: String & js.UndefOr[String]): PickImplhiddenPartialPick = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhiddenPartialPick]
  }
  
  extension [Self <: PickImplhiddenPartialPick](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setHidden(value: String & js.UndefOr[String]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
