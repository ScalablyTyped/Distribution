package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "Future")
@js.native
object FutureNs extends js.Object {
  def failed[A](e: stdLib.Error): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def find[A](
    fus: js.Array[scalikeLib.scalikeMod.scalikeNs.Future[A]],
    f: js.Function1[/* a */ A, scala.Boolean]
  ): scalikeLib.scalikeMod.scalikeNs.Future[scalikeLib.scalikeMod.scalikeNs.Optional[A]] = js.native
  def firstCompletedOf[A](fus: js.Array[scalikeLib.scalikeMod.scalikeNs.Future[A]]): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def foldLeft[A, B](
    fu: js.Array[scalikeLib.scalikeMod.scalikeNs.Future[A]],
    zero: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): scalikeLib.scalikeMod.scalikeNs.Future[B] = js.native
  def fromPromise[A](p: stdLib.Promise[A]): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def fromTry[A](t: scalikeLib.scalikeMod.scalikeNs.Try[A]): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def reduceLeft[A, B](fu: js.Array[scalikeLib.scalikeMod.scalikeNs.Future[A]], f: js.Function2[/* b */ B, /* a */ A, B]): scalikeLib.scalikeMod.scalikeNs.Future[B] = js.native
  def sequence[A](fus: js.Array[scalikeLib.scalikeMod.scalikeNs.Future[A]]): scalikeLib.scalikeMod.scalikeNs.Future[js.Array[A]] = js.native
  def successful[A](a: A): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def traverse[A, B](fu: js.Array[A], f: js.Function1[/* a */ A, scalikeLib.scalikeMod.scalikeNs.Future[B]]): scalikeLib.scalikeMod.scalikeNs.Future[js.Array[B]] = js.native
  def unit(): scalikeLib.scalikeMod.scalikeNs.Future[scala.Unit] = js.native
}

