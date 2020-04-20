package typings.reactSketchapp

import typings.reactSketchapp.mod.Style
import typings.reactSketchapp.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var style: Style | TextStyle
}

object AnonStyle {
  @scala.inline
  def apply(style: Style | TextStyle): AnonStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

