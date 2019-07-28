package typings.scalike.scalikeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "Future")
@js.native
object FutureNs extends js.Object {
  def failed[A](e: Error): Future[A] = js.native
  def find[A](fus: js.Array[Future[A]], f: js.Function1[/* a */ A, Boolean]): Future[Optional[A]] = js.native
  def firstCompletedOf[A](fus: js.Array[Future[A]]): Future[A] = js.native
  def foldLeft[A, B](fu: js.Array[Future[A]], zero: B, f: js.Function2[/* b */ B, /* a */ A, B]): Future[B] = js.native
  def fromPromise[A](p: js.Promise[A]): Future[A] = js.native
  def fromTry[A](t: Try[A]): Future[A] = js.native
  def reduceLeft[A, B](fu: js.Array[Future[A]], f: js.Function2[/* b */ B, /* a */ A, B]): Future[B] = js.native
  def sequence[A](fus: js.Array[Future[A]]): Future[js.Array[A]] = js.native
  def successful[A](a: A): Future[A] = js.native
  def traverse[A, B](fu: js.Array[A], f: js.Function1[/* a */ A, Future[B]]): Future[js.Array[B]] = js.native
  def unit(): Future[Unit] = js.native
}

