package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qName: java.lang.String
  /**
    * Value of the variable.
    */
  var qValue: IFieldValue
}

object IBookmarkVariableItem {
  @scala.inline
  def apply(qName: java.lang.String, qValue: IFieldValue): IBookmarkVariableItem = {
    val __obj = js.Dynamic.literal(qName = qName, qValue = qValue)
  
    __obj.asInstanceOf[IBookmarkVariableItem]
  }
}

