package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'precision'> */
trait PickImplprecision extends StObject {
  
  var precision: Double
}
object PickImplprecision {
  
  inline def apply(precision: Double): PickImplprecision = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprecision]
  }
  
  extension [Self <: PickImplprecision](x: Self) {
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
  }
}
