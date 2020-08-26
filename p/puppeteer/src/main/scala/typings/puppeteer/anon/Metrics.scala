package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  var metrics: typings.puppeteer.mod.Metrics = js.native
  var title: String = js.native
}

object Metrics {
  @scala.inline
  def apply(metrics: typings.puppeteer.mod.Metrics, title: String): Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetrics(value: typings.puppeteer.mod.Metrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

