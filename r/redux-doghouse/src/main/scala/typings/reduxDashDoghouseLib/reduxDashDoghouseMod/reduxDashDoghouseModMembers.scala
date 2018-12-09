package typings
package reduxDashDoghouseLib.reduxDashDoghouseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", JSImport.Namespace)
@js.native
object reduxDashDoghouseModMembers extends js.Object {
  def bindActionCreatorsDeep[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: reduxLib.reduxMod.Dispatch[S]): M = js.native
  @JSName("bindActionCreatorsDeep")
  def `bindActionCreatorsDeep_A<union>FScopedActionFactorySF`[A /* <: reduxLib.reduxMod.ActionCreator[_] | reduxLib.reduxMod.ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: reduxLib.reduxMod.Dispatch[S]): F = js.native
  @JSName("bindActionCreatorsDeep")
  def bindActionCreatorsDeep_AActionCreatorSA[A /* <: reduxLib.reduxMod.ActionCreator[_] */, S](actionFactories: A, dispatch: reduxLib.reduxMod.Dispatch[S]): A = js.native
  def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: reduxLib.reduxMod.Dispatch[S]): M = js.native
  def bindScopedActionFactories[M /* <: ActionFactoriesMap */, S](
    actionFactories: M,
    dispatch: reduxLib.reduxMod.Dispatch[S],
    bindFn: js.Function2[
      /* actionCreators */ reduxLib.reduxMod.ActionCreatorsMapObject[_], 
      /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
      reduxLib.reduxMod.ActionCreatorsMapObject[_]
    ]
  ): M = js.native
  @JSName("bindScopedActionFactories")
  def `bindScopedActionFactories_A<union>FScopedActionFactorySF`[A /* <: reduxLib.reduxMod.ActionCreator[_] | reduxLib.reduxMod.ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](actionFactories: F, dispatch: reduxLib.reduxMod.Dispatch[S]): F = js.native
  @JSName("bindScopedActionFactories")
  def `bindScopedActionFactories_A<union>FScopedActionFactorySF`[A /* <: reduxLib.reduxMod.ActionCreator[_] | reduxLib.reduxMod.ActionCreatorsMapObject[_] */, F /* <: ScopedActionFactory[A] */, S](
    actionFactories: F,
    dispatch: reduxLib.reduxMod.Dispatch[S],
    bindFn: js.Function2[
      /* actionCreators */ reduxLib.reduxMod.ActionCreatorsMapObject[_], 
      /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
      reduxLib.reduxMod.ActionCreatorsMapObject[_]
    ]
  ): F = js.native
  @JSName("bindScopedActionFactories")
  def bindScopedActionFactories_AActionCreatorSA[A /* <: reduxLib.reduxMod.ActionCreator[_] */, S](actionFactories: A, dispatch: reduxLib.reduxMod.Dispatch[S]): A = js.native
  @JSName("bindScopedActionFactories")
  def bindScopedActionFactories_AActionCreatorSA[A /* <: reduxLib.reduxMod.ActionCreator[_] */, S](
    actionFactories: A,
    dispatch: reduxLib.reduxMod.Dispatch[S],
    bindFn: js.Function2[
      /* actionCreators */ reduxLib.reduxMod.ActionCreatorsMapObject[_], 
      /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
      reduxLib.reduxMod.ActionCreatorsMapObject[_]
    ]
  ): A = js.native
  def scopeActionCreators[A /* <: reduxLib.reduxMod.ActionCreator[_] | reduxLib.reduxMod.ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: java.lang.String): A = js.native
  def scopeActionCreators[A /* <: reduxLib.reduxMod.ActionCreator[_] | reduxLib.reduxMod.ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: scala.Double): A = js.native
  def scopeReducers(): reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction] = js.native
  def scopeReducers(
    reducers: ScalablyTyped.runtime.StringDictionary[reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]]
  ): reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction] = js.native
}

