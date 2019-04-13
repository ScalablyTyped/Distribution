package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "Future")
@js.native
object FutureNs extends js.Object {
  def failed[A](e: stdLib.Error): scalikeLib.scalikeMod.Future[A] = js.native
  def find[A](fus: js.Array[scalikeLib.scalikeMod.Future[A]], f: js.Function1[/* a */ A, scala.Boolean]): scalikeLib.scalikeMod.Future[scalikeLib.scalikeMod.Optional[A]] = js.native
  def firstCompletedOf[A](fus: js.Array[scalikeLib.scalikeMod.Future[A]]): scalikeLib.scalikeMod.Future[A] = js.native
  def foldLeft[A, B](fu: js.Array[scalikeLib.scalikeMod.Future[A]], zero: B, f: js.Function2[/* b */ B, /* a */ A, B]): scalikeLib.scalikeMod.Future[B] = js.native
  def fromPromise[A](p: js.Promise[A]): scalikeLib.scalikeMod.Future[A] = js.native
  def fromTry[A](t: scalikeLib.scalikeMod.Try[A]): scalikeLib.scalikeMod.Future[A] = js.native
  def reduceLeft[A, B](fu: js.Array[scalikeLib.scalikeMod.Future[A]], f: js.Function2[/* b */ B, /* a */ A, B]): scalikeLib.scalikeMod.Future[B] = js.native
  def sequence[A](fus: js.Array[scalikeLib.scalikeMod.Future[A]]): scalikeLib.scalikeMod.Future[js.Array[A]] = js.native
  def successful[A](a: A): scalikeLib.scalikeMod.Future[A] = js.native
  def traverse[A, B](fu: js.Array[A], f: js.Function1[/* a */ A, scalikeLib.scalikeMod.Future[B]]): scalikeLib.scalikeMod.Future[js.Array[B]] = js.native
  def unit(): scalikeLib.scalikeMod.Future[scala.Unit] = js.native
}

