package typings.pulumiPulumi.runPolicyPackRunMod

import typings.minimist.mod.ParsedArgs
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOpts extends js.Object {
  var argv: ParsedArgs
  var runInStack: Boolean
  var typeScript: Boolean
  def programStarted(): Unit
  def reportLoggedError(err: Error): Unit
}

object RunOpts {
  @scala.inline
  def apply(
    argv: ParsedArgs,
    programStarted: () => Unit,
    reportLoggedError: Error => Unit,
    runInStack: Boolean,
    typeScript: Boolean
  ): RunOpts = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], programStarted = js.Any.fromFunction0(programStarted), reportLoggedError = js.Any.fromFunction1(reportLoggedError), runInStack = runInStack.asInstanceOf[js.Any], typeScript = typeScript.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunOpts]
  }
}

