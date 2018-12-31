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

