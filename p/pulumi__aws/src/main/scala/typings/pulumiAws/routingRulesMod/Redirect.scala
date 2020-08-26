package typings.pulumiAws.routingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  /**
    * The hostname to be used in the Location header that is returned in the response.
    *
    * If another property is set, `HostName` is not required.
    */
  var HostName: js.UndefOr[String] = js.native
  /**
    * The HTTP redirect code to be used in the Location header that is returned in the response.
    *
    * If another property is set, `HttpRedirectCode` is not required.
    */
  var HttpRedirectCode: js.UndefOr[String] = js.native
  /**
    * The protocol, http or https, to be used in the Location header that is returned in the response.
    *
    * If another property is set, `Protocol` is not required.
    */
  var Protocol: js.UndefOr[String] = js.native
  /**
    * The prefix of the object key name that replaces the value of `KeyPrefixEquals` in the redirect request.
    *
    * If another property is set, `ReplaceKeyPrefixWith` is not required.
    * It can be set only if `ReplaceKeyWith` is not set.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[String] = js.native
  /**
    * The object key to be used in the Location header that is returned in the response.
    *
    * If another property is set, `ReplaceKeyWith` is not required.
    * It can be set only if `ReplaceKeyPrefixWith` is not set.
    */
  var ReplaceKeyWith: js.UndefOr[String] = js.native
}

object Redirect {
  @scala.inline
  def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
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
    def setHostName(value: String): Self = this.set("HostName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostName: Self = this.set("HostName", js.undefined)
    @scala.inline
    def setHttpRedirectCode(value: String): Self = this.set("HttpRedirectCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRedirectCode: Self = this.set("HttpRedirectCode", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setReplaceKeyPrefixWith(value: String): Self = this.set("ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceKeyPrefixWith: Self = this.set("ReplaceKeyPrefixWith", js.undefined)
    @scala.inline
    def setReplaceKeyWith(value: String): Self = this.set("ReplaceKeyWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceKeyWith: Self = this.set("ReplaceKeyWith", js.undefined)
  }
  
}

