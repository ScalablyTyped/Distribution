package typings.simperium.anon

import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V[T] extends DiffOp[T] {
  var o: r
  var v: T
}

object V {
  @scala.inline
  def apply[T](o: r, v: T): V[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[V[T]]
  }
}

