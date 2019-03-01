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
  def apply(init: js.Function1[Sigma, scala.Unit]): CustomShapes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[CustomShapes]
  }
}

