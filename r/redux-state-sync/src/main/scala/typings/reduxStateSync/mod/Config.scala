package typings.reduxStateSync.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var broadcastChannelOption: js.UndefOr[js.Object | Null] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var predicate: js.UndefOr[js.Function1[/* action */ AnyAction, Boolean | Null]] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    blacklist: js.Array[String] = null,
    broadcastChannelOption: js.Object = null,
    channel: String = null,
    predicate: /* action */ AnyAction => Boolean | Null = null,
    whitelist: js.Array[String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (broadcastChannelOption != null) __obj.updateDynamic("broadcastChannelOption")(broadcastChannelOption.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

