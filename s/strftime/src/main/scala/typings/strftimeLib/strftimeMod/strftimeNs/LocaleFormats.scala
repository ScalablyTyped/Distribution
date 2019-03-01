package typings
package strftimeLib.strftimeMod.strftimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleFormats extends js.Object {
  var D: js.UndefOr[java.lang.String] = js.undefined
  var F: js.UndefOr[java.lang.String] = js.undefined
  var R: js.UndefOr[java.lang.String] = js.undefined
  var T: js.UndefOr[java.lang.String] = js.undefined
  var X: js.UndefOr[java.lang.String] = js.undefined
  var c: js.UndefOr[java.lang.String] = js.undefined
  var r: js.UndefOr[java.lang.String] = js.undefined
  var v: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[java.lang.String] = js.undefined
}

object LocaleFormats {
  @scala.inline
  def apply(
    D: java.lang.String = null,
    F: java.lang.String = null,
    R: java.lang.String = null,
    T: java.lang.String = null,
    X: java.lang.String = null,
    c: java.lang.String = null,
    r: java.lang.String = null,
    v: java.lang.String = null,
    x: java.lang.String = null
  ): LocaleFormats = {
    val __obj = js.Dynamic.literal()
    if (D != null) __obj.updateDynamic("D")(D)
    if (F != null) __obj.updateDynamic("F")(F)
    if (R != null) __obj.updateDynamic("R")(R)
    if (T != null) __obj.updateDynamic("T")(T)
    if (X != null) __obj.updateDynamic("X")(X)
    if (c != null) __obj.updateDynamic("c")(c)
    if (r != null) __obj.updateDynamic("r")(r)
    if (v != null) __obj.updateDynamic("v")(v)
    if (x != null) __obj.updateDynamic("x")(x)
    __obj.asInstanceOf[LocaleFormats]
  }
}

