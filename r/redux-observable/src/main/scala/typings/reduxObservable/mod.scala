package typings.reduxObservable

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import typings.rxjs.operatorMod.Operator
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.SchedulerLike
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-observable", "ActionsObservable")
  @js.native
  class ActionsObservable[T /* <: Action[js.Any] */] protected () extends Observable_[T] {
    def this(input$: Observable_[T]) = this()
    
    @JSName("lift")
    def lift_R_ActionAny_ActionsObservable[R /* <: Action[js.Any] */](operator: Operator[T, R]): ActionsObservable[R] = js.native
    
    @JSName("ofType")
    def ofType_type[R /* <: T */](key: (/* import warning: importer.ImportType#apply Failed type conversion: R['type'] */ js.Any)*): ActionsObservable[R] = js.native
  }
  /* static members */
  object ActionsObservable {
    
    @JSImport("redux-observable", "ActionsObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from[T /* <: Action[js.Any] */](ish: ObservableInput[T]): ActionsObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(ish.asInstanceOf[js.Any]).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def from[T /* <: Action[js.Any] */](ish: ObservableInput[T], scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def from[T /* <: Action[js.Any] */, R /* <: Action[js.Any] */](ish: ArrayLike[T]): ActionsObservable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(ish.asInstanceOf[js.Any]).asInstanceOf[ActionsObservable[R]]
    @scala.inline
    def from[T /* <: Action[js.Any] */, R /* <: Action[js.Any] */](ish: ArrayLike[T], scheduler: SchedulerLike): ActionsObservable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[R]]
    
    @scala.inline
    def of[T /* <: Action[js.Any] */](array: (T | SchedulerLike)*): ActionsObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(array.asInstanceOf[js.Any]).asInstanceOf[ActionsObservable[T]]
    /**
      * Just like RxJS itself, we can't actually make this method always type-safe
      * because we would need non-final position spread params e.g.
      *   `static of<T>(...items: T, scheduler?: Scheduler): ActionsObservable<T>`
      * which isn't possible in either JavaScript or TypeScript. So instead, we
      * provide safe typing for up to 6 items, following by a scheduler.
      */
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T): ActionsObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any]).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, item4: T): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], item4.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, item4: T, item5: T): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], item4.asInstanceOf[js.Any], item5.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], item4.asInstanceOf[js.Any], item5.asInstanceOf[js.Any], item6.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], item4.asInstanceOf[js.Any], item5.asInstanceOf[js.Any], item6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, item4: T, item5: T, scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], item4.asInstanceOf[js.Any], item5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, item4: T, scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], item4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, item3: T, scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], item3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, item2: T, scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], item2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
    @scala.inline
    def of[T /* <: Action[js.Any] */](item1: T, scheduler: SchedulerLike): ActionsObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(item1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ActionsObservable[T]]
  }
  
  @JSImport("redux-observable", "StateObservable")
  @js.native
  class StateObservable[S] protected () extends Observable_[S] {
    def this(stateSubject: Subject[S], initialState: S) = this()
    
    @JSName("source")
    var source_StateObservable: Subject[S] = js.native
    
    var value: S = js.native
  }
  
  @scala.inline
  def combineEpics(epics: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEpics")(epics.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def combineEpics_E_E[E](epics: E*): E = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEpics")(epics.asInstanceOf[js.Any]).asInstanceOf[E]
  
  @scala.inline
  def combineEpics_T_ActionAnyO_TSD_Epic[T /* <: Action[js.Any] */, O /* <: T */, S, D](epics: (Epic[T, O, S, D])*): Epic[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEpics")(epics.asInstanceOf[js.Any]).asInstanceOf[Epic[T, O, S, D]]
  
  @scala.inline
  def createEpicMiddleware[T /* <: Action[js.Any] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")().asInstanceOf[EpicMiddleware[T, O, S, D]]
  @scala.inline
  def createEpicMiddleware[T /* <: Action[js.Any] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[EpicMiddleware[T, O, S, D]]
  
  @scala.inline
  def ofType[T /* <: Action[js.Any] */, R /* <: T */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: R['type'] */ js.Any */](key: K*): js.Function1[/* source */ Observable_[T], Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Observable_[T], Observable_[R]]]
  
  type Epic[Input /* <: Action[js.Any] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ ActionsObservable[Input], 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    Observable_[Output]
  ]
  
  @js.native
  trait EpicMiddleware[T /* <: Action[js.Any] */, O /* <: T */, S, D]
    extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
    
    def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
  }
  
  trait Options[D] extends StObject {
    
    var dependencies: js.UndefOr[D] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[D](): Options[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[D]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], D] (val x: Self & Options[D]) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: D): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    }
  }
}
