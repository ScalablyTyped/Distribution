package typings.primereact.lightboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightboxProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var effectDuration: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var images: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object LightboxProps {
  @scala.inline
  def apply(
    className: String = null,
    easing: String = null,
    effectDuration: String = null,
    id: String = null,
    images: js.Array[_] = null,
    style: js.Object = null,
    target: String = null
  ): LightboxProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightboxProps]
  }
}

