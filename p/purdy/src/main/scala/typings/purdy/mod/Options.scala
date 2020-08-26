package typings.purdy.mod

import typings.purdy.purdyStrings.left
import typings.purdy.purdyStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var align: js.UndefOr[left | right] = js.native
  var arrayIndex: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Double | Null] = js.native
  var indent: js.UndefOr[Double] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[Boolean] = js.native
  var pathPrefix: js.UndefOr[String] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var proto: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setArrayIndex(value: Boolean): Self = this.set("arrayIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayIndex: Self = this.set("arrayIndex", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDepthNull: Self = this.set("depth", null)
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setPath(value: Boolean): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPathPrefix(value: String): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathPrefix: Self = this.set("pathPrefix", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setProto(value: Boolean): Self = this.set("proto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProto: Self = this.set("proto", js.undefined)
  }
  
}

