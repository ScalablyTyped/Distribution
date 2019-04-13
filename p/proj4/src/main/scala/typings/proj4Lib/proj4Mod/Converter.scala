package typings
package proj4Lib.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  def forward[T /* <: TemplateCoordinates */](coordinates: T): T
  def inverse[T /* <: TemplateCoordinates */](coordinates: T): T
}

object Converter {
  @scala.inline
  def apply(forward: js.Any => js.Any, inverse: js.Any => js.Any): Converter = {
    val __obj = js.Dynamic.literal(forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse))
  
    __obj.asInstanceOf[Converter]
  }
}

