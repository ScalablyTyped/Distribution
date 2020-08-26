package typings.reduxPersist.getStoredStateMigrateV4Mod

import typings.reduxPersist.typesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V4Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var keyPrefix: js.UndefOr[String] = js.native
  var storage: js.UndefOr[V4Storage] = js.native
  var transforms: js.UndefOr[js.Array[Transform[_, _, _, _]]] = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object V4Config {
  @scala.inline
  def apply(): V4Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V4Config]
  }
  @scala.inline
  implicit class V4ConfigOps[Self <: V4Config] (val x: Self) extends AnyVal {
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
    def setKeyPrefix(value: String): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    @scala.inline
    def setStorage(value: V4Storage): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: (Transform[js.Any, js.Any, js.Any, js.Any])*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Transform[_, _, _, _]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
  
}

