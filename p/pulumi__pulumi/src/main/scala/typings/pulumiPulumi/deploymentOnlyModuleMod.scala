package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", JSImport.Namespace)
@js.native
object deploymentOnlyModuleMod extends js.Object {
  
  def allConfig(): StringDictionary[String] = js.native
  
  val deploymentOnlyModule: /* true */ Boolean = js.native
  
  def getConfig(k: String): js.UndefOr[String] = js.native
  
  def setConfig(k: String, v: String): Unit = js.native
  
  @js.native
  class Config protected ()
    extends typings.pulumiPulumi.deploymentOnlyModuleConfigMod.Config {
    def this(name: String) = this()
  }
}
