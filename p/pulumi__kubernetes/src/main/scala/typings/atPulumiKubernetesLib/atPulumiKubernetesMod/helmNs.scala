package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "helm")
@js.native
object helmNs extends js.Object {
  @JSName("v2")
  @js.native
  object v2Ns extends js.Object {
    @js.native
    class Chart protected ()
      extends atPulumiKubernetesLib.helmMod.v2Ns.Chart {
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
    
    def fetch(chart: java.lang.String): scala.Unit = js.native
    def fetch(chart: java.lang.String, opts: atPulumiKubernetesLib.helmV2HelmMod.ResolvedFetchOpts): scala.Unit = js.native
    def helmSort(a: atPulumiKubernetesLib.Anon_Kind, b: atPulumiKubernetesLib.Anon_Kind): scala.Double = js.native
  }
  
}

