package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptHTMLAttributes[T] extends HTMLAttributes[T] {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var charSet: js.UndefOr[java.lang.String] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var noModule: js.UndefOr[scala.Boolean] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ScriptHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    charSet: java.lang.String = null,
    crossOrigin: java.lang.String = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    integrity: java.lang.String = null,
    noModule: js.UndefOr[scala.Boolean] = js.undefined,
    nonce: java.lang.String = null,
    src: java.lang.String = null,
    `type`: java.lang.String = null
  ): ScriptHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (charSet != null) __obj.updateDynamic("charSet")(charSet)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(noModule)) __obj.updateDynamic("noModule")(noModule)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (src != null) __obj.updateDynamic("src")(src)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScriptHTMLAttributes[T]]
  }
}

