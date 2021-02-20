package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentOnlyModuleMod {
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "Config")
  @js.native
  class Config protected ()
    extends typings.pulumiPulumi.deploymentOnlyModuleConfigMod.Config {
    def this(name: String) = this()
  }
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "allConfig")
  @js.native
  def allConfig(): StringDictionary[String] = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "deploymentOnlyModule")
  @js.native
  val deploymentOnlyModule: /* true */ Boolean = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "getConfig")
  @js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "setConfig")
  @js.native
  def setConfig(k: String, v: String): Unit = js.native
}
