package typings
package rxjsLib.internalSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subject", "Subject")
@js.native
class Subject[T] ()
  extends rxjsLib.internalObservableMod.Observable[T]
     with rxjsLib.internalTypesMod.SubscriptionLike {
  /* CompleteClass */
  override val closed: scala.Boolean = js.native
  var hasError: scala.Boolean = js.native
  var isStopped: scala.Boolean = js.native
  var observers: js.Array[rxjsLib.internalTypesMod.Observer[T]] = js.native
  var thrownError: js.Any = js.native
  /**
    * Creates a new Observable with this Subject as the source. You can do this
    * to create customize Observer-side logic of the Subject and conceal it from
    * code that uses the Observable.
    * @return {Observable} Observable that the Subject casts to
    */
  def asObservable(): rxjsLib.internalObservableMod.Observable[T] = js.native
  def complete(): scala.Unit = js.native
  def error(err: js.Any): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def next(value: T): scala.Unit = js.native
  /* CompleteClass */
  override def unsubscribe(): scala.Unit = js.native
}

@JSImport("rxjs/internal/Subject", "Subject")
@js.native
object Subject extends js.Object {
  /**@nocollapse
    * @deprecated use new Subject() instead
    */
  var create: js.Function = js.native
}

