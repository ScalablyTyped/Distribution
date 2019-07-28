package typings.atPulumiKubernetes.helmV2HelmMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalChartOpts extends BaseChartOpts {
  /**
    * The path to the chart directory which contains the `Chart.yaml` file.
    */
  var path: String
}

object LocalChartOpts {
  @scala.inline
  def apply(
    path: String,
    namespace: Input[String] = null,
    resourcePrefix: String = null,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]] = null,
    values: Inputs = null
  ): LocalChartOpts = {
    val __obj = js.Dynamic.literal(path = path)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[LocalChartOpts]
  }
}

