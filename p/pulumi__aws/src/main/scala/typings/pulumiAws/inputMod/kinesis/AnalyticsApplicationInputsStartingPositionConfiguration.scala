package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsStartingPositionConfiguration extends StObject {
  
  var startingPosition: js.UndefOr[Input[String]] = js.undefined
}
object AnalyticsApplicationInputsStartingPositionConfiguration {
  
  inline def apply(): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  
  extension [Self <: AnalyticsApplicationInputsStartingPositionConfiguration](x: Self) {
    
    inline def setStartingPosition(value: Input[String]): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
  }
}
