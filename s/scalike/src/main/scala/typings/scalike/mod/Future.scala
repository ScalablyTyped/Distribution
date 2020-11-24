package typings.scalike.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Future[A] extends js.Object {
  
  def andThen[B](f: js.Function1[/* t */ Try[A], B]): Future[A] = js.native
  
  def apply1[B, C](ob: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
  
  def apply2[B, C, D](ob: Future[B], oc: Future[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D] = js.native
  
  def chain[B](ob: Future[B]): FutureBuilder1[A, B] = js.native
  
  def failed(): Future[Error] = js.native
  
  def fallbackTo[B /* <: A */](fu: Future[B]): Future[A] = js.native
  
  def filter(f: js.Function1[/* a */ A, Boolean]): Future[A] = js.native
  
  def flatMap[B](f: js.Function1[/* a */ A, Future[B]]): Future[B] = js.native
  
  def foreach[B](f: js.Function1[/* a */ A, B]): Unit = js.native
  
  def getPromise(): js.Promise[A] = js.native
  
  def isCompleted(): Boolean = js.native
  
  def map[B](f: js.Function1[/* a */ A, B]): Future[B] = js.native
  
  def onComplete[B](f: js.Function1[/* t */ Try[A], B]): Unit = js.native
  
  def recover[B /* <: A */](f: js.Function1[/* e */ Error, Optional[B]]): Future[A] = js.native
  
  def recoverWith[B /* <: A */](f: js.Function1[/* e */ Error, Optional[Future[B]]]): Future[A] = js.native
  
  def transform[B](f: js.Function1[/* t */ Try[A], Try[B]]): Future[B] = js.native
  
  def transform1[B](fs: js.Function1[/* a */ A, B], ff: js.Function1[/* e */ Error, Error]): Future[B] = js.native
  
  def transformWith[B](f: js.Function1[/* t */ Try[A], Future[B]]): Future[B] = js.native
  
  def value(): Optional[Try[A]] = js.native
  
  def zip[B](fu: Future[B]): Future[js.Tuple2[A, B]] = js.native
  
  def zipWith[B, C](fu: Future[B], f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
}
@JSImport("scalike", "Future")
@js.native
object Future extends js.Object {
  
  def apply[A](f: js.Function0[A]): Future[A] = js.native
  def apply[A](f: js.Promise[A]): Future[A] = js.native
  
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
