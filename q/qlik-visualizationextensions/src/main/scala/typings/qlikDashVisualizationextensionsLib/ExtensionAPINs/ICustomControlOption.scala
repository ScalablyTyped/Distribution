package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Controls
trait ICustomControlOption extends js.Object {
  var label: java.lang.String
  var value: java.lang.String
}

object ICustomControlOption {
  @scala.inline
  def apply(label: java.lang.String, value: java.lang.String): ICustomControlOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ICustomControlOption]
  }
}

