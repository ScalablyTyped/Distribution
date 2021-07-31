package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentOnlyModuleMod {
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "Config")
  @js.native
  class Config protected ()
    extends typings.pulumiPulumi.deploymentOnlyModuleConfigMod.Config {
    def this(name: String) = this()
  }
  
  @scala.inline
  def allConfig(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConfig")().asInstanceOf[StringDictionary[String]]
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", "deploymentOnlyModule")
  @js.native
  val deploymentOnlyModule: /* true */ Boolean = js.native
  
  @scala.inline
  def getConfig(k: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(k.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def setConfig(k: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
