package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMMatrixInit extends DOMMatrix2DInit {
  var is2D: js.UndefOr[scala.Boolean] = js.undefined
  var m13: js.UndefOr[Double] = js.undefined
  var m14: js.UndefOr[Double] = js.undefined
  var m23: js.UndefOr[Double] = js.undefined
  var m24: js.UndefOr[Double] = js.undefined
  var m31: js.UndefOr[Double] = js.undefined
  var m32: js.UndefOr[Double] = js.undefined
  var m33: js.UndefOr[Double] = js.undefined
  var m34: js.UndefOr[Double] = js.undefined
  var m43: js.UndefOr[Double] = js.undefined
  var m44: js.UndefOr[Double] = js.undefined
}

object DOMMatrixInit {
  @scala.inline
  def apply(
    a: Int | Double = null,
    b: Int | Double = null,
    c: Int | Double = null,
    d: Int | Double = null,
    e: Int | Double = null,
    f: Int | Double = null,
    is2D: js.UndefOr[scala.Boolean] = js.undefined,
    m11: Int | Double = null,
    m12: Int | Double = null,
    m13: Int | Double = null,
    m14: Int | Double = null,
    m21: Int | Double = null,
    m22: Int | Double = null,
    m23: Int | Double = null,
    m24: Int | Double = null,
    m31: Int | Double = null,
    m32: Int | Double = null,
    m33: Int | Double = null,
    m34: Int | Double = null,
    m41: Int | Double = null,
    m42: Int | Double = null,
    m43: Int | Double = null,
    m44: Int | Double = null
  ): DOMMatrixInit = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (!js.isUndefined(is2D)) __obj.updateDynamic("is2D")(is2D)
    if (m11 != null) __obj.updateDynamic("m11")(m11.asInstanceOf[js.Any])
    if (m12 != null) __obj.updateDynamic("m12")(m12.asInstanceOf[js.Any])
    if (m13 != null) __obj.updateDynamic("m13")(m13.asInstanceOf[js.Any])
    if (m14 != null) __obj.updateDynamic("m14")(m14.asInstanceOf[js.Any])
    if (m21 != null) __obj.updateDynamic("m21")(m21.asInstanceOf[js.Any])
    if (m22 != null) __obj.updateDynamic("m22")(m22.asInstanceOf[js.Any])
    if (m23 != null) __obj.updateDynamic("m23")(m23.asInstanceOf[js.Any])
    if (m24 != null) __obj.updateDynamic("m24")(m24.asInstanceOf[js.Any])
    if (m31 != null) __obj.updateDynamic("m31")(m31.asInstanceOf[js.Any])
    if (m32 != null) __obj.updateDynamic("m32")(m32.asInstanceOf[js.Any])
    if (m33 != null) __obj.updateDynamic("m33")(m33.asInstanceOf[js.Any])
    if (m34 != null) __obj.updateDynamic("m34")(m34.asInstanceOf[js.Any])
    if (m41 != null) __obj.updateDynamic("m41")(m41.asInstanceOf[js.Any])
    if (m42 != null) __obj.updateDynamic("m42")(m42.asInstanceOf[js.Any])
    if (m43 != null) __obj.updateDynamic("m43")(m43.asInstanceOf[js.Any])
    if (m44 != null) __obj.updateDynamic("m44")(m44.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMatrixInit]
  }
}

