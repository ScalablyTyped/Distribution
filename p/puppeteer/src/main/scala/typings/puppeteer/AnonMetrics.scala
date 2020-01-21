package typings.puppeteer

import typings.puppeteer.mod.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetrics extends js.Object {
  var metrics: Metrics
  var title: String
}

object AnonMetrics {
  @scala.inline
  def apply(metrics: Metrics, title: String): AnonMetrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMetrics]
  }
}

