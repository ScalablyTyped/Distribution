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

