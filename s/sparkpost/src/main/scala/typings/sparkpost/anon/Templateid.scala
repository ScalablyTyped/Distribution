package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templateid extends js.Object {
  var template_id: String
  var use_draft_template: js.UndefOr[Boolean] = js.undefined
}

object Templateid {
  @scala.inline
  def apply(template_id: String, use_draft_template: js.UndefOr[Boolean] = js.undefined): Templateid = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    if (!js.isUndefined(use_draft_template)) __obj.updateDynamic("use_draft_template")(use_draft_template.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templateid]
  }
}

