package typings.reduxDoghouse.mod

import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "bindActionCreatorsDeep")
@js.native
object bindActionCreatorsDeep extends js.Object {
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
}

