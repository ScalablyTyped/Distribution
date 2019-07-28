package typings.atStorybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: Anon_App
  var color: Anon_Ancillary
  var typography: Anon_Fonts
}

object Anon_Background {
  @scala.inline
  def apply(background: Anon_App, color: Anon_Ancillary, typography: Anon_Fonts): Anon_Background = {
    val __obj = js.Dynamic.literal(background = background, color = color, typography = typography)
  
    __obj.asInstanceOf[Anon_Background]
  }
}

