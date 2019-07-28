package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedKeyframe
  extends /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  var composite: CompositeOperationOrAuto
  var computedOffset: Double
  var easing: java.lang.String
  var offset: Double | Null
}

object ComputedKeyframe {
  @scala.inline
  def apply(
    composite: CompositeOperationOrAuto,
    computedOffset: Double,
    easing: java.lang.String,
    StringDictionary: /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] = null,
    offset: Int | Double = null
  ): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite, computedOffset = computedOffset, easing = easing)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedKeyframe]
  }
}

