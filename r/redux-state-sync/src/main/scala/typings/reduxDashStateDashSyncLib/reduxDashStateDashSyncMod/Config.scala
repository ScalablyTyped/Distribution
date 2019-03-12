package typings
package reduxDashStateDashSyncLib.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var broadcastChannelOption: js.UndefOr[js.Object | scala.Null] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var predicate: js.UndefOr[
    js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Boolean | scala.Null]
  ] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    blacklist: js.Array[java.lang.String] = null,
    broadcastChannelOption: js.Object = null,
    channel: java.lang.String = null,
    predicate: /* type */ js.UndefOr[java.lang.String] => scala.Boolean | scala.Null = null,
    whitelist: js.Array[java.lang.String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (broadcastChannelOption != null) __obj.updateDynamic("broadcastChannelOption")(broadcastChannelOption)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[Config]
  }
}

