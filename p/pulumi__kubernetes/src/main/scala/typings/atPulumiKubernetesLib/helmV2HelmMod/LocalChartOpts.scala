package typings
package atPulumiKubernetesLib.helmV2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalChartOpts extends BaseChartOpts {
  /**
    * The path to the chart directory which contains the `Chart.yaml` file.
    */
  var path: java.lang.String
}

object LocalChartOpts {
  @scala.inline
  def apply(
    path: java.lang.String,
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    transformations: js.Array[js.Function1[/* o */ _, scala.Unit]] = null,
    values: atPulumiPulumiLib.outputMod.Inputs = null
  ): LocalChartOpts = {
    val __obj = js.Dynamic.literal(path = path)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[LocalChartOpts]
  }
}

