package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.FactoryOrValue
import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.rxjsMod.ConnectableObservable
import typings.rxjs.rxjsMod.Observable
import typings.rxjs.rxjsMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/multicast", JSImport.Namespace)
@js.native
object operatorMulticastMod extends js.Object {
  def multicast[T](SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): ConnectableObservable[T] = js.native
  def multicast[T](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: MonoTypeOperatorFunction[T]
  ): Observable[T] = js.native
  def multicast[T](`this`: Observable[T], subjectOrSubjectFactory: FactoryOrValue[Subject[T]]): ConnectableObservable[T] = js.native
  @JSName("multicast")
  def multicast_TR[T, R](SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): ConnectableObservable[R] = js.native
  @JSName("multicast")
  def multicast_TR[T, R](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: OperatorFunction[T, R]
  ): Observable[R] = js.native
}

