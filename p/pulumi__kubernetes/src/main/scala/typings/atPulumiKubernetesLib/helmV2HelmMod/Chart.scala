package typings
package atPulumiKubernetesLib.helmV2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm/v2/helm", "Chart")
@js.native
class Chart protected ()
  extends atPulumiKubernetesLib.yamlMod.CollectionComponentResource {
  /**
    * Create an instance of the specified Helm chart.
    * @param releaseName Name of the Chart (e.g., nginx-ingress).
    * @param config Configuration options for the Chart.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(releaseName: java.lang.String, config: ChartOpts) = this()
  def this(releaseName: java.lang.String, config: LocalChartOpts) = this()
  def this(releaseName: java.lang.String, config: ChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  def this(releaseName: java.lang.String, config: LocalChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  def parseTemplate(
    yamlStream: java.lang.String,
    transformations: js.UndefOr[scala.Nothing],
    dependsOn: js.Array[atPulumiPulumiLib.atPulumiPulumiMod.Resource]
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
  def parseTemplate(
    yamlStream: java.lang.String,
    transformations: js.Array[
      js.Function2[
        /* o */ _, 
        /* opts */ atPulumiPulumiLib.resourceMod.CustomResourceOptions, 
        scala.Unit
      ]
    ],
    dependsOn: js.Array[atPulumiPulumiLib.atPulumiPulumiMod.Resource]
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
}

