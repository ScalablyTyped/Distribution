package typings.pulumiPulumi

import typings.minimist.mod.ParsedArgs
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/cmd/run/run", JSImport.Namespace)
@js.native
object runRunMod extends js.Object {
  def run(
    argv: ParsedArgs,
    programStarted: js.Function0[Unit],
    reportLoggedError: js.Function1[/* err */ Error, Unit]
  ): js.Promise[js.UndefOr[Record[String, _]]] = js.native
}

