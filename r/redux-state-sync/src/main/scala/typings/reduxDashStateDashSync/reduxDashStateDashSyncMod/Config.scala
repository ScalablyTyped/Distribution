package typings.reduxDashStateDashSync.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var broadcastChannelOption: js.UndefOr[js.Object | Null] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var predicate: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Boolean | Null]] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    blacklist: js.Array[String] = null,
    broadcastChannelOption: js.Object = null,
    channel: String = null,
    predicate: /* type */ js.UndefOr[String] => Boolean | Null = null,
    whitelist: js.Array[String] = null
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

