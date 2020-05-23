package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", JSImport.Namespace)
@js.native
object deploymentOnlyModuleMod extends js.Object {
  @js.native
  class Config protected ()
    extends typings.pulumiPulumi.deploymentOnlyModuleConfigMod.Config {
    def this(name: String) = this()
  }
  
  val deploymentOnlyModule: /* true */ Boolean = js.native
  def allConfig(): StringDictionary[String] = js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  def setConfig(k: String, v: String): Unit = js.native
}

