package typings.reactDraggableList.mod

import typings.react.mod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableList[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, _] */]
  extends Component[Props[I, C, T], js.Object, js.Any] {
  
  def getItemInstance(key: String): T = js.native
}
