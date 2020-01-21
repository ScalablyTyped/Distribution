package typings.qlikVisualizationextensions.ExtensionAPI

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
    val __obj = js.Dynamic.literal(addTranslation = addTranslation.asInstanceOf[js.Any], allowAdd = allowAdd.asInstanceOf[js.Any], allowMove = allowMove.asInstanceOf[js.Any], allowRemove = allowRemove.asInstanceOf[js.Any], itemTitleRef = itemTitleRef.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomArray]
  }
}

