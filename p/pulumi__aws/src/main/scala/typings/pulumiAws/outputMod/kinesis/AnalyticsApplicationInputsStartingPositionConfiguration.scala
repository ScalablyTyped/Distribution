package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsStartingPositionConfiguration extends StObject {
  
  var startingPosition: String = js.native
}
object AnalyticsApplicationInputsStartingPositionConfiguration {
  
  @scala.inline
  def apply(startingPosition: String): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsStartingPositionConfigurationMutableBuilder[Self <: AnalyticsApplicationInputsStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartingPosition(value: String): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
  }
}
