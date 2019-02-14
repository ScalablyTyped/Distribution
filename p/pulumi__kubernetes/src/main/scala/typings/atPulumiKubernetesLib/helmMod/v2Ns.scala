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
  
  /**
    * Chart is a component representing a collection of resources described by an arbitrary Helm
    * Chart. The Chart can be fetched from any source that is accessible to the `helm` command
    * line. Values in the `values.yml` file can be overridden using `ChartOpts.values` (equivalent
    * to `--set` or having multiple `values.yml` files). Objects can be transformed arbitrarily by
    * supplying callbacks to `ChartOpts.transformations`.
    *
    * `Chart` does not use Tiller. The Chart specified is copied and expanded locally; any values
    * that would be retrieved in-cluster would be assigned fake values, and none of Tiller's
    * server-side validity testing is executed.
    *
    * The semantics of `update` on a Chart are identical to those of Helm and kubectl; for example,
    * unlike a "normal" Pulumi program, updating a ConfigMap does not trigger a cascading update
    * among Deployments that reference it.
    *
    * NOTE: `Chart` will attempt to sort the resources in the same way that Helm does, to ensure
    * that (e.g.) namespaces are created before things that are in them. But, because the Pulumi
    * engine delivers the these calls asynchronously, they could arrive "somewhat" out of order.
    * This should not affect many Helm charts.
    */
  @js.native
  class Chart protected ()
    extends atPulumiKubernetesLib.atPulumiKubernetesMod.yamlNs.CollectionComponentResource {
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

