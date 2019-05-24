package typings
package soapLib.libSecurityWSSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWSSecurityOptions extends js.Object {
  var actor: js.UndefOr[java.lang.String] = js.undefined
  var hasNonce: js.UndefOr[scala.Boolean] = js.undefined
  var hasTimeStamp: js.UndefOr[scala.Boolean] = js.undefined
  var hasTokenCreated: js.UndefOr[scala.Boolean] = js.undefined
  var mustUnderstand: js.UndefOr[js.Any] = js.undefined
  var passwordType: js.UndefOr[java.lang.String] = js.undefined
}

object IWSSecurityOptions {
  @scala.inline
  def apply(
    actor: java.lang.String = null,
    hasNonce: js.UndefOr[scala.Boolean] = js.undefined,
    hasTimeStamp: js.UndefOr[scala.Boolean] = js.undefined,
    hasTokenCreated: js.UndefOr[scala.Boolean] = js.undefined,
    mustUnderstand: js.Any = null,
    passwordType: java.lang.String = null
  ): IWSSecurityOptions = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (!js.isUndefined(hasNonce)) __obj.updateDynamic("hasNonce")(hasNonce)
    if (!js.isUndefined(hasTimeStamp)) __obj.updateDynamic("hasTimeStamp")(hasTimeStamp)
    if (!js.isUndefined(hasTokenCreated)) __obj.updateDynamic("hasTokenCreated")(hasTokenCreated)
    if (mustUnderstand != null) __obj.updateDynamic("mustUnderstand")(mustUnderstand)
    if (passwordType != null) __obj.updateDynamic("passwordType")(passwordType)
    __obj.asInstanceOf[IWSSecurityOptions]
  }
}

