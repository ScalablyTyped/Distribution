package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCSSInlineStyle extends js.Object {
  val style: CSSStyleDeclaration
}

object ElementCSSInlineStyle {
  @scala.inline
  def apply(style: CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
}

