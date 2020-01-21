package typings.qlikVisualizationextensions.ExtensionAPI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtension extends js.Object {
  var controller: js.UndefOr[js.Any] = js.undefined
  var definition: js.UndefOr[IDefinition] = js.undefined
  var initialProperties: js.UndefOr[IInitialProperties] = js.undefined
  var paint: js.UndefOr[js.Function2[/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any], Unit]] = js.undefined
  var support: js.UndefOr[ISupport] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object IExtension {
  @scala.inline
  def apply(
    controller: js.Any = null,
    definition: IDefinition = null,
    initialProperties: IInitialProperties = null,
    paint: (/* $element */ HTMLElement, /* layout */ js.UndefOr[js.Any]) => Unit = null,
    support: ISupport = null,
    template: String = null
  ): IExtension = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (initialProperties != null) __obj.updateDynamic("initialProperties")(initialProperties.asInstanceOf[js.Any])
    if (paint != null) __obj.updateDynamic("paint")(js.Any.fromFunction2(paint))
    if (support != null) __obj.updateDynamic("support")(support.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
}

