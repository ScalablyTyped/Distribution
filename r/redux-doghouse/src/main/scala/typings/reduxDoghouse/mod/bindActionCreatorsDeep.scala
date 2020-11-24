package typings.reduxDoghouse.mod

import typings.redux.mod.ActionCreator
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-doghouse", "bindActionCreatorsDeep")
@js.native
object bindActionCreatorsDeep extends js.Object {
  
  def apply[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
}
