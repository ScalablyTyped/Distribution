package typings.promDashClient.promDashClientMod.Pushgateway

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /**
  		 * Label sets used in the url when making a request to the Pushgateway,
  		 */
  var groupings: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * Jobname that is pushing the metric
  		 */
  var jobName: String
}

object Parameters {
  @scala.inline
  def apply(jobName: String, groupings: StringDictionary[String] = null): Parameters = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    if (groupings != null) __obj.updateDynamic("groupings")(groupings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

