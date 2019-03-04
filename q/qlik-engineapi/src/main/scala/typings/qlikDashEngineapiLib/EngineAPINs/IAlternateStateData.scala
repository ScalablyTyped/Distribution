package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qStateName: java.lang.String
}

object IAlternateStateData {
  @scala.inline
  def apply(qFieldItems: js.Array[IBookmarkFieldItem], qStateName: java.lang.String): IAlternateStateData = {
    val __obj = js.Dynamic.literal(qFieldItems = qFieldItems, qStateName = qStateName)
  
    __obj.asInstanceOf[IAlternateStateData]
  }
}

