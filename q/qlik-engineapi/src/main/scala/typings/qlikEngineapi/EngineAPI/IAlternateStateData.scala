package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AlternateStateData...
  */
trait IAlternateStateData extends js.Object {
  /**
    * List of the selections <Array of BookmarkFieldItem>
    */
  var qFieldItems: js.Array[IBookmarkFieldItem]
  /**
    * Name of the alternate state.
    * Default is current selections: $
    */
  var qStateName: String
}

object IAlternateStateData {
  @scala.inline
  def apply(qFieldItems: js.Array[IBookmarkFieldItem], qStateName: String): IAlternateStateData = {
    val __obj = js.Dynamic.literal(qFieldItems = qFieldItems.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAlternateStateData]
  }
}

