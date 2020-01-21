package typings.promClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Histogram = typings.promClient.mod.Histogram_
  /* Rewritten from type alias, can be one of: 
    - typings.promClient.mod.Counter
    - typings.promClient.mod.Gauge
    - typings.promClient.mod.Summary
    - typings.promClient.mod.Histogram
  */
  type Metric_ = typings.promClient.mod._Metric_ | typings.promClient.mod.Summary | typings.promClient.mod.Histogram
  type Pushgateway = typings.promClient.mod.Pushgateway_
  type Summary = typings.promClient.mod.Summary_
  type labelValues = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
