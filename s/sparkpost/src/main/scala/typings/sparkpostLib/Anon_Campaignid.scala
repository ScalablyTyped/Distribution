package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Campaignid extends js.Object {
  var campaign_id: js.UndefOr[java.lang.String] = js.undefined
  var template_id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Campaignid {
  @scala.inline
  def apply(campaign_id: java.lang.String = null, template_id: java.lang.String = null): Anon_Campaignid = {
    val __obj = js.Dynamic.literal()
    if (campaign_id != null) __obj.updateDynamic("campaign_id")(campaign_id)
    if (template_id != null) __obj.updateDynamic("template_id")(template_id)
    __obj.asInstanceOf[Anon_Campaignid]
  }
}

