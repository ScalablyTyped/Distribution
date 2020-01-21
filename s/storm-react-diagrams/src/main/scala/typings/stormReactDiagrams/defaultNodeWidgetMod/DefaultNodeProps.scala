package typings.stormReactDiagrams.defaultNodeWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultNodeModelMod.DefaultNodeModel
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNodeProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine
  var node: DefaultNodeModel
}

object DefaultNodeProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    node: DefaultNodeModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): DefaultNodeProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNodeProps]
  }
}

