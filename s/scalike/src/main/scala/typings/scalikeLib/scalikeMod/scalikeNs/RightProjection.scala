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

