package typings.pulumiKubernetes.v3HelmMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.yamlMod.CollectionComponentResource
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/helm/v3/helm", "Chart")
@js.native
class Chart protected () extends CollectionComponentResource {
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
  
  def parseChart(config: ChartOpts, releaseName: String): Output_[StringDictionary[CustomResource]] = js.native
  def parseChart(config: ChartOpts, releaseName: String, opts: ComponentResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
  def parseChart(config: LocalChartOpts, releaseName: String): Output_[StringDictionary[CustomResource]] = js.native
  def parseChart(config: LocalChartOpts, releaseName: String, opts: ComponentResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
}
