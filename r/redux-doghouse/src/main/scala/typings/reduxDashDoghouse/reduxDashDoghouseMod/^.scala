package typings.reduxDashDoghouse.reduxDashDoghouseMod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.ActionCreator
import typings.redux.reduxMod.ActionCreatorsMapObject
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Reducer
import typings.reduxDashDoghouse.Fn_ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bindActionCreatorsDeep[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  @JSName("bindActionCreatorsDeep")
  def bindActionCreatorsDeep_A_ActionCreatorWildcardS_A[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  @JSName("bindActionCreatorsDeep")
  def bindActionCreatorsDeep_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = js.native
  def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: Fn_ActionCreator): M = js.native
  @JSName("bindScopedActionFactories")
  def bindScopedActionFactories_A_ActionCreatorWildcardS_A[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  @JSName("bindScopedActionFactories")
  def bindScopedActionFactories_A_ActionCreatorWildcardS_A[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: Fn_ActionCreator): A = js.native
  @JSName("bindScopedActionFactories")
  def bindScopedActionFactories_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S]): F = js.native
  @JSName("bindScopedActionFactories")
  def bindScopedActionFactories_A_UnionActionCreatorWildcardActionCreatorsMapObjectWildcardF_ScopedActionFactoryAS_F[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: Dispatch[S], bindFn: Fn_ActionCreator): F = js.native
  def scopeActionCreators[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: String): A = js.native
  def scopeActionCreators[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: Double): A = js.native
  def scopeReducers(): Reducer[_, AnyAction] = js.native
  def scopeReducers(reducers: StringDictionary[Reducer[_, AnyAction]]): Reducer[_, AnyAction] = js.native
}

