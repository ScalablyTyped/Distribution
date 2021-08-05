package typings.reduxDoghouse

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.ActionCreator
import typings.redux.mod.ActionCreatorsMapObject
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Reducer
import typings.reduxDoghouse.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-doghouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-doghouse", "ScopedActionFactory")
  @js.native
  class ScopedActionFactory[A /* <: ActionCreator[js.Any] | ActionCreatorsMapObject[js.Any] */] protected () extends StObject {
    def this(actionCreator: A) = this()
    
    def scope(id: String): A = js.native
    def scope(id: Double): A = js.native
  }
  
  inline def bindActionCreatorsDeep[A /* <: ActionCreator[js.Any] */, S](actionFactories: A, dispatch: Dispatch[S]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreatorsDeep")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def bindActionCreatorsDeep_A_UnionActionCreatorAnyActionCreatorsMapObjectAnyF_ScopedActionFactoryAS_F[A /* <: ActionCreator[js.Any] | ActionCreatorsMapObject[js.Any] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreatorsDeep")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def bindActionCreatorsDeep_M_ActionFactoriesMapS_M[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreatorsDeep")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[M]
  
  inline def bindScopedActionFactories[A /* <: ActionCreator[js.Any] */, S](actionFactories: A, dispatch: Dispatch[S]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[A]
  inline def bindScopedActionFactories[A /* <: ActionCreator[js.Any] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: FnCall): A = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], bindFn.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def bindScopedActionFactories_A_UnionActionCreatorAnyActionCreatorsMapObjectAnyF_ScopedActionFactoryAS_F[A /* <: ActionCreator[js.Any] | ActionCreatorsMapObject[js.Any] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[F]
  inline def bindScopedActionFactories_A_UnionActionCreatorAnyActionCreatorsMapObjectAnyF_ScopedActionFactoryAS_F[A /* <: ActionCreator[js.Any] | ActionCreatorsMapObject[js.Any] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S], bindFn: FnCall): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], bindFn.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def bindScopedActionFactories_M_ActionFactoriesMapS_M[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[M]
  inline def bindScopedActionFactories_M_ActionFactoriesMapS_M[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: FnCall): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindScopedActionFactories")(actionFactories.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], bindFn.asInstanceOf[js.Any])).asInstanceOf[M]
  
  inline def scopeActionCreators[A /* <: ActionCreator[js.Any] | ActionCreatorsMapObject[js.Any] */](actionCreator: A, scopeID: String): A = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeActionCreators")(actionCreator.asInstanceOf[js.Any], scopeID.asInstanceOf[js.Any])).asInstanceOf[A]
  inline def scopeActionCreators[A /* <: ActionCreator[js.Any] | ActionCreatorsMapObject[js.Any] */](actionCreator: A, scopeID: Double): A = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeActionCreators")(actionCreator.asInstanceOf[js.Any], scopeID.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def scopeReducers(): Reducer[js.Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("scopeReducers")().asInstanceOf[Reducer[js.Any, AnyAction]]
  inline def scopeReducers(reducers: StringDictionary[Reducer[js.Any, AnyAction]]): Reducer[js.Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("scopeReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[js.Any, AnyAction]]
  
  trait ActionFactoriesMap
    extends StObject
       with /* key */ StringDictionary[ScopedActionFactory[js.Any] | ActionCreator[js.Any] | ActionFactoriesMap]
  object ActionFactoriesMap {
    
    inline def apply(): ActionFactoriesMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFactoriesMap]
    }
  }
}
