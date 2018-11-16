package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/config", JSImport.Namespace)
@js.native
object runtimeConfigMod extends js.Object {
  def allConfig(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getConfig(k: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def setConfig(k: java.lang.String, v: java.lang.String): scala.Unit = js.native
}

