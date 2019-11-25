package typings.atPulumiKubernetes.helmV2HelmMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOpts extends BaseChartOpts {
  /**
    * The name of the chart to deploy.  If [repo] is provided, this chart name will be prefixed by the repo name.
    * Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
    * Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
    */
  var chart: Input[String]
  /**
    * Additional options to customize the fetching of the Helm chart.
    */
  var fetchOpts: js.UndefOr[Input[FetchOpts]] = js.undefined
  /**
    * The repository name of the chart to deploy.
    * Example: "stable"
    */
  var repo: js.UndefOr[Input[String]] = js.undefined
  /**
    * The version of the chart to deploy. If not provided, the latest version will be deployed.
    */
  var version: js.UndefOr[Input[String]] = js.undefined
}

object ChartOpts {
  @scala.inline
  def apply(
    chart: Input[String],
    fetchOpts: Input[FetchOpts] = null,
    namespace: Input[String] = null,
    repo: Input[String] = null,
    resourcePrefix: String = null,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]] = null,
    values: Inputs = null,
    version: Input[String] = null
  ): ChartOpts = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    if (fetchOpts != null) __obj.updateDynamic("fetchOpts")(fetchOpts.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOpts]
  }
}

