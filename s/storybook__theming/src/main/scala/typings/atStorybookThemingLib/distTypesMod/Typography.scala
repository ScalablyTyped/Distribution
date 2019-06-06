package typings
package atStorybookThemingLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var fonts: atStorybookThemingLib.Anon_Base
  var size: atStorybookThemingLib.Anon_Code
  var weight: atStorybookThemingLib.Anon_Black
}

object Typography {
  @scala.inline
  def apply(
    fonts: atStorybookThemingLib.Anon_Base,
    size: atStorybookThemingLib.Anon_Code,
    weight: atStorybookThemingLib.Anon_Black
  ): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts, size = size, weight = weight)
  
    __obj.asInstanceOf[Typography]
  }
}

