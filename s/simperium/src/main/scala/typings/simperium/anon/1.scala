package typings.simperium.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.L
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[T] extends DiffOp[T] {
  var o: L
  var v: NumberDictionary[js.Any]
}

object `1` {
  @scala.inline
  def apply[T](o: L, v: NumberDictionary[js.Any]): `1`[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[T]]
  }
}

