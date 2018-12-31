package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOptions
  extends nodeLib.childUnderscoreProcessMod.ExecOptions {
  /** Asynchronous execution. If a callback is provided, it will be set to true, regardless of the passed value (default: false). */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** Character encoding to use. Affects the values returned to stdout and stderr, and what is written to stdout and stderr when not in silent mode (default: 'utf8'). */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** Do not echo program output to console (default: false). */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

