package typings.semanticUiShape.anon

import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, 'side'> & std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl>> */
trait PickImplsidePartialPickIm
  extends StObject
     with Param {
  
  var side: String & js.UndefOr[String]
  
  var sides: js.UndefOr[String] = js.undefined
}
object PickImplsidePartialPickIm {
  
  inline def apply(side: String & js.UndefOr[String]): PickImplsidePartialPickIm = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidePartialPickIm]
  }
  
  extension [Self <: PickImplsidePartialPickIm](x: Self) {
    
    inline def setSide(value: String & js.UndefOr[String]): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSides(value: String): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
  }
}
