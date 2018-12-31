package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Try[A] extends js.Object {
  var isFailure: scala.Boolean
  var isSuccess: scala.Boolean
  def apply1[B, C](ob: Try[B], f: js.Function2[/* a */ A, /* b */ B, C]): Try[C]
  def apply2[B, C, D](ob: Try[B], oc: Try[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D]
  def chain[B](ob: Try[B]): TryBuilder1[A, B]
  def failed(): Try[A]
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Try[A]
  def flatMap[B](f: js.Function1[/* a */ A, Try[B]]): Try[B]
  def fold[B](fe: js.Function1[/* e */ stdLib.Error, B], ff: js.Function1[/* a */ A, B]): B
  def foreach[B](f: js.Function1[/* a */ A, scala.Unit]): scala.Unit
  def get(): A
  def getError(): stdLib.Error
  def getOrElse[B /* <: A */](a: B): A
  def map[B](f: js.Function1[/* a */ A, B]): Try[B]
  def orElse[B /* <: A */](a: Try[B]): Try[A]
  def recover[B /* <: A */](f: js.Function1[/* e */ stdLib.Error, Optional[Try[B]]]): Try[A]
  def toOptional(): Optional[A]
  def transform[B](fs: js.Function1[/* a */ A, Try[B]], ff: js.Function1[/* e */ stdLib.Error, Try[B]]): Try[B]
}

