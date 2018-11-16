package typings
package reactDashReduxDashEpicLib.reactDashReduxDashEpicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux-epic", JSImport.Namespace)
@js.native
object reactDashReduxDashEpicModMembers extends js.Object {
  def renderToString(
    element: reactLib.reactMod.ReactNs.ReactElement[_],
    wrappedEpic: reduxDashObservableLib.reduxDashObservableMod.Epic[_, _, _, _]
  ): js.Any = js.native
  def wrapRootEpic[T /* <: Action */, S, D, O /* <: T */](epic: reduxDashObservableLib.reduxDashObservableMod.Epic[T, S, D, O]): reduxDashObservableLib.reduxDashObservableMod.Epic[T, S, D, O] = js.native
}

