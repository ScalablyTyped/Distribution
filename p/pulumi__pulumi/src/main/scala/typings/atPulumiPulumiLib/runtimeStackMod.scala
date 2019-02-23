package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
@js.native
object runtimeStackMod extends js.Object {
  val rootPulumiStackTypeName: /* pulumi:pulumi:Stack */ java.lang.String = js.native
  def runInPulumiStack(init: js.Function0[_]): js.Promise[js.UndefOr[atPulumiPulumiLib.outputMod.Inputs]] = js.native
}

