package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTemplateid extends js.Object {
  var template_id: String
  var use_draft_template: js.UndefOr[Boolean] = js.undefined
}

object AnonTemplateid {
  @scala.inline
  def apply(template_id: String, use_draft_template: js.UndefOr[Boolean] = js.undefined): AnonTemplateid = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    if (!js.isUndefined(use_draft_template)) __obj.updateDynamic("use_draft_template")(use_draft_template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTemplateid]
  }
}

