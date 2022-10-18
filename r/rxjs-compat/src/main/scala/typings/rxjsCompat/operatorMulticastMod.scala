package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.FactoryOrValue
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.mod.ConnectableObservable
import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMulticastMod {
  
  @JSImport("rxjs-compat/operator/multicast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multicast[T](SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]]): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any]).asInstanceOf[ConnectableObservable[T]]
  inline def multicast[T](
    SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]],
    selector: MonoTypeOperatorFunction[T]
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def multicast[T](subjectOrSubjectFactory: FactoryOrValue[Subject[T]]): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectOrSubjectFactory.asInstanceOf[js.Any]).asInstanceOf[ConnectableObservable[T]]
  
  inline def multicast_TR[T, R](SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]]): ConnectableObservable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any]).asInstanceOf[ConnectableObservable[R]]
  inline def multicast_TR[T, R](
    SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]],
    selector: OperatorFunction[T, R]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
