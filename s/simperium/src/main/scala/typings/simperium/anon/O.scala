package typings.simperium.anon

import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait O[T] extends DiffOp[T] {
  var o: Plussign
  var v: T
}

object O {
  @scala.inline
  def apply[T](o: Plussign, v: T): O[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[O[T]]
  }
}

