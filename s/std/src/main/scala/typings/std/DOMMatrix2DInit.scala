package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMMatrix2DInit extends js.Object {
  var a: js.UndefOr[Double] = js.undefined
  var b: js.UndefOr[Double] = js.undefined
  var c: js.UndefOr[Double] = js.undefined
  var d: js.UndefOr[Double] = js.undefined
  var e: js.UndefOr[Double] = js.undefined
  var f: js.UndefOr[Double] = js.undefined
  var m11: js.UndefOr[Double] = js.undefined
  var m12: js.UndefOr[Double] = js.undefined
  var m21: js.UndefOr[Double] = js.undefined
  var m22: js.UndefOr[Double] = js.undefined
  var m41: js.UndefOr[Double] = js.undefined
  var m42: js.UndefOr[Double] = js.undefined
}

object DOMMatrix2DInit {
  @scala.inline
  def apply(
    a: Int | Double = null,
    b: Int | Double = null,
    c: Int | Double = null,
    d: Int | Double = null,
    e: Int | Double = null,
    f: Int | Double = null,
    m11: Int | Double = null,
    m12: Int | Double = null,
    m21: Int | Double = null,
    m22: Int | Double = null,
    m41: Int | Double = null,
    m42: Int | Double = null
  ): DOMMatrix2DInit = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (m11 != null) __obj.updateDynamic("m11")(m11.asInstanceOf[js.Any])
    if (m12 != null) __obj.updateDynamic("m12")(m12.asInstanceOf[js.Any])
    if (m21 != null) __obj.updateDynamic("m21")(m21.asInstanceOf[js.Any])
    if (m22 != null) __obj.updateDynamic("m22")(m22.asInstanceOf[js.Any])
    if (m41 != null) __obj.updateDynamic("m41")(m41.asInstanceOf[js.Any])
    if (m42 != null) __obj.updateDynamic("m42")(m42.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMatrix2DInit]
  }
}

