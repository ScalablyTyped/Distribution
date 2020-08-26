package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaignid extends js.Object {
  var campaign_id: js.UndefOr[String] = js.native
  var template_id: js.UndefOr[String] = js.native
}

object Campaignid {
  @scala.inline
  def apply(): Campaignid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaignid]
  }
  @scala.inline
  implicit class CampaignidOps[Self <: Campaignid] (val x: Self) extends AnyVal {
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
    def setCampaign_id(value: String): Self = this.set("campaign_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaign_id: Self = this.set("campaign_id", js.undefined)
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_id: Self = this.set("template_id", js.undefined)
  }
  
}

