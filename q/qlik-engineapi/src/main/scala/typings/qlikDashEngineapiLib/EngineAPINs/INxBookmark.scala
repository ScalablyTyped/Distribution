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

