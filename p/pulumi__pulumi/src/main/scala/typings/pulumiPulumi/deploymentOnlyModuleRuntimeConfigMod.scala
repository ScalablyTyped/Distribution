package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentOnlyModuleRuntimeConfigMod {
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule/runtimeConfig", "allConfig")
  @js.native
  def allConfig(): StringDictionary[String] = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule/runtimeConfig", "getConfig")
  @js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule/runtimeConfig", "setConfig")
  @js.native
  def setConfig(k: String, v: String): Unit = js.native
}
