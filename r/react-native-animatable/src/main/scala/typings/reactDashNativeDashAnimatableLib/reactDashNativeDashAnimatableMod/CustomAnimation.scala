package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAnimation[T]
  extends /* progress */ org.scalablytyped.runtime.NumberDictionary[T] {
  var easing: js.UndefOr[reactDashNativeDashAnimatableLib.Easing] = js.undefined
  var from: js.UndefOr[T] = js.undefined
  var style: js.UndefOr[T] = js.undefined
  var to: js.UndefOr[T] = js.undefined
}

object CustomAnimation {
  @scala.inline
  def apply[T](
    NumberDictionary: /* progress */ org.scalablytyped.runtime.NumberDictionary[T] = null,
    easing: reactDashNativeDashAnimatableLib.Easing = null,
    from: T = null,
    style: T = null,
    to: T = null
  ): CustomAnimation[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAnimation[T]]
  }
}

