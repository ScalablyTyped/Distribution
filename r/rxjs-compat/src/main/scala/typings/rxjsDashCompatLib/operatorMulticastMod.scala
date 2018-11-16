package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/multicast", JSImport.Namespace)
@js.native
object operatorMulticastMod extends js.Object {
  def multicast[T](
    SubjectFactory: js.ThisFunction0[/* this */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Subject[T]]
  ): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  def multicast[T](
    SubjectFactory: js.ThisFunction0[/* this */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Subject[T]],
    selector: rxjsLib.internalTypesMod.MonoTypeOperatorFunction[T]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def multicast[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    subjectOrSubjectFactory: rxjsLib.internalTypesMod.FactoryOrValue[rxjsLib.rxjsMod.Subject[T]]
  ): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  @JSName("multicast")
  def multicast_TR[T, R](
    SubjectFactory: js.ThisFunction0[/* this */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Subject[T]]
  ): rxjsLib.rxjsMod.ConnectableObservable[R] = js.native
  @JSName("multicast")
  def multicast_TR[T, R](
    SubjectFactory: js.ThisFunction0[/* this */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Subject[T]],
    selector: rxjsLib.internalTypesMod.OperatorFunction[T, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

