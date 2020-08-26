package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templateid extends js.Object {
  var template_id: String = js.native
  var use_draft_template: js.UndefOr[Boolean] = js.native
}

object Templateid {
  @scala.inline
  def apply(template_id: String): Templateid = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templateid]
  }
  @scala.inline
  implicit class TemplateidOps[Self <: Templateid] (val x: Self) extends AnyVal {
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
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse_draft_template(value: Boolean): Self = this.set("use_draft_template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_draft_template: Self = this.set("use_draft_template", js.undefined)
  }
  
}

