package typings
package rxjsLib.internalObservableZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/zip", "ZipSubscriber")
@js.native
class ZipSubscriber[T, R] protected ()
  extends rxjsLib.internalSubscriberMod.Subscriber[T] {
  def this(destination: rxjsLib.internalSubscriberMod.Subscriber[R]) = this()
  def this(destination: rxjsLib.internalSubscriberMod.Subscriber[R], resultSelector: js.Function1[/* repeated */js.Any, R]) = this()
  def this(destination: rxjsLib.internalSubscriberMod.Subscriber[R], resultSelector: js.Function1[/* repeated */js.Any, R], values: js.Any) = this()
  var active: js.Any = js.native
  var iterators: js.Any = js.native
  var resultSelector: js.Any = js.native
  var values: js.Any = js.native
  /* protected */ def _next(value: js.Any): scala.Unit = js.native
  /* protected */ def _tryresultSelector(args: js.Array[_]): scala.Unit = js.native
  def checkIterators(): scala.Unit = js.native
  def notifyInactive(): scala.Unit = js.native
}

