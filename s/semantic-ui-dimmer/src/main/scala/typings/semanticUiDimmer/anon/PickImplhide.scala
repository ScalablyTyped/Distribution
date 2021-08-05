package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl, 'hide'> */
trait PickImplhide extends StObject {
  
  var hide: Double
}
object PickImplhide {
  
  inline def apply(hide: Double): PickImplhide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhide]
  }
  
  extension [Self <: PickImplhide](x: Self) {
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
  }
}
