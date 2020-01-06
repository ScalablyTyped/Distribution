package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsStartingPositionConfiguration extends js.Object {
  var startingPosition: String = js.native
}

object AnalyticsApplicationInputsStartingPositionConfiguration {
  @scala.inline
  def apply(startingPosition: String): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
}

