package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "helm")
@js.native
object helmNs extends js.Object {
  def fetch(chart: java.lang.String): scala.Unit = js.native
  def fetch(chart: java.lang.String, opts: atPulumiKubernetesLib.helmMod.ResolvedFetchOpts): scala.Unit = js.native
  @JSName("v2")
  @js.native
  object v2Ns extends js.Object {
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
      extends atPulumiKubernetesLib.helmMod.v2Ns.Chart {
      /**
        * Create an instance of the specified Helm chart.
        * @param releaseName Name of the Chart (e.g., nginx-ingress).
        * @param config Configuration options for the Chart.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.ChartOpts) = this()
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.LocalChartOpts) = this()
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.ChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.LocalChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    }
    
  }
  
}

