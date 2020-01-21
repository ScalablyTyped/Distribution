package typings.reactNativeAnimatable.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAnimation[T] extends /* progress */ NumberDictionary[T] {
  var easing: js.UndefOr[Easing] = js.undefined
  var from: js.UndefOr[T] = js.undefined
  var style: js.UndefOr[T] = js.undefined
  var to: js.UndefOr[T] = js.undefined
}

object CustomAnimation {
  @scala.inline
  def apply[T](
    NumberDictionary: /* progress */ NumberDictionary[T] = null,
    easing: Easing = null,
    from: T = null,
    style: T = null,
    to: T = null
  ): CustomAnimation[T] = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAnimation[T]]
  }
}

