package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BookmarkVariableItem...
  */
trait IBookmarkVariableItem extends js.Object {
  /**
    * Name of the variable.
    */
  var qName: String
  /**
    * Value of the variable.
    */
  var qValue: IFieldValue
}

object IBookmarkVariableItem {
  @scala.inline
  def apply(qName: String, qValue: IFieldValue): IBookmarkVariableItem = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkVariableItem]
  }
}

