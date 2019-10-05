package typings.promDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promDashClientMod {
  import org.scalablytyped.runtime.StringDictionary

  type Histogram = Histogram_
  /* Rewritten from type alias, can be one of: 
    - typings.promDashClient.promDashClientMod.Counter
    - typings.promDashClient.promDashClientMod.Gauge
    - typings.promDashClient.promDashClientMod.Summary
    - typings.promDashClient.promDashClientMod.Histogram
  */
  type Metric = _Metric | Summary | Histogram
  type Pushgateway = Pushgateway_
  type Summary = Summary_
  type labelValues = StringDictionary[String | Double]
}
