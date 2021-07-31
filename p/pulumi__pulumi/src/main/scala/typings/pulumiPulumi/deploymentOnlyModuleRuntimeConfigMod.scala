package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentOnlyModuleRuntimeConfigMod {
  
  @JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule/runtimeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def allConfig(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConfig")().asInstanceOf[StringDictionary[String]]
  
  @scala.inline
  def getConfig(k: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(k.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def setConfig(k: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
