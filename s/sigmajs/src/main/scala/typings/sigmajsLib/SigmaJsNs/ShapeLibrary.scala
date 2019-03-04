package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLibrary extends js.Object {
  def enumerate(): js.Any
}

object ShapeLibrary {
  @scala.inline
  def apply(enumerate: js.Function0[js.Any]): ShapeLibrary = {
    val __obj = js.Dynamic.literal(enumerate = enumerate)
  
    __obj.asInstanceOf[ShapeLibrary]
  }
}

