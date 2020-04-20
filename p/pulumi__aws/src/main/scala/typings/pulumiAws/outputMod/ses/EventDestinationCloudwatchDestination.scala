package typings.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationCloudwatchDestination extends js.Object {
  /**
    * The default value for the event
    */
  var defaultValue: String = js.native
  /**
    * The name for the dimension
    */
  var dimensionName: String = js.native
  /**
    * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
    */
  var valueSource: String = js.native
}

object EventDestinationCloudwatchDestination {
  @scala.inline
  def apply(defaultValue: String, dimensionName: String, valueSource: String): EventDestinationCloudwatchDestination = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationCloudwatchDestination]
  }
}

