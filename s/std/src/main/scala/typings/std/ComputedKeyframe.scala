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
    offset: Double = null.asInstanceOf[Double]
  ): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], computedOffset = computedOffset.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ComputedKeyframe]
  }
}

