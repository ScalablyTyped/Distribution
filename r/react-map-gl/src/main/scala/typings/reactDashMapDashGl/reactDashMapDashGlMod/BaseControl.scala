package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.react.reactMod.Component
import typings.react.reactMod.RefObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "BaseControl")
@js.native
class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] ()
  extends Component[T, js.Object, js.Any] {
  var _containerRef: RefObject[S] = js.native
  var _context: MapContextProps = js.native
}

