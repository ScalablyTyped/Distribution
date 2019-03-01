package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var controlsList: js.UndefOr[java.lang.String] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var mediaGroup: js.UndefOr[java.lang.String] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var playsinline: js.UndefOr[scala.Boolean] = js.undefined
  var preload: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object MediaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    controlsList: java.lang.String = null,
    crossOrigin: java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    mediaGroup: java.lang.String = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    playsinline: js.UndefOr[scala.Boolean] = js.undefined,
    preload: java.lang.String = null,
    src: java.lang.String = null
  ): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (controlsList != null) __obj.updateDynamic("controlsList")(controlsList)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
}

