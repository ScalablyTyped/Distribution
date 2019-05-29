package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyIndexedKeyframes
  extends /* property */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        java.lang.String | (js.Array[scala.Double | scala.Null | java.lang.String]) | scala.Double | scala.Null
      ]
    ] {
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.undefined
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var offset: js.UndefOr[scala.Double | (js.Array[scala.Double | scala.Null])] = js.undefined
}

object PropertyIndexedKeyframes {
  @scala.inline
  def apply(
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        java.lang.String | (js.Array[scala.Double | scala.Null | java.lang.String]) | scala.Double | scala.Null
      ]
    ] = null,
    composite: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto] = null,
    easing: java.lang.String | js.Array[java.lang.String] = null,
    offset: scala.Double | (js.Array[scala.Double | scala.Null]) = null
  ): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
}

