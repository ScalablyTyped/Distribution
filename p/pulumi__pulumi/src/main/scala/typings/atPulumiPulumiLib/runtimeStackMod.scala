package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
@js.native
object runtimeStackMod extends js.Object {
  val rootPulumiStackTypeName: atPulumiPulumiLib.atPulumiPulumiLibStrings.`pulumi:pulumi:Stack` = js.native
  def runInPulumiStack(init: js.Function0[_]): js.Promise[js.UndefOr[atPulumiPulumiLib.outputMod.Inputs]] = js.native
}

