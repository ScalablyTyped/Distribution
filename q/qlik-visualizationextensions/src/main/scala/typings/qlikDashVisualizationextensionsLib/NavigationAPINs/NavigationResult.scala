package typings
package qlikDashVisualizationextensionsLib.NavigationAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The navigation result object.
  */
trait NavigationResult extends js.Object {
  /**
    * Error code. Can be: NOSUCHSHEET   |   NOCURRENTSHEET   |   NOSUCHSTORY
    */
  var error: NavigationErrorType
  /**
    * Error message, for example 'No current sheet'.
    */
  var errorMsg: java.lang.String
  /**
    * The new mode.
    */
  var mode: java.lang.String
  /**
    * The new sheet ID.
    */
  var sheetId: java.lang.String
  /**
    * The new story ID.
    */
  var storyId: java.lang.String
  /**
    * Returns true if successful.
    */
  var success: scala.Boolean
}

object NavigationResult {
  @scala.inline
  def apply(
    error: NavigationErrorType,
    errorMsg: java.lang.String,
    mode: java.lang.String,
    sheetId: java.lang.String,
    storyId: java.lang.String,
    success: scala.Boolean
  ): NavigationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("errorMsg")(errorMsg)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("sheetId")(sheetId)
    __obj.updateDynamic("storyId")(storyId)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[NavigationResult]
  }
}

