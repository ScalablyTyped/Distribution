package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMMatrix2DInit extends js.Object {
  var a: js.UndefOr[scala.Double] = js.undefined
  var b: js.UndefOr[scala.Double] = js.undefined
  var c: js.UndefOr[scala.Double] = js.undefined
  var d: js.UndefOr[scala.Double] = js.undefined
  var e: js.UndefOr[scala.Double] = js.undefined
  var f: js.UndefOr[scala.Double] = js.undefined
  var m11: js.UndefOr[scala.Double] = js.undefined
  var m12: js.UndefOr[scala.Double] = js.undefined
  var m21: js.UndefOr[scala.Double] = js.undefined
  var m22: js.UndefOr[scala.Double] = js.undefined
  var m41: js.UndefOr[scala.Double] = js.undefined
  var m42: js.UndefOr[scala.Double] = js.undefined
}

object DOMMatrix2DInit {
  @scala.inline
  def apply(
    a: scala.Int | scala.Double = null,
    b: scala.Int | scala.Double = null,
    c: scala.Int | scala.Double = null,
    d: scala.Int | scala.Double = null,
    e: scala.Int | scala.Double = null,
    f: scala.Int | scala.Double = null,
    m11: scala.Int | scala.Double = null,
    m12: scala.Int | scala.Double = null,
    m21: scala.Int | scala.Double = null,
    m22: scala.Int | scala.Double = null,
    m41: scala.Int | scala.Double = null,
    m42: scala.Int | scala.Double = null
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

