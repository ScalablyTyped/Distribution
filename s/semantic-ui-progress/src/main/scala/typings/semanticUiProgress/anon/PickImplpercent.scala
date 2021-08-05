package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'percent'> */
trait PickImplpercent extends StObject {
  
  var percent: `false` | String
}
object PickImplpercent {
  
  inline def apply(percent: `false` | String): PickImplpercent = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpercent]
  }
  
  extension [Self <: PickImplpercent](x: Self) {
    
    inline def setPercent(value: `false` | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
