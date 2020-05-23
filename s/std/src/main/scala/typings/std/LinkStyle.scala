package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkStyle extends js.Object {
  val sheet: CSSStyleSheet | Null
}

object LinkStyle {
  @scala.inline
  def apply(sheet: CSSStyleSheet = null): LinkStyle = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkStyle]
  }
}

