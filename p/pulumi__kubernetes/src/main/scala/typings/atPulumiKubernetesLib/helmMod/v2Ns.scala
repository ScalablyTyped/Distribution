package typings
package atPulumiKubernetesLib.helmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm", "v2")
@js.native
object v2Ns extends js.Object {
  @js.native
  class Chart protected ()
    extends atPulumiKubernetesLib.kubernetesMod.yamlNs.CollectionComponentResource {
    def this(releaseName: java.lang.String, config: ChartOpts) = this()
    def this(releaseName: java.lang.String, config: ChartOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    def parseTemplate(yamlStream: java.lang.String, config: ChartOpts): ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.CustomResource] = js.native
  }
  
  
  trait ChartOpts extends js.Object {
    var chart: java.lang.String
    var fetchOpts: js.UndefOr[atPulumiKubernetesLib.helmMod.FetchOpts] = js.undefined
    var namespace: js.UndefOr[java.lang.String] = js.undefined
    var repo: java.lang.String
    var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
    var values: js.UndefOr[js.Any] = js.undefined
    var version: java.lang.String
  }
  
}

