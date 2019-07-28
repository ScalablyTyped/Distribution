package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultMetrics extends js.Object {
  /**
  	 * All available default metrics
  	 */
  var metricsList: js.Array[String]
}

object defaultMetrics {
  @scala.inline
  def apply(metricsList: js.Array[String]): defaultMetrics = {
    val __obj = js.Dynamic.literal(metricsList = metricsList)
  
    __obj.asInstanceOf[defaultMetrics]
  }
}

