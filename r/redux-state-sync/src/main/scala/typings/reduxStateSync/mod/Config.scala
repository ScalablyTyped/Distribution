package typings.reduxStateSync.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var broadcastChannelOption: js.UndefOr[js.Object | Null] = js.native
  var channel: js.UndefOr[String] = js.native
  var predicate: js.UndefOr[js.Function1[/* action */ AnyAction, Boolean | Null]] = js.native
  var prepareState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    @scala.inline
    def setBroadcastChannelOption(value: js.Object): Self = this.set("broadcastChannelOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcastChannelOption: Self = this.set("broadcastChannelOption", js.undefined)
    @scala.inline
    def setBroadcastChannelOptionNull: Self = this.set("broadcastChannelOption", null)
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setPredicate(value: /* action */ AnyAction => Boolean | Null): Self = this.set("predicate", js.Any.fromFunction1(value))
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    @scala.inline
    def setPrepareState(value: /* state */ js.Any => _): Self = this.set("prepareState", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrepareState: Self = this.set("prepareState", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
  
}

