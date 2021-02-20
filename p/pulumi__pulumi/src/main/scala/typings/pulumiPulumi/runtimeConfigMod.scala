package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigMod {
  
  @JSImport("@pulumi/pulumi/runtime/config", "allConfig")
  @js.native
  def allConfig(): StringDictionary[String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/config", "getConfig")
  @js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/config", "setAllConfig")
  @js.native
  def setAllConfig(c: StringDictionary[String]): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/config", "setConfig")
  @js.native
  def setConfig(k: String, v: String): Unit = js.native
}
