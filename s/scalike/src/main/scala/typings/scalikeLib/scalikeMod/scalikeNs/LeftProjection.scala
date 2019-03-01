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
    exists: js.Function1[js.Function1[/* a */ A, scala.Boolean], scala.Boolean],
    filter: js.Function1[js.Function1[/* a */ A, scala.Boolean], Optional[Either[A, B]]],
    flatMap: js.Function1[js.Function1[/* a */ A, Either[js.Any, B]], Either[js.Any | A, B]],
    forall: js.Function1[js.Function1[/* a */ A, scala.Boolean], scala.Boolean],
    foreach: js.Function1[js.Function1[/* a */ A, scala.Unit], scala.Unit],
    get: js.Function0[A],
    getOrElse: js.Function1[js.Any, A],
    map: js.Function1[js.Function1[/* a */ A, js.Any], Either[js.Any | A, B]],
    self: js.Any,
    toOptional: js.Function0[Optional[A]],
    toString: js.Function0[java.lang.String]
  ): LeftProjection[A, B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exists")(exists)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("flatMap")(flatMap)
    __obj.updateDynamic("forall")(forall)
    __obj.updateDynamic("foreach")(foreach)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getOrElse")(getOrElse)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("self")(self)
    __obj.updateDynamic("toOptional")(toOptional)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[LeftProjection[A, B]]
  }
}

