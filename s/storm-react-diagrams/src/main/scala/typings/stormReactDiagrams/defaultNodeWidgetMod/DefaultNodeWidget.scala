package typings.stormReactDiagrams.defaultNodeWidgetMod

import typings.react.mod._Global_.JSX.Element
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultNodeWidget", "DefaultNodeWidget")
@js.native
class DefaultNodeWidget protected () extends BaseWidget[DefaultNodeProps, DefaultNodeState] {
  def this(props: DefaultNodeProps) = this()
  def generatePort(port: js.Any): Element = js.native
}

