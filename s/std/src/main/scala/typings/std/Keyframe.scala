package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframe
  extends /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  var composite: js.UndefOr[CompositeOperationOrAuto] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[Double | Null] = js.undefined
}

object Keyframe {
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] = null,
    composite: CompositeOperationOrAuto = null,
    easing: java.lang.String = null,
    offset: Int | Double = null
  ): Keyframe = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (composite != null) __obj.updateDynamic("composite")(composite)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
}

