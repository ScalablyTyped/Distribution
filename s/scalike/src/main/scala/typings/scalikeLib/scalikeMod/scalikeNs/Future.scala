package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Future[A] extends js.Object {
  def andThen[B](f: js.Function1[/* t */ Try[A], B]): Future[A]
  def apply1[B, C](ob: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C]
  def apply2[B, C, D](ob: Future[B], oc: Future[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D]
  def chain[B](ob: Future[B]): FutureBuilder1[A, B]
  def failed(): Future[stdLib.Error]
  def fallbackTo[B /* <: A */](fu: Future[B]): Future[A]
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Future[A]
  def flatMap[B](f: js.Function1[/* a */ A, Future[B]]): Future[B]
  def foreach[B](f: js.Function1[/* a */ A, B]): scala.Unit
  def getPromise(): stdLib.Promise[A]
  def isCompleted(): scala.Boolean
  def map[B](f: js.Function1[/* a */ A, B]): Future[B]
  def onComplete[B](f: js.Function1[/* t */ Try[A], B]): scala.Unit
  def recover[B /* <: A */](f: js.Function1[/* e */ stdLib.Error, Optional[B]]): Future[A]
  def recoverWith[B /* <: A */](f: js.Function1[/* e */ stdLib.Error, Optional[Future[B]]]): Future[A]
  def transform[B](f: js.Function1[/* t */ Try[A], Try[B]]): Future[B]
  def transform1[B](fs: js.Function1[/* a */ A, B], ff: js.Function1[/* e */ stdLib.Error, stdLib.Error]): Future[B]
  def transformWith[B](f: js.Function1[/* t */ Try[A], Future[B]]): Future[B]
  def value(): Optional[Try[A]]
  def zip[B](fu: Future[B]): Future[js.Tuple2[A, B]]
  def zipWith[B, C](fu: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C]
}

