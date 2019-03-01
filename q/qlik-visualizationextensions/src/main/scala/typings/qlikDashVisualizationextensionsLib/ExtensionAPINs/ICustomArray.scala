package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomArray extends ICustomControl {
  var addTranslation: java.lang.String
  var allowAdd: scala.Boolean
  var allowMove: scala.Boolean
  var allowRemove: scala.Boolean
  var itemTitleRef: java.lang.String
}

object ICustomArray {
  @scala.inline
  def apply(
    addTranslation: java.lang.String,
    allowAdd: scala.Boolean,
    allowMove: scala.Boolean,
    allowRemove: scala.Boolean,
    itemTitleRef: java.lang.String,
    label: java.lang.String,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomArray = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("addTranslation")(addTranslation)
    __obj.updateDynamic("allowAdd")(allowAdd)
    __obj.updateDynamic("allowMove")(allowMove)
    __obj.updateDynamic("allowRemove")(allowRemove)
    __obj.updateDynamic("itemTitleRef")(itemTitleRef)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ICustomArray]
  }
}

