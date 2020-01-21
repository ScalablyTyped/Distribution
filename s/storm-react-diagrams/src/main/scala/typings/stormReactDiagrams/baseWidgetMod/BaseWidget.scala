package typings.stormReactDiagrams.baseWidgetMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/widgets/BaseWidget", "BaseWidget")
@js.native
class BaseWidget[P /* <: BaseWidgetProps */, S] protected ()
  extends Component[P, S, js.Any] {
  def this(name: String, props: P) = this()
  var className: String = js.native
  def bem(selector: String): String = js.native
  def getClassName(): String = js.native
  def getProps(): js.Any = js.native
}

