package typings.atPulumiKubernetes.helmV2Mod

import typings.atPulumiKubernetes.Anon_Kind
import typings.atPulumiKubernetes.helmV2HelmMod.ResolvedFetchOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/helm/v2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fetch(chart: String): Unit = js.native
  def fetch(chart: String, opts: ResolvedFetchOpts): Unit = js.native
  def helmSort(a: Anon_Kind, b: Anon_Kind): Double = js.native
}

