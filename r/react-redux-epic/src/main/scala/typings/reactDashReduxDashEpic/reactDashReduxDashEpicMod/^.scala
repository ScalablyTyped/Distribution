package typings.reactDashReduxDashEpic.reactDashReduxDashEpicMod

import typings.react.reactMod.ReactElement
import typings.reduxDashObservable.reduxDashObservableMod.Epic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux-epic", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def renderToString(element: ReactElement, wrappedEpic: Epic[_, _, _, _]): js.Any = js.native
  def wrapRootEpic[T /* <: Action */, S, D, O /* <: T */](epic: Epic[T, S, D, O]): Epic[T, S, D, O] = js.native
}

