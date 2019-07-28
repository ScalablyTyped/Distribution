package typings.atPulumiKubernetes.helmV2HelmMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.yamlMod.CollectionComponentResource
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.atPulumiPulumiMod.Resource
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm/v2/helm", "Chart")
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
  def parseTemplate(
    yamlStream: String,
    transformations: js.UndefOr[scala.Nothing],
    resourcePrefix: js.UndefOr[scala.Nothing],
    dependsOn: js.Array[Resource]
  ): Output[StringDictionary[CustomResource]] = js.native
  def parseTemplate(
    yamlStream: String,
    transformations: js.UndefOr[scala.Nothing],
    resourcePrefix: String,
    dependsOn: js.Array[Resource]
  ): Output[StringDictionary[CustomResource]] = js.native
  def parseTemplate(
    yamlStream: String,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]],
    resourcePrefix: js.UndefOr[scala.Nothing],
    dependsOn: js.Array[Resource]
  ): Output[StringDictionary[CustomResource]] = js.native
  def parseTemplate(
    yamlStream: String,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]],
    resourcePrefix: String,
    dependsOn: js.Array[Resource]
  ): Output[StringDictionary[CustomResource]] = js.native
}

