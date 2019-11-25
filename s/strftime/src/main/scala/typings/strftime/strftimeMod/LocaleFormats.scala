package typings.strftime.strftimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleFormats extends js.Object {
  var D: js.UndefOr[String] = js.undefined
  var F: js.UndefOr[String] = js.undefined
  var R: js.UndefOr[String] = js.undefined
  var T: js.UndefOr[String] = js.undefined
  var X: js.UndefOr[String] = js.undefined
  var c: js.UndefOr[String] = js.undefined
  var r: js.UndefOr[String] = js.undefined
  var v: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[String] = js.undefined
}

object LocaleFormats {
  @scala.inline
  def apply(
    D: String = null,
    F: String = null,
    R: String = null,
    T: String = null,
    X: String = null,
    c: String = null,
    r: String = null,
    v: String = null,
    x: String = null
  ): LocaleFormats = {
    val __obj = js.Dynamic.literal()
    if (D != null) __obj.updateDynamic("D")(D.asInstanceOf[js.Any])
    if (F != null) __obj.updateDynamic("F")(F.asInstanceOf[js.Any])
    if (R != null) __obj.updateDynamic("R")(R.asInstanceOf[js.Any])
    if (T != null) __obj.updateDynamic("T")(T.asInstanceOf[js.Any])
    if (X != null) __obj.updateDynamic("X")(X.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleFormats]
  }
}

