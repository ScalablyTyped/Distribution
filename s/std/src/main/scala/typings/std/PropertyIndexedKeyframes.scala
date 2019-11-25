package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyIndexedKeyframes
  extends /* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] {
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.undefined
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var offset: js.UndefOr[Double | (js.Array[Double | Null])] = js.undefined
}

object PropertyIndexedKeyframes {
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] = null,
    composite: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto] = null,
    easing: java.lang.String | js.Array[java.lang.String] = null,
    offset: Double | (js.Array[Double | Null]) = null
  ): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
}

