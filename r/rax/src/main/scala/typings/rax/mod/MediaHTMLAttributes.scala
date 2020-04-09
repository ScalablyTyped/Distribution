package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var controlsList: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var playsinline: js.UndefOr[Boolean] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object MediaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsList: String = null,
    crossOrigin: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    mediaGroup: String = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    playsinline: js.UndefOr[Boolean] = js.undefined,
    preload: String = null,
    src: String = null
  ): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (controlsList != null) __obj.updateDynamic("controlsList")(controlsList.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
}

