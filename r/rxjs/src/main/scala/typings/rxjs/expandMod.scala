package typings.rxjs

import typings.rxjs.innerSubscribeMod.SimpleOuterSubscriber
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandMod {
  
  @JSImport("rxjs/internal/operators/expand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/expand", "ExpandOperator")
  @js.native
  class ExpandOperator[T, R] protected ()
    extends StObject
       with Operator[T, R] {
    def this(project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double) = this()
    def this(
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
    
    var concurrent: js.Any = js.native
    
    var project: js.Any = js.native
    
    var scheduler: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/expand", "ExpandSubscriber")
  @js.native
  class ExpandSubscriber[T, R] protected () extends SimpleOuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double
    ) = this()
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ) = this()
    
    /* protected */ def _next(value: js.Any): Unit = js.native
    
    var active: js.Any = js.native
    
    var buffer: js.Any = js.native
    
    var concurrent: js.Any = js.native
    
    var hasCompleted: js.Any = js.native
    
    var index: js.Any = js.native
    
    var project: js.Any = js.native
    
    var scheduler: js.Any = js.native
    
    var subscribeToProjection: js.Any = js.native
  }
  /* static members */
  object ExpandSubscriber {
    
    @JSImport("rxjs/internal/operators/expand", "ExpandSubscriber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/operators/expand", "ExpandSubscriber.dispatch")
    @js.native
    def dispatch: js.Any = js.native
    @scala.inline
    def dispatch_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
