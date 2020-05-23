package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Campaignid extends js.Object {
  var campaign_id: js.UndefOr[String] = js.undefined
  var template_id: js.UndefOr[String] = js.undefined
}

object Campaignid {
  @scala.inline
  def apply(campaign_id: String = null, template_id: String = null): Campaignid = {
    val __obj = js.Dynamic.literal()
    if (campaign_id != null) __obj.updateDynamic("campaign_id")(campaign_id.asInstanceOf[js.Any])
    if (template_id != null) __obj.updateDynamic("template_id")(template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Campaignid]
  }
}

