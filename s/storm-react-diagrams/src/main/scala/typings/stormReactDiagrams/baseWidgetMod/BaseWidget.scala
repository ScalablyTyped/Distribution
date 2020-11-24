package typings.stormReactDiagrams.baseWidgetMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/widgets/BaseWidget", "BaseWidget")
@js.native
class BaseWidget[P /* <: BaseWidgetProps */, S] protected ()
  extends Component[P, S, js.Any] {
  def this(name: String, props: P) = this()
  
  def bem(selector: String): String = js.native
  
  var className: String = js.native
  
  def getClassName(): String = js.native
  
  def getProps(): js.Any = js.native
}
