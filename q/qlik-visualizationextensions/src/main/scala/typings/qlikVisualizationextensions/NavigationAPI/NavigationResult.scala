package typings.qlikVisualizationextensions.NavigationAPI

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
  var errorMsg: String
  /**
    * The new mode.
    */
  var mode: String
  /**
    * The new sheet ID.
    */
  var sheetId: String
  /**
    * The new story ID.
    */
  var storyId: String
  /**
    * Returns true if successful.
    */
  var success: Boolean
}

object NavigationResult {
  @scala.inline
  def apply(
    error: NavigationErrorType,
    errorMsg: String,
    mode: String,
    sheetId: String,
    storyId: String,
    success: Boolean
  ): NavigationResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
}

