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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-observable", "ActionsObservable")
  @js.native
  class ActionsObservable[T /* <: Action[_] */] protected () extends Observable_[T] {
    def this(input$: Observable_[T]) = this()
    
    @JSName("lift")
    def lift_R_ActionWildcard_ActionsObservable[R /* <: Action[_] */](operator: Operator[T, R]): ActionsObservable[R] = js.native
    
    @JSName("ofType")
    def ofType_type[R /* <: T */](key: (/* import warning: importer.ImportType#apply Failed type conversion: R['type'] */ js.Any)*): ActionsObservable[R] = js.native
  }
  /* static members */
  object ActionsObservable {
    
    @JSImport("redux-observable", "ActionsObservable.from")
    @js.native
    def from[T /* <: Action[_] */](ish: ObservableInput[T]): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.from")
    @js.native
    def from[T /* <: Action[_] */](ish: ObservableInput[T], scheduler: SchedulerLike): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.from")
    @js.native
    def from[T /* <: Action[_] */, R /* <: Action[_] */](ish: ArrayLike[T]): ActionsObservable[R] = js.native
    @JSImport("redux-observable", "ActionsObservable.from")
    @js.native
    def from[T /* <: Action[_] */, R /* <: Action[_] */](ish: ArrayLike[T], scheduler: SchedulerLike): ActionsObservable[R] = js.native
    
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](array: (T | SchedulerLike)*): ActionsObservable[T] = js.native
    /**
      * Just like RxJS itself, we can't actually make this method always type-safe
      * because we would need non-final position spread params e.g.
      *   `static of<T>(...items: T, scheduler?: Scheduler): ActionsObservable<T>`
      * which isn't possible in either JavaScript or TypeScript. So instead, we
      * provide safe typing for up to 6 items, following by a scheduler.
      */
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, item5: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, item4: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, item3: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, item2: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
    @JSImport("redux-observable", "ActionsObservable.of")
    @js.native
    def of[T /* <: Action[_] */](item1: T, scheduler: SchedulerLike): ActionsObservable[T] = js.native
  }
  
  @JSImport("redux-observable", "StateObservable")
  @js.native
  class StateObservable[S] protected () extends Observable_[S] {
    def this(stateSubject: Subject[S], initialState: S) = this()
    
    @JSName("source")
    var source_StateObservable: Subject[S] = js.native
    
    var value: S = js.native
  }
  
  @JSImport("redux-observable", "combineEpics")
  @js.native
  def combineEpics(epics: js.Any*): js.Any = js.native
  @JSImport("redux-observable", "combineEpics")
  @js.native
  def combineEpics_E_E[E](epics: E*): E = js.native
  @JSImport("redux-observable", "combineEpics")
  @js.native
  def combineEpics_T_ActionWildcardO_TSD_Epic[T /* <: Action[_] */, O /* <: T */, S, D](epics: (Epic[T, O, S, D])*): Epic[T, O, S, D] = js.native
  
  @JSImport("redux-observable", "createEpicMiddleware")
  @js.native
  def createEpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = js.native
  @JSImport("redux-observable", "createEpicMiddleware")
  @js.native
  def createEpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = js.native
  
  @JSImport("redux-observable", "ofType")
  @js.native
  def ofType[T /* <: Action[_] */, R /* <: T */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: R['type'] */ js.Any */](key: K*): js.Function1[/* source */ Observable_[T], Observable_[R]] = js.native
  
  type Epic[Input /* <: Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ ActionsObservable[Input], 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    Observable_[Output]
  ]
  
  @js.native
  trait EpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D]
    extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
    
    def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
  }
  
  @js.native
  trait Options[D] extends StObject {
    
    var dependencies: js.UndefOr[D] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[D](): Options[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[D]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], D] (val x: Self with Options[D]) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: D): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    }
  }
}
