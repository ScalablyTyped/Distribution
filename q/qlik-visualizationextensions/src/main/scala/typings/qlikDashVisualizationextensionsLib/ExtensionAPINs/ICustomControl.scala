package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomControl extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var `type`: java.lang.String
}

object ICustomControl {
  @scala.inline
  def apply(label: java.lang.String, ref: java.lang.String, `type`: java.lang.String): ICustomControl = {
    val __obj = js.Dynamic.literal(label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomControl]
  }
}

