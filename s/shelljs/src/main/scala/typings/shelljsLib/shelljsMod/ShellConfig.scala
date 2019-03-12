package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellConfig extends js.Object {
  /**
    * Absolute path of the Node binary. Default is null (inferred).
    */
  var execPath: java.lang.String | scala.Null
  /**
    * If true the script will die on errors. Default is false.
    */
  var fatal: scala.Boolean
  /**
    * Passed to glob.sync() instead of the default options ({}).
    */
  var globOptions: globLib.globMod.GNs.IOptions
  /**
    * Suppresses all command output if true, except for echo() calls. Default is false.
    */
  var silent: scala.Boolean
  /**
    * Will print each executed command to the screen. Default is true.
    */
  var verbose: scala.Boolean
  /**
    * Reset shell.config to the defaults.
    */
  def reset(): scala.Unit
}

object ShellConfig {
  @scala.inline
  def apply(
    fatal: scala.Boolean,
    globOptions: globLib.globMod.GNs.IOptions,
    reset: () => scala.Unit,
    silent: scala.Boolean,
    verbose: scala.Boolean,
    execPath: java.lang.String = null
  ): ShellConfig = {
    val __obj = js.Dynamic.literal(fatal = fatal, globOptions = globOptions, reset = js.Any.fromFunction0(reset), silent = silent, verbose = verbose)
    if (execPath != null) __obj.updateDynamic("execPath")(execPath)
    __obj.asInstanceOf[ShellConfig]
  }
}

