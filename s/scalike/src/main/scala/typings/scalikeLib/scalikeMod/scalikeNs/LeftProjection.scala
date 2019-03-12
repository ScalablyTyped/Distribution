package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftProjection[A, B] extends js.Object {
  var self: js.Any
  def exists(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Optional[Either[A, B]]
  def flatMap[X](f: js.Function1[/* a */ A, Either[X, B]]): Either[X | A, B]
  def forall(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean
  def foreach(f: js.Function1[/* a */ A, scala.Unit]): scala.Unit
  def get(): A
  def getOrElse[X /* <: A */](x: X): A
  def map[X](f: js.Function1[/* a */ A, X]): Either[X | A, B]
  def toOptional(): Optional[A]
}

object LeftProjection {
  @scala.inline
  def apply[A, B](
    exists: js.Function1[/* a */ A, scala.Boolean] => scala.Boolean,
    filter: js.Function1[/* a */ A, scala.Boolean] => Optional[Either[A, B]],
    flatMap: js.Function1[/* a */ A, Either[js.Any, B]] => Either[js.Any | A, B],
    forall: js.Function1[/* a */ A, scala.Boolean] => scala.Boolean,
    foreach: js.Function1[/* a */ A, scala.Unit] => scala.Unit,
    get: () => A,
    getOrElse: js.Any => A,
    map: js.Function1[/* a */ A, js.Any] => Either[js.Any | A, B],
    self: js.Any,
    toOptional: () => Optional[A],
    toString: () => java.lang.String
  ): LeftProjection[A, B] = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction1(exists), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), forall = js.Any.fromFunction1(forall), foreach = js.Any.fromFunction1(foreach), get = js.Any.fromFunction0(get), getOrElse = js.Any.fromFunction1(getOrElse), map = js.Any.fromFunction1(map), self = self, toOptional = js.Any.fromFunction0(toOptional), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[LeftProjection[A, B]]
  }
}

