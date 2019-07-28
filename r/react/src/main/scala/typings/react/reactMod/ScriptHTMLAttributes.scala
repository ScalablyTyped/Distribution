package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptHTMLAttributes[T] extends HTMLAttributes[T] {
  var async: js.UndefOr[Boolean] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var noModule: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ScriptHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    charSet: String = null,
    crossOrigin: String = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    integrity: String = null,
    noModule: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    src: String = null,
    `type`: String = null
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

