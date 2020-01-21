package typings.reactReduxEpic.mod

import typings.react.mod.ReactElement
import typings.reduxObservable.mod.Epic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux-epic", "renderToString")
@js.native
object renderToString extends js.Object {
  def apply(element: ReactElement, wrappedEpic: Epic[_, _, _, _]): js.Any = js.native
}

