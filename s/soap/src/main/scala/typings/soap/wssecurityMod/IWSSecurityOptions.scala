package typings.soap.wssecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWSSecurityOptions extends js.Object {
  var actor: js.UndefOr[String] = js.undefined
  var hasNonce: js.UndefOr[Boolean] = js.undefined
  var hasTimeStamp: js.UndefOr[Boolean] = js.undefined
  var hasTokenCreated: js.UndefOr[Boolean] = js.undefined
  var mustUnderstand: js.UndefOr[js.Any] = js.undefined
  var passwordType: js.UndefOr[String] = js.undefined
}

object IWSSecurityOptions {
  @scala.inline
  def apply(
    actor: String = null,
    hasNonce: js.UndefOr[Boolean] = js.undefined,
    hasTimeStamp: js.UndefOr[Boolean] = js.undefined,
    hasTokenCreated: js.UndefOr[Boolean] = js.undefined,
    mustUnderstand: js.Any = null,
    passwordType: String = null
  ): IWSSecurityOptions = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNonce)) __obj.updateDynamic("hasNonce")(hasNonce.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTimeStamp)) __obj.updateDynamic("hasTimeStamp")(hasTimeStamp.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTokenCreated)) __obj.updateDynamic("hasTokenCreated")(hasTokenCreated.asInstanceOf[js.Any])
    if (mustUnderstand != null) __obj.updateDynamic("mustUnderstand")(mustUnderstand.asInstanceOf[js.Any])
    if (passwordType != null) __obj.updateDynamic("passwordType")(passwordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWSSecurityOptions]
  }
}

