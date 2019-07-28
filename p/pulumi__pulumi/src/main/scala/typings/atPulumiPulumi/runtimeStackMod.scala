package typings.atPulumiPulumi

import typings.atPulumiPulumi.atPulumiPulumiStrings.`pulumi:pulumi:Stack`
import typings.atPulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
@js.native
object runtimeStackMod extends js.Object {
  val rootPulumiStackTypeName: `pulumi:pulumi:Stack` = js.native
  def runInPulumiStack(init: js.Function0[_]): js.Promise[js.UndefOr[Inputs]] = js.native
}

