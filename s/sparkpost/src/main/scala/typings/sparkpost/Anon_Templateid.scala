package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Templateid extends js.Object {
  var template_id: String
  var use_draft_template: js.UndefOr[Boolean] = js.undefined
}

object Anon_Templateid {
  @scala.inline
  def apply(template_id: String, use_draft_template: js.UndefOr[Boolean] = js.undefined): Anon_Templateid = {
    val __obj = js.Dynamic.literal(template_id = template_id)
    if (!js.isUndefined(use_draft_template)) __obj.updateDynamic("use_draft_template")(use_draft_template)
    __obj.asInstanceOf[Anon_Templateid]
  }
}

