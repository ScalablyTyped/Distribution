package typings
package rxjsLib.internalObservableConnectableObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/ConnectableObservable", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends rxjsLib.internalObservableMod.Observable[T] {
  def this(source: rxjsLib.internalObservableMod.Observable[T], subjectFactory: js.Function0[rxjsLib.internalSubjectMod.Subject[T]]) = this()
  var _connection: rxjsLib.internalSubscriptionMod.Subscription = js.native
  /** @internal */
  var _isComplete: scala.Boolean = js.native
  var _refCount: scala.Double = js.native
  var _subject: rxjsLib.internalSubjectMod.Subject[T] = js.native
  @JSName("source")
  var source_ConnectableObservable: rxjsLib.internalObservableMod.Observable[T] = js.native
  def connect(): rxjsLib.internalSubscriptionMod.Subscription = js.native
  /* protected */ def getSubject(): rxjsLib.internalSubjectMod.Subject[T] = js.native
  def refCount(): rxjsLib.internalObservableMod.Observable[T] = js.native
  /* protected */ def subjectFactory(): rxjsLib.internalSubjectMod.Subject[T] = js.native
}

