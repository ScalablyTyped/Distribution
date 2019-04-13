package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "LeftProjection")
@js.native
class LeftProjection[A, B] protected () extends js.Object {
  def this(self: Either[A, B]) = this()
  var self: js.Any = js.native
  def exists(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean = js.native
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Optional[Either[A, B]] = js.native
  def flatMap[X](f: js.Function1[/* a */ A, Either[X, B]]): Either[X | A, B] = js.native
  def forall(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean = js.native
  def foreach(f: js.Function1[/* a */ A, scala.Unit]): scala.Unit = js.native
  def get(): A = js.native
  def getOrElse[X /* <: A */](x: X): A = js.native
  def map[X](f: js.Function1[/* a */ A, X]): Either[X | A, B] = js.native
  def toOptional(): Optional[A] = js.native
}

