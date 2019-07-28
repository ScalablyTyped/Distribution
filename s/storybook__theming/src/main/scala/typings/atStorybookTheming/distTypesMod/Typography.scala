package typings.atStorybookTheming.distTypesMod

import typings.atStorybookTheming.Anon_Base
import typings.atStorybookTheming.Anon_Black
import typings.atStorybookTheming.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var fonts: Anon_Base
  var size: Anon_Code
  var weight: Anon_Black
}

object Typography {
  @scala.inline
  def apply(fonts: Anon_Base, size: Anon_Code, weight: Anon_Black): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts, size = size, weight = weight)
  
    __obj.asInstanceOf[Typography]
  }
}

