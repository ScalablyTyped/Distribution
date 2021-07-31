package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'opacity'> */
trait PickImplopacity extends StObject {
  
  var opacity: auto | Double
}
object PickImplopacity {
  
  @scala.inline
  def apply(opacity: auto | Double): PickImplopacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplopacity]
  }
  
  @scala.inline
  implicit class PickImplopacityMutableBuilder[Self <: PickImplopacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: auto | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
