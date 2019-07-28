package typings.shelljs.shelljsMod

import typings.glob.globMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellConfig extends js.Object {
  /**
  	 * Absolute path of the Node binary. Default is null (inferred).
  	 */
  var execPath: String | Null
  /**
  	 * If true the script will die on errors. Default is false.
  	 */
  var fatal: Boolean
  /**
  	 * Passed to glob.sync() instead of the default options ({}).
  	 */
  var globOptions: IOptions
  /**
  	 * Suppresses all command output if true, except for echo() calls. Default is false.
  	 */
  var silent: Boolean
  /**
  	 * Will print each executed command to the screen. Default is true.
  	 */
  var verbose: Boolean
  /**
  	 * Reset shell.config to the defaults.
  	 */
  def reset(): Unit
}

object ShellConfig {
  @scala.inline
  def apply(
    fatal: Boolean,
    globOptions: IOptions,
    reset: () => Unit,
    silent: Boolean,
    verbose: Boolean,
    execPath: String = null
  ): ShellConfig = {
    val __obj = js.Dynamic.literal(fatal = fatal, globOptions = globOptions, reset = js.Any.fromFunction0(reset), silent = silent, verbose = verbose)
    if (execPath != null) __obj.updateDynamic("execPath")(execPath)
    __obj.asInstanceOf[ShellConfig]
  }
}

