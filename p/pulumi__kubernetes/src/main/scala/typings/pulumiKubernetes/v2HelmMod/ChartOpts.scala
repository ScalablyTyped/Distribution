package typings.pulumiKubernetes.v2HelmMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOpts extends BaseChartOpts {
  /**
    * The name of the chart to deploy.  If [repo] is provided, this chart name will be prefixed by the repo name.
    * Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
    * Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
    */
  var chart: Input[String] = js.native
  /**
    * Additional options to customize the fetching of the Helm chart.
    */
  var fetchOpts: js.UndefOr[Input[FetchOpts]] = js.native
  /**
    * The repository name of the chart to deploy.
    * Example: "stable"
    */
  var repo: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the chart to deploy. If not provided, the latest version will be deployed.
    */
  var version: js.UndefOr[Input[String]] = js.native
}

object ChartOpts {
  @scala.inline
  def apply(chart: Input[String]): ChartOpts = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOpts]
  }
  @scala.inline
  implicit class ChartOptsOps[Self <: ChartOpts] (val x: Self) extends AnyVal {
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
    def setChart(value: Input[String]): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchOpts(value: Input[FetchOpts]): Self = this.set("fetchOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchOpts: Self = this.set("fetchOpts", js.undefined)
    @scala.inline
    def setRepo(value: Input[String]): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

