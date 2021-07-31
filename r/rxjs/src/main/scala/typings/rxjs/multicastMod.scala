package typings.rxjs

import typings.rxjs.connectableObservableMod.ConnectableObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.TeardownLogic
import typings.rxjs.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multicastMod {
  
  @JSImport("rxjs/internal/operators/multicast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/multicast", "MulticastOperator")
  @js.native
  class MulticastOperator[T, R] protected ()
    extends StObject
       with Operator[T, R] {
    def this(
      subjectFactory: js.Function0[Subject[T]],
      selector: js.Function1[/* source */ Observable[T], Observable[R]]
    ) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
    
    var selector: js.Any = js.native
    
    var subjectFactory: js.Any = js.native
  }
  
  @scala.inline
  def multicast[T](subjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  @scala.inline
  def multicast[T](subject: Subject[T]): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  @scala.inline
  def multicast[T, O /* <: ObservableInput[js.Any] */](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def multicast[T, O /* <: ObservableInput[js.Any] */](subject: Subject[T], selector: js.Function1[/* shared */ Observable[T], O]): UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]]]
}
