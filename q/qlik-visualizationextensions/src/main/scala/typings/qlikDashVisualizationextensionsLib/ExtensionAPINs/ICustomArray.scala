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
    val __obj = js.Dynamic.literal(addTranslation = addTranslation, allowAdd = allowAdd, allowMove = allowMove, allowRemove = allowRemove, itemTitleRef = itemTitleRef, label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomArray]
  }
}

