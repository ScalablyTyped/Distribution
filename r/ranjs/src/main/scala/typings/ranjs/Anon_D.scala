package typings.ranjs

import typings.ranjs.ranjsMod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_D extends js.Object {
  var D: Matrix
  var L: Matrix
}

object Anon_D {
  @scala.inline
  def apply(D: Matrix, L: Matrix): Anon_D = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_D]
  }
}

