package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightProjection[A, B] extends js.Object {
  var self: js.Any
  def exists(f: js.Function1[/* b */ B, scala.Boolean]): scala.Boolean
  def filter(f: js.Function1[/* b */ B, scala.Boolean]): Optional[Either[A, B]]
  def flatMap[X](f: js.Function1[/* a */ B, Either[A, X]]): Either[A, X | B]
  def forall(f: js.Function1[/* b */ B, scala.Boolean]): scala.Boolean
  def foreach(f: js.Function1[/* b */ B, scala.Unit]): scala.Unit
  def get(): B
  def getOrElse[X /* <: B */](x: X): B
  def map[X](f: js.Function1[/* b */ B, X]): Either[A, X | B]
  def toOptional(): Optional[B]
}

object RightProjection {
  @scala.inline
  def apply[A, B](
    exists: js.Function1[js.Function1[/* b */ B, scala.Boolean], scala.Boolean],
    filter: js.Function1[js.Function1[/* b */ B, scala.Boolean], Optional[Either[A, B]]],
    flatMap: js.Function1[js.Function1[/* a */ B, Either[A, js.Any]], Either[A, js.Any | B]],
    forall: js.Function1[js.Function1[/* b */ B, scala.Boolean], scala.Boolean],
    foreach: js.Function1[js.Function1[/* b */ B, scala.Unit], scala.Unit],
    get: js.Function0[B],
    getOrElse: js.Function1[js.Any, B],
    map: js.Function1[js.Function1[/* b */ B, js.Any], Either[A, js.Any | B]],
    self: js.Any,
    toOptional: js.Function0[Optional[B]],
    toString: js.Function0[java.lang.String]
  ): RightProjection[A, B] = {
    val __obj = js.Dynamic.literal(exists = exists, filter = filter, flatMap = flatMap, forall = forall, foreach = foreach, get = get, getOrElse = getOrElse, map = map, self = self, toOptional = toOptional, toString = toString)
  
    __obj.asInstanceOf[RightProjection[A, B]]
  }
}

