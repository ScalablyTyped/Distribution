package typings.remotedevDashSerialize

import typings.immutable.immutableMod.SeqNs.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSetOf extends js.Object {
  /**
    * Returns a Seq.Set of the provided values
    */
  def of[T](values: T*): Set[T]
}

object TypeofSetOf {
  @scala.inline
  def apply(of: /* repeated */ js.Any => Set[js.Any]): TypeofSetOf = {
    val __obj = js.Dynamic.literal(of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[TypeofSetOf]
  }
}

