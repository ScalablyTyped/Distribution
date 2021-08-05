package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsStartingPositionConfiguration extends StObject {
  
  var startingPosition: String
}
object AnalyticsApplicationInputsStartingPositionConfiguration {
  
  inline def apply(startingPosition: String): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  
  extension [Self <: AnalyticsApplicationInputsStartingPositionConfiguration](x: Self) {
    
    inline def setStartingPosition(value: String): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
  }
}
