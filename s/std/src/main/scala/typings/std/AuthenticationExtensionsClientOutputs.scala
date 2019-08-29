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
    if (!js.isUndefined(appid)) __obj.updateDynamic("appid")(appid)
    if (!js.isUndefined(authnSel)) __obj.updateDynamic("authnSel")(authnSel)
    if (exts != null) __obj.updateDynamic("exts")(exts)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (txAuthGeneric != null) __obj.updateDynamic("txAuthGeneric")(txAuthGeneric)
    if (txAuthSimple != null) __obj.updateDynamic("txAuthSimple")(txAuthSimple)
    if (uvi != null) __obj.updateDynamic("uvi")(uvi)
    if (uvm != null) __obj.updateDynamic("uvm")(uvm)
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
}

