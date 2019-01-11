package typings
package atPulumiKubernetesLib.helmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm", "v2")
@js.native
object v2Ns extends js.Object {
  trait BaseChartOpts extends js.Object {
    /**
      * The optional namespace to install chart resources into.
      */
    var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    /**
      * Optional array of transformations to apply to resources that will be created by this chart prior to
      * creation. Allows customization of the chart behaviour without directly modifying the chart itself.
      */
    var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
    /**
      * Overrides for chart values.
      */
    var values: js.UndefOr[atPulumiPulumiLib.resourceMod.Inputs] = js.undefined
  }
  
  @js.native
  class Chart protected ()
    extends atPulumiKubernetesLib.atPulumiKubernetesMod.yamlNs.CollectionComponentResource {
    def this(releaseName: java.lang.String, config: ChartOpts) = this()
    def this(releaseName: java.lang.String, config: LocalChartOpts) = this()
    def this(releaseName: java.lang.String, config: ChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    def this(releaseName: java.lang.String, config: LocalChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    def parseTemplate(
      yamlStream: java.lang.String,
      transformations: js.Array[js.Function1[/* o */ _, scala.Unit]],
      dependsOn: js.Array[atPulumiPulumiLib.atPulumiPulumiMod.Resource]
    ): atPulumiPulumiLib.atPulumiPulumiMod.Output[
        org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
      ] = js.native
    def parseTemplate(
      yamlStream: java.lang.String,
      transformations: js.UndefOr[scala.Nothing],
      dependsOn: js.Array[atPulumiPulumiLib.atPulumiPulumiMod.Resource]
    ): atPulumiPulumiLib.atPulumiPulumiMod.Output[
        org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
      ] = js.native
  }
  
  trait ChartOpts extends BaseChartOpts {
    /**
      * The chart to deploy.  If [repo] is provided, this chart name is looked up in the given repository.  Else
      * this chart name must be a fully qualified chart URL or `repo/chartname`.
      */
    var chart: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    /**
      * Additional options to customize the fetching of the Helm chart.
      */
    var fetchOpts: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.helmMod.FetchOpts]] = js.undefined
    /**
      * The repository containing the desired chart.  If not provided, [chart] must be a fully qualified chart URL
      * or repo/chartname.
      */
    var repo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    /**
      * The version of the chart to deploy. If not provided, the latest version will be deployed.
      */
    var version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  }
  
  trait LocalChartOpts extends BaseChartOpts {
    /**
      * The path to the chart directory which contains the `Chart.yaml` file.
      */
    var path: java.lang.String
  }
  
}

