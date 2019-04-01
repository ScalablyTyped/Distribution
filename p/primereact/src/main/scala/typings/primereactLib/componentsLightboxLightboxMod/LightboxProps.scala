package typings
package primereactLib.componentsLightboxLightboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightboxProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var effectDuration: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var images: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object LightboxProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    easing: java.lang.String = null,
    effectDuration: java.lang.String = null,
    id: java.lang.String = null,
    images: js.Array[_] = null,
    style: js.Object = null,
    target: java.lang.String = null
  ): LightboxProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (images != null) __obj.updateDynamic("images")(images)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LightboxProps]
  }
}

