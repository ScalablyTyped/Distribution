package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxBookmark...
  */
trait INxBookmark extends js.Object {
  /**
    * List of selections for each state.
    */
  var qStateData: js.Array[IAlternateStateData]
  /**
    * Time when the bookmark was created.
    */
  var qUtcModifyTime: scala.Double
  /**
    * List of the variables in the app at the time the bookmark was created.
    */
  var qVariableItems: js.Array[IBookmarkVariableItem]
}

object INxBookmark {
  @scala.inline
  def apply(
    qStateData: js.Array[IAlternateStateData],
    qUtcModifyTime: scala.Double,
    qVariableItems: js.Array[IBookmarkVariableItem]
  ): INxBookmark = {
    val __obj = js.Dynamic.literal(qStateData = qStateData, qUtcModifyTime = qUtcModifyTime, qVariableItems = qVariableItems)
  
    __obj.asInstanceOf[INxBookmark]
  }
}

