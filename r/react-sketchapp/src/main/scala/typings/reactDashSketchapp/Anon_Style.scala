package typings.reactDashSketchapp

import typings.reactDashSketchapp.reactDashSketchappMod.Style
import typings.reactDashSketchapp.reactDashSketchappMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Style extends js.Object {
  var style: Style | TextStyle
}

object Anon_Style {
  @scala.inline
  def apply(style: Style | TextStyle): Anon_Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Style]
  }
}

