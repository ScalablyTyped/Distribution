package typings.stormReactDiagrams.defaultLinkWidgetMod

import typings.std.MouseEvent
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkProps extends BaseWidgetProps {
  var color: js.UndefOr[String] = js.undefined
  var diagramEngine: DiagramEngine
  var link: DefaultLinkModel
  var pointAdded: js.UndefOr[js.Function2[/* point */ PointModel, /* event */ MouseEvent, _]] = js.undefined
  var smooth: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DefaultLinkProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    link: DefaultLinkModel,
    baseClass: String = null,
    className: String = null,
    color: String = null,
    extraProps: js.Any = null,
    pointAdded: (/* point */ PointModel, /* event */ MouseEvent) => _ = null,
    smooth: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): DefaultLinkProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (pointAdded != null) __obj.updateDynamic("pointAdded")(js.Any.fromFunction2(pointAdded))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLinkProps]
  }
}

