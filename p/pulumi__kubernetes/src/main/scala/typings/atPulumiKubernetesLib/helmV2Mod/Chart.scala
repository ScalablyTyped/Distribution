package typings
package atPulumiKubernetesLib.helmV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm/v2", "Chart")
@js.native
class Chart protected ()
  extends atPulumiKubernetesLib.helmV2HelmMod.Chart {
  /**
    * Create an instance of the specified Helm chart.
    * @param releaseName Name of the Chart (e.g., nginx-ingress).
    * @param config Configuration options for the Chart.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmV2HelmMod.ChartOpts) = this()
  def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmV2HelmMod.LocalChartOpts) = this()
  def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmV2HelmMod.ChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmV2HelmMod.LocalChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
}

