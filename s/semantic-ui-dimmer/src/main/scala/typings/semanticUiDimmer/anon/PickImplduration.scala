package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'duration'> */
trait PickImplduration extends StObject {
  
  var duration: Double | DurationSettings
}
object PickImplduration {
  
  inline def apply(duration: Double | DurationSettings): PickImplduration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplduration]
  }
  
  extension [Self <: PickImplduration](x: Self) {
    
    inline def setDuration(value: Double | DurationSettings): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
