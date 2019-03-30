package typings
package atStorybookThemingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: java.lang.String
  var border: java.lang.String
  var borderRadius: scala.Double
  var color: java.lang.String
}

object Anon_Background {
  @scala.inline
  def apply(
    background: java.lang.String,
    border: java.lang.String,
    borderRadius: scala.Double,
    color: java.lang.String
  ): Anon_Background = {
    val __obj = js.Dynamic.literal(background = background, border = border, borderRadius = borderRadius, color = color)
  
    __obj.asInstanceOf[Anon_Background]
  }
}

