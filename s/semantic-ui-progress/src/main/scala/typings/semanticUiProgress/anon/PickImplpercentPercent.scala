package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'percent'> */
trait PickImplpercentPercent extends StObject {
  
  var percent: String
}
object PickImplpercentPercent {
  
  inline def apply(percent: String): PickImplpercentPercent = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpercentPercent]
  }
  
  extension [Self <: PickImplpercentPercent](x: Self) {
    
    inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
