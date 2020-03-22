package typings.remotedevSerialize

import typings.immutable.Immutable.Seq.Indexed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIndexedOf extends js.Object {
  def apply(): Indexed[_] = js.native
  def apply[T](collection: Iterable[T]): Indexed[T] = js.native
  /**
    * Provides an Seq.Indexed of the values provided.
    */
  def of[T](values: T*): Indexed[T] = js.native
}

