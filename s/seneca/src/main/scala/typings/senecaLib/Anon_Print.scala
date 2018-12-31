package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Print extends js.Object {
  // Trace action caller and place in args.caller$.
  var act_caller: js.UndefOr[scala.Boolean] = js.undefined
  // Record and log callpoints (calling code locations).
  var callpoint: js.UndefOr[scala.Boolean] = js.undefined
  // Throw (some) errors from seneca.act.
  var fragile: js.UndefOr[scala.Boolean] = js.undefined
  // Print debug info to console
  var print: js.UndefOr[Anon_Options] = js.undefined
  // Shorten all identifiers to 2 characters.
  var short_logs: js.UndefOr[scala.Boolean] = js.undefined
  // Fatal errors ... aren't fatal. Not for production!
  var undead: js.UndefOr[scala.Boolean] = js.undefined
}

