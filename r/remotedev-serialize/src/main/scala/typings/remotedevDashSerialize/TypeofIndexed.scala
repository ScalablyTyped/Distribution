package typings.remotedevDashSerialize

import typings.immutable.immutableMod.SeqNs.Indexed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofIndexed extends js.Object {
  /**
    * Provides an Seq.Indexed of the values provided.
    */
  def of[T](values: T*): Indexed[T]
}

object TypeofIndexed {
  @scala.inline
  def apply(of: /* repeated */ js.Any => Indexed[js.Any]): TypeofIndexed = {
    val __obj = js.Dynamic.literal(of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[TypeofIndexed]
  }
}

