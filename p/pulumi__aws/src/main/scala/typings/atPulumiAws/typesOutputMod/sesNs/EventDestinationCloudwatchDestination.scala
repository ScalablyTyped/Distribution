package typings.atPulumiAws.typesOutputMod.sesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationCloudwatchDestination extends js.Object {
  /**
    * The default value for the event
    */
  var defaultValue: String
  /**
    * The name for the dimension
    */
  var dimensionName: String
  /**
    * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
    */
  var valueSource: String
}

object EventDestinationCloudwatchDestination {
  @scala.inline
  def apply(defaultValue: String, dimensionName: String, valueSource: String): EventDestinationCloudwatchDestination = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, dimensionName = dimensionName, valueSource = valueSource)
  
    __obj.asInstanceOf[EventDestinationCloudwatchDestination]
  }
}

