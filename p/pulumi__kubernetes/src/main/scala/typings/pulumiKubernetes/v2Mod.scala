package typings.pulumiKubernetes

import typings.pulumiKubernetes.v2HelmMod.ChartOpts
import typings.pulumiKubernetes.v2HelmMod.LocalChartOpts
import typings.pulumiKubernetes.v2HelmMod.ResolvedFetchOpts
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2Mod {
  
  @JSImport("@pulumi/kubernetes/helm/v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/kubernetes/helm/v2", "Chart")
  @js.native
  class Chart protected ()
    extends typings.pulumiKubernetes.v2HelmMod.Chart {
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
  
  inline def fetch(chart: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(chart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fetch(chart: String, opts: ResolvedFetchOpts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(chart.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
