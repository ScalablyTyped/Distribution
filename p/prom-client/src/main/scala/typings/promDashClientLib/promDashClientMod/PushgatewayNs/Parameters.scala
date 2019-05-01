package typings
package promDashClientLib.promDashClientMod.PushgatewayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /**
  		 * Label sets used in the url when making a request to the Pushgateway,
  		 */
  var groupings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		 * Jobname that is pushing the metric
  		 */
  var jobName: java.lang.String
}

object Parameters {
  @scala.inline
  def apply(
    jobName: java.lang.String,
    groupings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Parameters = {
    val __obj = js.Dynamic.literal(jobName = jobName)
    if (groupings != null) __obj.updateDynamic("groupings")(groupings)
    __obj.asInstanceOf[Parameters]
  }
}

