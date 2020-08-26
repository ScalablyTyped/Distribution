package typings.shopifyPrime.clientDetailsMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDetails extends ShopifyObject {
  /**
    * Shopify does not offer documentation for this field.
    */
  var accept_language: js.UndefOr[String] = js.native
  /**
    *  The browser screen height in pixels, if available.
    */
  var browser_height: js.UndefOr[String] = js.native
  /**
    *  The browser IP address.
    */
  var browser_ip: js.UndefOr[String] = js.native
  /**
    *  The browser screen width in pixels, if available.
    */
  var browser_width: js.UndefOr[String] = js.native
  /**
    *  A hash of the session.
    */
  var session_height: js.UndefOr[String] = js.native
  /**
    *  The browser's user agent string.
    */
  var user_agent: js.UndefOr[String] = js.native
}

object ClientDetails {
  @scala.inline
  def apply(): ClientDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientDetails]
  }
  @scala.inline
  implicit class ClientDetailsOps[Self <: ClientDetails] (val x: Self) extends AnyVal {
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
    def setAccept_language(value: String): Self = this.set("accept_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept_language: Self = this.set("accept_language", js.undefined)
    @scala.inline
    def setBrowser_height(value: String): Self = this.set("browser_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_height: Self = this.set("browser_height", js.undefined)
    @scala.inline
    def setBrowser_ip(value: String): Self = this.set("browser_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_ip: Self = this.set("browser_ip", js.undefined)
    @scala.inline
    def setBrowser_width(value: String): Self = this.set("browser_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_width: Self = this.set("browser_width", js.undefined)
    @scala.inline
    def setSession_height(value: String): Self = this.set("session_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_height: Self = this.set("session_height", js.undefined)
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_agent: Self = this.set("user_agent", js.undefined)
  }
  
}

