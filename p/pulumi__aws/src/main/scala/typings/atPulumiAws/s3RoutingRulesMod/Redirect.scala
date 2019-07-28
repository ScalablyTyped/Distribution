package typings.atPulumiAws.s3RoutingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  /**
    * The hostname to be used in the Location header that is returned in the response.
    *
    * If another property is set, `HostName` is not required.
    */
  var HostName: js.UndefOr[String] = js.undefined
  /**
    * The HTTP redirect code to be used in the Location header that is returned in the response.
    *
    * If another property is set, `HttpRedirectCode` is not required.
    */
  var HttpRedirectCode: js.UndefOr[String] = js.undefined
  /**
    * The protocol, http or https, to be used in the Location header that is returned in the response.
    *
    * If another property is set, `Protocol` is not required.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  /**
    * The prefix of the object key name that replaces the value of `KeyPrefixEquals` in the redirect request.
    *
    * If another property is set, `ReplaceKeyPrefixWith` is not required.
    * It can be set only if `ReplaceKeyWith` is not set.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[String] = js.undefined
  /**
    * The object key to be used in the Location header that is returned in the response.
    *
    * If another property is set, `ReplaceKeyWith` is not required.
    * It can be set only if `ReplaceKeyPrefixWith` is not set.
    */
  var ReplaceKeyWith: js.UndefOr[String] = js.undefined
}

object Redirect {
  @scala.inline
  def apply(
    HostName: String = null,
    HttpRedirectCode: String = null,
    Protocol: String = null,
    ReplaceKeyPrefixWith: String = null,
    ReplaceKeyWith: String = null
  ): Redirect = {
    val __obj = js.Dynamic.literal()
    if (HostName != null) __obj.updateDynamic("HostName")(HostName)
    if (HttpRedirectCode != null) __obj.updateDynamic("HttpRedirectCode")(HttpRedirectCode)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol)
    if (ReplaceKeyPrefixWith != null) __obj.updateDynamic("ReplaceKeyPrefixWith")(ReplaceKeyPrefixWith)
    if (ReplaceKeyWith != null) __obj.updateDynamic("ReplaceKeyWith")(ReplaceKeyWith)
    __obj.asInstanceOf[Redirect]
  }
}

