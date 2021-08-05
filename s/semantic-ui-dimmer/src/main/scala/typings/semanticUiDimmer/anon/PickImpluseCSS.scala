package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'useCSS'> */
trait PickImpluseCSS extends StObject {
  
  var useCSS: Boolean
}
object PickImpluseCSS {
  
  inline def apply(useCSS: Boolean): PickImpluseCSS = {
    val __obj = js.Dynamic.literal(useCSS = useCSS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseCSS]
  }
  
  extension [Self <: PickImpluseCSS](x: Self) {
    
    inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
  }
}
