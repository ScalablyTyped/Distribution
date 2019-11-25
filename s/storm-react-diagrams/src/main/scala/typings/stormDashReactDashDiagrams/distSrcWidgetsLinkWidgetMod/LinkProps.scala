package typings.stormDashReactDashDiagrams.distSrcWidgetsLinkWidgetMod

import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends BaseWidgetProps {
  var children: js.UndefOr[js.Any] = js.undefined
  var diagramEngine: DiagramEngine
  var link: LinkModel[LinkModelListener]
}

object LinkProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    link: LinkModel[LinkModelListener],
    baseClass: String = null,
    children: js.Any = null,
    className: String = null,
    extraProps: js.Any = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

