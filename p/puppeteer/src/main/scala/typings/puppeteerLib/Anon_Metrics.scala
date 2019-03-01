package typings
package puppeteerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metrics extends js.Object {
  var metrics: puppeteerLib.puppeteerMod.Metrics
  var title: java.lang.String
}

object Anon_Metrics {
  @scala.inline
  def apply(metrics: puppeteerLib.puppeteerMod.Metrics, title: java.lang.String): Anon_Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metrics")(metrics)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Metrics]
  }
}

