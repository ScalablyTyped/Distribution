package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'total'> */
trait PickImpltotal extends StObject {
  
  var total: `false` | Double
}
object PickImpltotal {
  
  inline def apply(total: `false` | Double): PickImpltotal = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltotal]
  }
  
  extension [Self <: PickImpltotal](x: Self) {
    
    inline def setTotal(value: `false` | Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
