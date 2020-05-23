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
    a: js.UndefOr[Double] = js.undefined,
    b: js.UndefOr[Double] = js.undefined,
    c: js.UndefOr[Double] = js.undefined,
    d: js.UndefOr[Double] = js.undefined,
    e: js.UndefOr[Double] = js.undefined,
    f: js.UndefOr[Double] = js.undefined,
    m11: js.UndefOr[Double] = js.undefined,
    m12: js.UndefOr[Double] = js.undefined,
    m21: js.UndefOr[Double] = js.undefined,
    m22: js.UndefOr[Double] = js.undefined,
    m41: js.UndefOr[Double] = js.undefined,
    m42: js.UndefOr[Double] = js.undefined
  ): DOMMatrix2DInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (!js.isUndefined(c)) __obj.updateDynamic("c")(c.get.asInstanceOf[js.Any])
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.get.asInstanceOf[js.Any])
    if (!js.isUndefined(e)) __obj.updateDynamic("e")(e.get.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m11)) __obj.updateDynamic("m11")(m11.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m12)) __obj.updateDynamic("m12")(m12.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m21)) __obj.updateDynamic("m21")(m21.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m22)) __obj.updateDynamic("m22")(m22.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m41)) __obj.updateDynamic("m41")(m41.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m42)) __obj.updateDynamic("m42")(m42.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMatrix2DInit]
  }
}

