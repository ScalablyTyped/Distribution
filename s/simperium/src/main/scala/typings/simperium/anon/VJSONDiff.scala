package typings.simperium.anon

import typings.simperium.mod.DiffOp
import typings.simperium.mod.JSONDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VJSONDiff[T] extends DiffOp[T] {
  var o: typings.simperium.simperiumStrings.O
  var v: JSONDiff[T]
}

object VJSONDiff {
  @scala.inline
  def apply[T](o: typings.simperium.simperiumStrings.O, v: JSONDiff[T]): VJSONDiff[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[VJSONDiff[T]]
  }
}

