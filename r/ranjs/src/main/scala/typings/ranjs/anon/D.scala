package typings.ranjs.anon

import typings.ranjs.mod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait D extends js.Object {
  var D: Matrix
  var L: Matrix
}

object D {
  @scala.inline
  def apply(D: Matrix, L: Matrix): D = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
}

