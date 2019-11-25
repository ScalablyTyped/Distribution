package typings.puppeteer

import typings.puppeteer.puppeteerMod.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metrics extends js.Object {
  var metrics: Metrics
  var title: String
}

object Anon_Metrics {
  @scala.inline
  def apply(metrics: Metrics, title: String): Anon_Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Metrics]
  }
}

