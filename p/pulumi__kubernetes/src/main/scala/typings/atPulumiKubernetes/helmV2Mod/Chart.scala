package typings.atPulumiKubernetes.helmV2Mod

import typings.atPulumiKubernetes.helmV2HelmMod.ChartOpts
import typings.atPulumiKubernetes.helmV2HelmMod.LocalChartOpts
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm/v2", "Chart")
@js.native
class Chart protected ()
  extends typings.atPulumiKubernetes.helmV2HelmMod.Chart {
  /**
    * Create an instance of the specified Helm chart.
    * @param releaseName Name of the Chart (e.g., nginx-ingress).
    * @param config Configuration options for the Chart.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(releaseName: String, config: ChartOpts) = this()
  def this(releaseName: String, config: LocalChartOpts) = this()
  def this(releaseName: String, config: ChartOpts, opts: ComponentResourceOptions) = this()
  def this(releaseName: String, config: LocalChartOpts, opts: ComponentResourceOptions) = this()
}

