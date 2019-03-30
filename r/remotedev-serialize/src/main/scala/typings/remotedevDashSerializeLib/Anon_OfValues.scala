package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OfValues extends js.Object {
  /**
    * Provides an Seq.Indexed of the values provided.
    */
  def of[T](values: T*): immutableLib.immutableMod.SeqNs.Indexed[T]
}

object Anon_OfValues {
  @scala.inline
  def apply(of: /* repeated */ js.Any => immutableLib.immutableMod.SeqNs.Indexed[js.Any]): Anon_OfValues = {
    val __obj = js.Dynamic.literal(of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Anon_OfValues]
  }
}

