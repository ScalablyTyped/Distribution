package typings.qlikDashVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Controls
trait ICustomControlOption extends js.Object {
  var label: String
  var value: String
}

object ICustomControlOption {
  @scala.inline
  def apply(label: String, value: String): ICustomControlOption = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[ICustomControlOption]
  }
}

