package typings.reactMapGl.mod

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "BaseControl")
@js.native
class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] ()
  extends Component[T, js.Object, js.Any] {
  
  var _containerRef: RefObject[S] = js.native
  
  var _context: MapContextProps = js.native
}
