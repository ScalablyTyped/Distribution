package typings.qlikDashVisualizationextensions.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomArray extends ICustomControl {
  var addTranslation: String
  var allowAdd: Boolean
  var allowMove: Boolean
  var allowRemove: Boolean
  var itemTitleRef: String
}

object ICustomArray {
  @scala.inline
  def apply(
    addTranslation: String,
    allowAdd: Boolean,
    allowMove: Boolean,
    allowRemove: Boolean,
    itemTitleRef: String,
    label: String,
    ref: String,
    `type`: String
  ): ICustomArray = {
    val __obj = js.Dynamic.literal(addTranslation = addTranslation, allowAdd = allowAdd, allowMove = allowMove, allowRemove = allowRemove, itemTitleRef = itemTitleRef, label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomArray]
  }
}

