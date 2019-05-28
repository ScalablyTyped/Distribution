package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSetOf extends js.Object {
  /**
    * Returns a Seq.Set of the provided values
    */
  def of[T](values: T*): immutableLib.immutableMod.SeqNs.Set[T]
}

object TypeofSetOf {
  @scala.inline
  def apply(of: /* repeated */ js.Any => immutableLib.immutableMod.SeqNs.Set[js.Any]): TypeofSetOf = {
    val __obj = js.Dynamic.literal(of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[TypeofSetOf]
  }
}

