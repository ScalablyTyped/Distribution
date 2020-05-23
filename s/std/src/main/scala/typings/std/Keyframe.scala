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
    offset: js.UndefOr[Null | Double] = js.undefined
  ): Keyframe = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
}

