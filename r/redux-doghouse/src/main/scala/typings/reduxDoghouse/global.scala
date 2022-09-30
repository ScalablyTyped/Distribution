package typings.reduxDoghouse

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.ActionCreator
import typings.redux.mod.ActionCreatorsMapObject
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Reducer
import typings.reduxDoghouse.anon.FnCall
import typings.reduxDoghouse.mod.ActionFactoriesMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReduxDoghouse {
    
    @JSGlobal("ReduxDoghouse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ReduxDoghouse.ScopedActionFactory")
    @js.native
    open class ScopedActionFactory[A /* <: ActionCreator[Any] | ActionCreatorsMapObject[Any] */] protected ()
      extends typings.reduxDoghouse.mod.ScopedActionFactory[A] {
      def this(actionCreator: A) = this()
    }
    
    inline def bindActionCreatorsDeep[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreatorsDeep")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[M]
    
    inline def bindActionCreatorsDeep_AFS_F[A /* <: ActionCreator[Any] | ActionCreatorsMapObject[Any] */, F /* <: typings.reduxDoghouse.mod.ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreatorsDeep")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[F]
    
    inline def bindActionCreatorsDeep_AS_A[A /* <: ActionCreator[Any] */, S](actionFactories: A, dispatch: Dispatch[S]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreatorsDeep")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[A]
    
    inline def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[M]
    inline def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: FnCall): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], bindFn.asInstanceOf[js.Any])).asInstanceOf[M]
    
    inline def bindScopedActionFactories_AFS_F[A /* <: ActionCreator[Any] | ActionCreatorsMapObject[Any] */, F /* <: typings.reduxDoghouse.mod.ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[F]
    inline def bindScopedActionFactories_AFS_F[A /* <: ActionCreator[Any] | ActionCreatorsMapObject[Any] */, F /* <: typings.reduxDoghouse.mod.ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S], bindFn: FnCall): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], bindFn.asInstanceOf[js.Any])).asInstanceOf[F]
    
    inline def bindScopedActionFactories_AS_A[A /* <: ActionCreator[Any] */, S](actionFactories: A, dispatch: Dispatch[S]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[A]
    inline def bindScopedActionFactories_AS_A[A /* <: ActionCreator[Any] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: FnCall): A = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], bindFn.asInstanceOf[js.Any])).asInstanceOf[A]
    
    inline def scopeActionCreators[A /* <: ActionCreator[Any] | ActionCreatorsMapObject[Any] */](actionCreator: A, scopeID: String): A = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeActionCreators")(actionCreator.asInstanceOf[js.Any], scopeID.asInstanceOf[js.Any])).asInstanceOf[A]
    inline def scopeActionCreators[A /* <: ActionCreator[Any] | ActionCreatorsMapObject[Any] */](actionCreator: A, scopeID: Double): A = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeActionCreators")(actionCreator.asInstanceOf[js.Any], scopeID.asInstanceOf[js.Any])).asInstanceOf[A]
    
    inline def scopeReducers(): Reducer[Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("scopeReducers")().asInstanceOf[Reducer[Any, AnyAction]]
    inline def scopeReducers(reducers: StringDictionary[Reducer[Any, AnyAction]]): Reducer[Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("scopeReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[Any, AnyAction]]
  }
}
