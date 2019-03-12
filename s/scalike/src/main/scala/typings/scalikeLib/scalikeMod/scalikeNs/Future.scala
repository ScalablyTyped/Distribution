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
  def getPromise(): js.Promise[A]
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

object Future {
  @scala.inline
  def apply[A](
    andThen: js.Function1[/* t */ Try[A], js.Any] => Future[A],
    apply1: (Future[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Future[js.Any],
    apply2: (Future[js.Any], Future[js.Any], js.Function3[/* a */ A, js.Any, js.Any, js.Any]) => Future[js.Any],
    chain: Future[js.Any] => FutureBuilder1[A, js.Any],
    failed: () => Future[stdLib.Error],
    fallbackTo: Future[js.Any] => Future[A],
    filter: js.Function1[/* a */ A, scala.Boolean] => Future[A],
    flatMap: js.Function1[/* a */ A, Future[js.Any]] => Future[js.Any],
    foreach: js.Function1[/* a */ A, js.Any] => scala.Unit,
    getPromise: () => js.Promise[A],
    isCompleted: () => scala.Boolean,
    map: js.Function1[/* a */ A, js.Any] => Future[js.Any],
    onComplete: js.Function1[/* t */ Try[A], js.Any] => scala.Unit,
    recover: js.Function1[/* e */ stdLib.Error, Optional[js.Any]] => Future[A],
    recoverWith: js.Function1[/* e */ stdLib.Error, Optional[Future[js.Any]]] => Future[A],
    transform: js.Function1[/* t */ Try[A], Try[js.Any]] => Future[js.Any],
    transform1: (js.Function1[/* a */ A, js.Any], js.Function1[/* e */ stdLib.Error, stdLib.Error]) => Future[js.Any],
    transformWith: js.Function1[/* t */ Try[A], Future[js.Any]] => Future[js.Any],
    value: () => Optional[Try[A]],
    zip: Future[js.Any] => Future[js.Tuple2[A, js.Any]],
    zipWith: (Future[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Future[js.Any]
  ): Future[A] = {
    val __obj = js.Dynamic.literal(andThen = js.Any.fromFunction1(andThen), apply1 = js.Any.fromFunction2(apply1), apply2 = js.Any.fromFunction3(apply2), chain = js.Any.fromFunction1(chain), failed = js.Any.fromFunction0(failed), fallbackTo = js.Any.fromFunction1(fallbackTo), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), foreach = js.Any.fromFunction1(foreach), getPromise = js.Any.fromFunction0(getPromise), isCompleted = js.Any.fromFunction0(isCompleted), map = js.Any.fromFunction1(map), onComplete = js.Any.fromFunction1(onComplete), recover = js.Any.fromFunction1(recover), recoverWith = js.Any.fromFunction1(recoverWith), transform = js.Any.fromFunction1(transform), transform1 = js.Any.fromFunction2(transform1), transformWith = js.Any.fromFunction1(transformWith), value = js.Any.fromFunction0(value), zip = js.Any.fromFunction1(zip), zipWith = js.Any.fromFunction2(zipWith))
  
    __obj.asInstanceOf[Future[A]]
  }
}

