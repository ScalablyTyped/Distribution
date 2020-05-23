package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actcaller extends js.Object {
  // Trace action caller and place in args.caller$.
  var act_caller: js.UndefOr[Boolean] = js.undefined
  // Record and log callpoints (calling code locations).
  var callpoint: js.UndefOr[Boolean] = js.undefined
  // Throw (some) errors from seneca.act.
  var fragile: js.UndefOr[Boolean] = js.undefined
  // Print debug info to console
  var print: js.UndefOr[Options] = js.undefined
  // Shorten all identifiers to 2 characters.
  var short_logs: js.UndefOr[Boolean] = js.undefined
  // Fatal errors ... aren't fatal. Not for production!
  var undead: js.UndefOr[Boolean] = js.undefined
}

object Actcaller {
  @scala.inline
  def apply(
    act_caller: js.UndefOr[Boolean] = js.undefined,
    callpoint: js.UndefOr[Boolean] = js.undefined,
    fragile: js.UndefOr[Boolean] = js.undefined,
    print: Options = null,
    short_logs: js.UndefOr[Boolean] = js.undefined,
    undead: js.UndefOr[Boolean] = js.undefined
  ): Actcaller = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(act_caller)) __obj.updateDynamic("act_caller")(act_caller.get.asInstanceOf[js.Any])
    if (!js.isUndefined(callpoint)) __obj.updateDynamic("callpoint")(callpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragile)) __obj.updateDynamic("fragile")(fragile.get.asInstanceOf[js.Any])
    if (print != null) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (!js.isUndefined(short_logs)) __obj.updateDynamic("short_logs")(short_logs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(undead)) __obj.updateDynamic("undead")(undead.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actcaller]
  }
}

