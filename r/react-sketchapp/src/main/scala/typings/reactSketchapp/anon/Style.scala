package typings.reactSketchapp.anon

import typings.reactSketchapp.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var style: typings.reactSketchapp.mod.Style | TextStyle
}

object Style {
  @scala.inline
  def apply(style: typings.reactSketchapp.mod.Style | TextStyle): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

