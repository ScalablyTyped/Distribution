package typings.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * Domain where to set a cookie in case it's needed for that environment
    */
  var DOMAIN: String = js.native
  /**
    * URL where to reach the GoodData service API
    */
  var GOODDATA_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the merchant management service API
    */
  var MERCHANT_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the module service API
    */
  var MODULE_SERVICE: js.UndefOr[String] = js.native
  /**
    * Name of the environment
    */
  var NAME: String = js.native
  /**
    * In case that the domain is localhost, a port can be also specified
    */
  var PORT: js.UndefOr[String] = js.native
  /**
    * URL where to reach the token management service API
    */
  var TOKEN_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the frontend of the environment
    */
  var URL: String = js.native
  /**
    * URL where to reach the user management service API
    */
  var USER_SERVICE: js.UndefOr[String] = js.native
  /**
    * URL where to reach the new user service API
    */
  var USER_SERVICE_NEW: js.UndefOr[String] = js.native
}

object Environment {
  @scala.inline
  def apply(DOMAIN: String, NAME: String, URL: String): Environment = {
    val __obj = js.Dynamic.literal(DOMAIN = DOMAIN.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
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
    def setDOMAIN(value: String): Self = this.set("DOMAIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNAME(value: String): Self = this.set("NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setGOODDATA_SERVICE(value: String): Self = this.set("GOODDATA_SERVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGOODDATA_SERVICE: Self = this.set("GOODDATA_SERVICE", js.undefined)
    @scala.inline
    def setMERCHANT_SERVICE(value: String): Self = this.set("MERCHANT_SERVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMERCHANT_SERVICE: Self = this.set("MERCHANT_SERVICE", js.undefined)
    @scala.inline
    def setMODULE_SERVICE(value: String): Self = this.set("MODULE_SERVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMODULE_SERVICE: Self = this.set("MODULE_SERVICE", js.undefined)
    @scala.inline
    def setPORT(value: String): Self = this.set("PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePORT: Self = this.set("PORT", js.undefined)
    @scala.inline
    def setTOKEN_SERVICE(value: String): Self = this.set("TOKEN_SERVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTOKEN_SERVICE: Self = this.set("TOKEN_SERVICE", js.undefined)
    @scala.inline
    def setUSER_SERVICE(value: String): Self = this.set("USER_SERVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUSER_SERVICE: Self = this.set("USER_SERVICE", js.undefined)
    @scala.inline
    def setUSER_SERVICE_NEW(value: String): Self = this.set("USER_SERVICE_NEW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUSER_SERVICE_NEW: Self = this.set("USER_SERVICE_NEW", js.undefined)
  }
  
}

