package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomShapes extends js.Object {
  def init(sigma: Sigma): scala.Unit
}

object CustomShapes {
  @scala.inline
  def apply(init: Sigma => scala.Unit): CustomShapes = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
  
    __obj.asInstanceOf[CustomShapes]
  }
}

