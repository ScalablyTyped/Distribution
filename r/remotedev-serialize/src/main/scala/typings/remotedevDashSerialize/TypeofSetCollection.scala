package typings.remotedevDashSerialize

import typings.immutable.immutableMod.Seq.Set
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSetCollection extends js.Object {
  def apply(): Set[_] = js.native
  def apply[T](collection: Iterable[T]): Set[T] = js.native
  /**
    * Returns a Seq.Set of the provided values
    */
  def of[T](values: T*): Set[T] = js.native
}

