package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationExtensionsClientOutputs extends js.Object {
  var appid: js.UndefOr[scala.Boolean] = js.undefined
  var authnSel: js.UndefOr[scala.Boolean] = js.undefined
  var exts: js.UndefOr[AuthenticationExtensionsSupported] = js.undefined
  var loc: js.UndefOr[Coordinates] = js.undefined
  var txAuthGeneric: js.UndefOr[ArrayBuffer] = js.undefined
  var txAuthSimple: js.UndefOr[java.lang.String] = js.undefined
  var uvi: js.UndefOr[ArrayBuffer] = js.undefined
  var uvm: js.UndefOr[UvmEntries] = js.undefined
}

object AuthenticationExtensionsClientOutputs {
  @scala.inline
  def apply(
    appid: js.UndefOr[scala.Boolean] = js.undefined,
    authnSel: js.UndefOr[scala.Boolean] = js.undefined,
    exts: AuthenticationExtensionsSupported = null,
    loc: Coordinates = null,
    txAuthGeneric: ArrayBuffer = null,
    txAuthSimple: java.lang.String = null,
    uvi: ArrayBuffer = null,
    uvm: UvmEntries = null
  ): AuthenticationExtensionsClientOutputs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appid)) __obj.updateDynamic("appid")(appid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(authnSel)) __obj.updateDynamic("authnSel")(authnSel.get.asInstanceOf[js.Any])
    if (exts != null) __obj.updateDynamic("exts")(exts.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (txAuthGeneric != null) __obj.updateDynamic("txAuthGeneric")(txAuthGeneric.asInstanceOf[js.Any])
    if (txAuthSimple != null) __obj.updateDynamic("txAuthSimple")(txAuthSimple.asInstanceOf[js.Any])
    if (uvi != null) __obj.updateDynamic("uvi")(uvi.asInstanceOf[js.Any])
    if (uvm != null) __obj.updateDynamic("uvm")(uvm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
}

