package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainAdvancedSecurityOptionsMasterUserOptions extends js.Object {
  /**
    * ARN for the master user. Only specify if `internalUserDatabaseEnabled` is not set or set to `false`)
    */
  var masterUserArn: js.UndefOr[String] = js.native
  /**
    * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internalUserDatabaseEnabled` is set to `true`.
    */
  var masterUserName: js.UndefOr[String] = js.native
  /**
    * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internalUserDatabaseEnabled` is set to `true`.
    */
  var masterUserPassword: js.UndefOr[String] = js.native
}

object DomainAdvancedSecurityOptionsMasterUserOptions {
  @scala.inline
  def apply(): DomainAdvancedSecurityOptionsMasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainAdvancedSecurityOptionsMasterUserOptions]
  }
  @scala.inline
  implicit class DomainAdvancedSecurityOptionsMasterUserOptionsOps[Self <: DomainAdvancedSecurityOptionsMasterUserOptions] (val x: Self) extends AnyVal {
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
    def setMasterUserArn(value: String): Self = this.set("masterUserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserArn: Self = this.set("masterUserArn", js.undefined)
    @scala.inline
    def setMasterUserName(value: String): Self = this.set("masterUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserName: Self = this.set("masterUserName", js.undefined)
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("masterUserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("masterUserPassword", js.undefined)
  }
  
}

