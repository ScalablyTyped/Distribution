package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableGenerateObservableMod {
  
  @JSImport("rxjs-compat/observable/GenerateObservable", "GenerateObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class GenerateObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object GenerateObservable {
    
    @JSImport("rxjs-compat/observable/GenerateObservable", "GenerateObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any
    ): Observable_[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any])).asInstanceOf[Observable_[S]]
    inline def create[S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any,
      scheduler: SchedulerLike
    ): Observable_[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[S]]
    inline def create[S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateBaseOptions<S> */ Any
    ): Observable_[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Observable_[S]]
    inline def create[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ Any
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T, S](
      initialState: S,
      condition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConditionFunc<S> */ Any,
      iterate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IterateFunc<S> */ Any,
      resultSelector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResultFunc<S, T> */ Any,
      scheduler: SchedulerLike
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    
    inline def create_TS[T, S](
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenerateOptions<T, S> */ Any
    ): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  }
}
