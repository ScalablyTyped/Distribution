package typings.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalFieldOpts extends js.Object {
  var as: js.UndefOr[String] = js.native
  var relatedName: js.UndefOr[String] = js.native
  var through: js.UndefOr[String] = js.native
  var throughFields: js.UndefOr[js.Tuple2[String, String]] = js.native
  var to: String = js.native
}

object RelationalFieldOpts {
  @scala.inline
  def apply(to: String): RelationalFieldOpts = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalFieldOpts]
  }
  @scala.inline
  implicit class RelationalFieldOptsOps[Self <: RelationalFieldOpts] (val x: Self) extends AnyVal {
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setRelatedName(value: String): Self = this.set("relatedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedName: Self = this.set("relatedName", js.undefined)
    @scala.inline
    def setThrough(value: String): Self = this.set("through", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrough: Self = this.set("through", js.undefined)
    @scala.inline
    def setThroughFields(value: js.Tuple2[String, String]): Self = this.set("throughFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThroughFields: Self = this.set("throughFields", js.undefined)
  }
  
}

