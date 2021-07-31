package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsStartingPositionConfiguration extends StObject {
  
  var startingPosition: js.UndefOr[Input[String]] = js.undefined
}
object AnalyticsApplicationInputsStartingPositionConfiguration {
  
  @scala.inline
  def apply(): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsStartingPositionConfigurationMutableBuilder[Self <: AnalyticsApplicationInputsStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartingPosition(value: Input[String]): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
  }
}
