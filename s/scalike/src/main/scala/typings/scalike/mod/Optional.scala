package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optional[A] extends js.Object {
  var isEmpty: Boolean
  var nonEmpty: Boolean
  def apply1[B, C](ob: Optional[B], f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C]
  def apply2[B, C, D](ob: Optional[B], oc: Optional[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D]
  def chain[B](ob: Optional[B]): OptionalBuilder1[A, B]
  def contains[B /* <: A */](b: B): Boolean
  def exists(f: js.Function1[/* a */ A, Boolean]): Boolean
  def filter(f: js.Function1[/* a */ A, Boolean]): Optional[A]
  def flatMap[B](f: js.Function1[/* a */ A, Optional[B]]): Optional[B]
  def flatten(): Optional[A]
  def fold[B](ifEmpty: B, f: js.Function1[/* a */ A, B]): B
  def forall(f: js.Function1[/* a */ A, Boolean]): Boolean
  def foreach(f: js.Function1[/* a */ A, Unit]): Unit
  def get(): A
  def getOrElse[B /* <: A */](a: B): A
  def map[B](f: js.Function1[/* a */ A, B]): Optional[B]
  def orElse[B /* <: A */](ob: Optional[B]): Optional[A]
}

@JSImport("scalike", "Optional")
@js.native
object Optional extends js.Object {
  def apply[A](a: A): Optional[A] = js.native
}

