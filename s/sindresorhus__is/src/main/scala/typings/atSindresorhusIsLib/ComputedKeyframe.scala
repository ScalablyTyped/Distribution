package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedKeyframe
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Null]] {
  var composite: CompositeOperationOrAuto
  var computedOffset: scala.Double
  var easing: java.lang.String
  var offset: scala.Double | scala.Null
}

object ComputedKeyframe {
  @scala.inline
  def apply(
    composite: CompositeOperationOrAuto,
    computedOffset: scala.Double,
    easing: java.lang.String,
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Null]] = null,
    offset: scala.Int | scala.Double = null
  ): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite, computedOffset = computedOffset, easing = easing)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedKeyframe]
  }
}

