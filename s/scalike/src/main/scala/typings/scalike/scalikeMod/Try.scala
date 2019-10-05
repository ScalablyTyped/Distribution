package typings.scalike.scalikeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Try[A] extends js.Object {
  var isFailure: Boolean
  var isSuccess: Boolean
  def apply1[B, C](ob: Try[B], f: js.Function2[/* a */ A, /* b */ B, C]): Try[C]
  def apply2[B, C, D](ob: Try[B], oc: Try[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D]
  def chain[B](ob: Try[B]): TryBuilder1[A, B]
  def failed(): Try[A]
  def filter(f: js.Function1[/* a */ A, Boolean]): Try[A]
  def flatMap[B](f: js.Function1[/* a */ A, Try[B]]): Try[B]
  def fold[B](fe: js.Function1[/* e */ Error, B], ff: js.Function1[/* a */ A, B]): B
  def foreach[B](f: js.Function1[/* a */ A, Unit]): Unit
  def get(): A
  def getError(): Error
  def getOrElse[B /* <: A */](a: B): A
  def map[B](f: js.Function1[/* a */ A, B]): Try[B]
  def orElse[B /* <: A */](a: Try[B]): Try[A]
  def recover[B /* <: A */](f: js.Function1[/* e */ Error, Optional[Try[B]]]): Try[A]
  def toOptional(): Optional[A]
  def transform[B](fs: js.Function1[/* a */ A, Try[B]], ff: js.Function1[/* e */ Error, Try[B]]): Try[B]
}

@JSImport("scalike", "Try")
@js.native
object Try extends js.Object {
  def apply[A](f: js.Function0[A]): Try[A] = js.native
}

