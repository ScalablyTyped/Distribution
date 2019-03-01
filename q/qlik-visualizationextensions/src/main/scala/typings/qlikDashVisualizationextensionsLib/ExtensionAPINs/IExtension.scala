package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtension extends js.Object {
  var controller: js.UndefOr[js.Any] = js.undefined
  var definition: js.UndefOr[IDefinition] = js.undefined
  var initialProperties: js.UndefOr[IInitialProperties] = js.undefined
  var paint: js.UndefOr[
    js.Function2[/* $element */ stdLib.HTMLElement, /* layout */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var support: js.UndefOr[ISupport] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object IExtension {
  @scala.inline
  def apply(
    controller: js.Any = null,
    definition: IDefinition = null,
    initialProperties: IInitialProperties = null,
    paint: js.Function2[/* $element */ stdLib.HTMLElement, /* layout */ js.UndefOr[js.Any], scala.Unit] = null,
    support: ISupport = null,
    template: java.lang.String = null
  ): IExtension = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (initialProperties != null) __obj.updateDynamic("initialProperties")(initialProperties)
    if (paint != null) __obj.updateDynamic("paint")(paint)
    if (support != null) __obj.updateDynamic("support")(support)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[IExtension]
  }
}

