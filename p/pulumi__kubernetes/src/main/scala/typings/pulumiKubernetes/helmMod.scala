package typings.pulumiKubernetes

import typings.pulumiKubernetes.v2HelmMod.ChartOpts
import typings.pulumiKubernetes.v2HelmMod.LocalChartOpts
import typings.pulumiKubernetes.v2HelmMod.ResolvedFetchOpts
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm", JSImport.Namespace)
@js.native
object helmMod extends js.Object {
  @js.native
  object v2 extends js.Object {
    @js.native
    class Chart protected ()
      extends typings.pulumiKubernetes.v2Mod.Chart {
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
    
    def fetch(chart: String): Unit = js.native
    def fetch(chart: String, opts: ResolvedFetchOpts): Unit = js.native
  }
  
  @js.native
  object v3 extends js.Object {
    @js.native
    class Chart protected ()
      extends typings.pulumiKubernetes.v3Mod.Chart {
      /**
        * Create an instance of the specified Helm chart.
        * @param releaseName Name of the Chart (e.g., nginx-ingress).
        * @param config Configuration options for the Chart.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(releaseName: String, config: typings.pulumiKubernetes.v3HelmMod.ChartOpts) = this()
      def this(releaseName: String, config: typings.pulumiKubernetes.v3HelmMod.LocalChartOpts) = this()
      def this(
        releaseName: String,
        config: typings.pulumiKubernetes.v3HelmMod.ChartOpts,
        opts: ComponentResourceOptions
      ) = this()
      def this(
        releaseName: String,
        config: typings.pulumiKubernetes.v3HelmMod.LocalChartOpts,
        opts: ComponentResourceOptions
      ) = this()
    }
    
    def fetch(chart: String): Unit = js.native
    def fetch(chart: String, opts: typings.pulumiKubernetes.v3HelmMod.ResolvedFetchOpts): Unit = js.native
  }
  
}

