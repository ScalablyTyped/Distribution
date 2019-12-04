package typings.atPulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/tests/runtime/deploymentOnlyModule", JSImport.Namespace)
@js.native
object testsRuntimeDeploymentOnlyModuleMod extends js.Object {
  @js.native
  class Config protected ()
    extends typings.atPulumiPulumi.testsRuntimeDeploymentOnlyModuleConfigMod.Config {
    def this(name: String) = this()
  }
  
  val deploymentOnlyModule: `true` = js.native
  def allConfig(): StringDictionary[String] = js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  def setConfig(k: String, v: String): Unit = js.native
}

