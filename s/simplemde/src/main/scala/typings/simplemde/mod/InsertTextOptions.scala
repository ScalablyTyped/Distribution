package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTextOptions extends js.Object {
  var horizontalRule: js.UndefOr[js.Array[String]] = js.native
  var image: js.UndefOr[js.Array[String]] = js.native
  var link: js.UndefOr[js.Array[String]] = js.native
  var table: js.UndefOr[js.Array[String]] = js.native
}

object InsertTextOptions {
  @scala.inline
  def apply(): InsertTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTextOptions]
  }
  @scala.inline
  implicit class InsertTextOptionsOps[Self <: InsertTextOptions] (val x: Self) extends AnyVal {
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
    def setHorizontalRuleVarargs(value: String*): Self = this.set("horizontalRule", js.Array(value :_*))
    @scala.inline
    def setHorizontalRule(value: js.Array[String]): Self = this.set("horizontalRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalRule: Self = this.set("horizontalRule", js.undefined)
    @scala.inline
    def setImageVarargs(value: String*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: js.Array[String]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLinkVarargs(value: String*): Self = this.set("link", js.Array(value :_*))
    @scala.inline
    def setLink(value: js.Array[String]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setTableVarargs(value: String*): Self = this.set("table", js.Array(value :_*))
    @scala.inline
    def setTable(value: js.Array[String]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

