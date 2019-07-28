package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/utilities", JSImport.Namespace)
@js.native
object utilitiesMod extends js.Object {
  def getEnv(vars: String*): js.UndefOr[String] = js.native
  def getEnvBoolean(vars: String*): js.UndefOr[Boolean] = js.native
  def getEnvNumber(vars: String*): js.UndefOr[Double] = js.native
  def getVersion(): String = js.native
}

