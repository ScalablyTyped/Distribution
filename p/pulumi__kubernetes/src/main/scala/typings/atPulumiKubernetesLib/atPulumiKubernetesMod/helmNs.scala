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
    @js.native
    class Chart protected ()
      extends atPulumiKubernetesLib.helmMod.v2Ns.Chart {
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.ChartOpts) = this()
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.LocalChartOpts) = this()
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.ChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
      def this(releaseName: java.lang.String, config: atPulumiKubernetesLib.helmMod.v2Ns.LocalChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    }
    
  }
  
}

