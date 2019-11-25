package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkStyle extends js.Object {
  val sheet: StyleSheet | Null
}

object LinkStyle {
  @scala.inline
  def apply(sheet: StyleSheet = null): LinkStyle = {
    val __obj = js.Dynamic.literal()
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkStyle]
  }
}

