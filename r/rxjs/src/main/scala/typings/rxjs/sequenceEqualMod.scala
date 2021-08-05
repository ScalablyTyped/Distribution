package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.Observer
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequenceEqualMod {
  
  @JSImport("rxjs/internal/operators/sequenceEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/sequenceEqual", "SequenceEqualOperator")
  @js.native
  class SequenceEqualOperator[T] protected ()
    extends StObject
       with Operator[T, Boolean] {
    def this(compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[Boolean], source: js.Any): TeardownLogic = js.native
    
    /* private */ var comparator: js.Any = js.native
    
    /* private */ var compareTo: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/sequenceEqual", "SequenceEqualSubscriber")
  @js.native
  class SequenceEqualSubscriber[T, R] protected () extends Subscriber[T] {
    def this(
      destination: Observer[R],
      compareTo: Observable[T],
      comparator: js.Function2[/* a */ T, /* b */ T, Boolean]
    ) = this()
    
    /* private */ var _a: js.Any = js.native
    
    /* private */ var _b: js.Any = js.native
    
    /* private */ var _oneComplete: js.Any = js.native
    
    def checkValues(): Unit = js.native
    
    /* private */ var comparator: js.Any = js.native
    
    /* private */ var compareTo: js.Any = js.native
    
    def completeB(): Unit = js.native
    
    def emit(value: Boolean): Unit = js.native
    
    def nextB(value: T): Unit = js.native
  }
  
  inline def sequenceEqual[T](compareTo: Observable[T]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  inline def sequenceEqual[T](compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
}
