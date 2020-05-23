package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var metrics: typings.puppeteer.mod.Metrics
  var title: String
}

object Metrics {
  @scala.inline
  def apply(metrics: typings.puppeteer.mod.Metrics, title: String): Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

