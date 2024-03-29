package typings.pulumiKubernetes

import typings.pulumiKubernetes.v3HelmMod.ChartOpts
import typings.pulumiKubernetes.v3HelmMod.LocalChartOpts
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v3Mod {
  
  @JSImport("@pulumi/kubernetes/helm/v3", "Chart")
  @js.native
  class Chart protected ()
    extends typings.pulumiKubernetes.v3HelmMod.Chart {
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
}
