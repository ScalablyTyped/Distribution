package typings.reactDashDraggableDashList.reactDashDraggableDashListMod

import typings.react.reactMod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableList[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, _] */]
  extends Component[Props[I, C, T], js.Object, js.Any] {
  def getItemInstance(key: String): T = js.native
}

