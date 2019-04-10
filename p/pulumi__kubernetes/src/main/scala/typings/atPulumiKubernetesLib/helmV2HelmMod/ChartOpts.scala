package typings
package atPulumiKubernetesLib.helmV2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOpts extends BaseChartOpts {
  /**
    * The chart to deploy.  If [repo] is provided, this chart name is looked up in the given repository.  Else
    * this chart name must be a fully qualified chart URL or `repo/chartname`.
    */
  var chart: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Additional options to customize the fetching of the Helm chart.
    */
  var fetchOpts: js.UndefOr[atPulumiPulumiLib.outputMod.Input[FetchOpts]] = js.undefined
  /**
    * The repository containing the desired chart.  If not provided, [chart] must be a fully qualified chart URL
    * or repo/chartname.
    */
  var repo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version of the chart to deploy. If not provided, the latest version will be deployed.
    */
  var version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ChartOpts {
  @scala.inline
  def apply(
    chart: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fetchOpts: atPulumiPulumiLib.outputMod.Input[FetchOpts] = null,
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    repo: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    transformations: js.Array[js.Function1[/* o */ _, scala.Unit]] = null,
    values: atPulumiPulumiLib.outputMod.Inputs = null,
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ChartOpts = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    if (fetchOpts != null) __obj.updateDynamic("fetchOpts")(fetchOpts.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (values != null) __obj.updateDynamic("values")(values)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOpts]
  }
}

