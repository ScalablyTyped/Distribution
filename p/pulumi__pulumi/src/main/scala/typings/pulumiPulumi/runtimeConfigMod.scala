package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/config", JSImport.Namespace)
@js.native
object runtimeConfigMod extends js.Object {
  
  def allConfig(): StringDictionary[String] = js.native
  
  def getConfig(k: String): js.UndefOr[String] = js.native
  
  def setAllConfig(c: StringDictionary[String]): Unit = js.native
  
  def setConfig(k: String, v: String): Unit = js.native
}
