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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-doghouse", "ScopedActionFactory")
  @js.native
  class ScopedActionFactory[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */] protected () extends StObject {
    def this(actionCreator: A) = this()
    
    def scope(id: String): A = js.native
    def scope(id: Double): A = js.native
  }
  
  @JSImport("redux-doghouse", "bindActionCreatorsDeep")
  @js.native
  def bindActionCreatorsDeep[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  @JSImport("redux-doghouse", "bindActionCreatorsDeep")
  @js.native
  def bindActionCreatorsDeep_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = js.native
  @JSImport("redux-doghouse", "bindActionCreatorsDeep")
  @js.native
  def bindActionCreatorsDeep_M_ActionFactoriesMapS_M[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: FnCall): A = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S], bindFn: FnCall): F = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_M_ActionFactoriesMapS_M[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  @JSImport("redux-doghouse", "bindScopedActionFactories")
  @js.native
  def bindScopedActionFactories_M_ActionFactoriesMapS_M[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: FnCall): M = js.native
  
  @JSImport("redux-doghouse", "scopeActionCreators")
  @js.native
  def scopeActionCreators[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: String): A = js.native
  @JSImport("redux-doghouse", "scopeActionCreators")
  @js.native
  def scopeActionCreators[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: Double): A = js.native
  
  @JSImport("redux-doghouse", "scopeReducers")
  @js.native
  def scopeReducers(): Reducer[_, AnyAction] = js.native
  @JSImport("redux-doghouse", "scopeReducers")
  @js.native
  def scopeReducers(reducers: StringDictionary[Reducer[_, AnyAction]]): Reducer[_, AnyAction] = js.native
  
  @js.native
  trait ActionFactoriesMap extends /* key */ StringDictionary[ScopedActionFactory[_] | ActionCreator[_] | ActionFactoriesMap]
  object ActionFactoriesMap {
    
    @scala.inline
    def apply(): ActionFactoriesMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFactoriesMap]
    }
  }
}
