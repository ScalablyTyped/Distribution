package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "RightProjection")
@js.native
class RightProjection[A, B] protected () extends js.Object {
  def this(self: Either[A, B]) = this()
  var self: js.Any = js.native
  def exists(f: js.Function1[/* b */ B, scala.Boolean]): scala.Boolean = js.native
  def filter(f: js.Function1[/* b */ B, scala.Boolean]): Optional[Either[A, B]] = js.native
  def flatMap[X](f: js.Function1[/* a */ B, Either[A, X]]): Either[A, X | B] = js.native
  def forall(f: js.Function1[/* b */ B, scala.Boolean]): scala.Boolean = js.native
  def foreach(f: js.Function1[/* b */ B, scala.Unit]): scala.Unit = js.native
  def get(): B = js.native
  def getOrElse[X /* <: B */](x: X): B = js.native
  def map[X](f: js.Function1[/* b */ B, X]): Either[A, X | B] = js.native
  def toOptional(): Optional[B] = js.native
}

