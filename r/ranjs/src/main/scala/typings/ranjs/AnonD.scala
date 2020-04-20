package typings.ranjs

import typings.ranjs.mod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonD extends js.Object {
  var D: Matrix
  var L: Matrix
}

object AnonD {
  @scala.inline
  def apply(D: Matrix, L: Matrix): AnonD = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonD]
  }
}

