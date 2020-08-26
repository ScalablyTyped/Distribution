package typings.rollup.mod

import typings.rollup.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupLogProps extends js.Object {
  var code: js.UndefOr[String] = js.native
  var frame: js.UndefOr[String] = js.native
  var hook: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var loc: js.UndefOr[Column] = js.native
  var message: String = js.native
  var name: js.UndefOr[String] = js.native
  var plugin: js.UndefOr[String] = js.native
  var pluginCode: js.UndefOr[String] = js.native
  var pos: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object RollupLogProps {
  @scala.inline
  def apply(message: String): RollupLogProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupLogProps]
  }
  @scala.inline
  implicit class RollupLogPropsOps[Self <: RollupLogProps] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setFrame(value: String): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setHook(value: String): Self = this.set("hook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLoc(value: Column): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setPluginCode(value: String): Self = this.set("pluginCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginCode: Self = this.set("pluginCode", js.undefined)
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

