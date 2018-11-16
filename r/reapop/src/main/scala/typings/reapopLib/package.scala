package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reapopLib {
  // Action types
  type ADD_NOTIFICATION = java.lang.String
  type ActionTypes = ADD_NOTIFICATION | UPDATE_NOTIFICATION | REMOVE_NOTIFICATION | REMOVE_NOTIFICATIONS
  type BOTTOM = java.lang.String
  type BOTTOM_CENTER = java.lang.String
  type BOTTOM_LEFT_POSITION = java.lang.String
  type BOTTOM_RIGHT_POSITION = java.lang.String
  // Constants
  type DEFAULT_STATUS = java.lang.String
  type ERROR_STATUS = java.lang.String
  type INFO_STATUS = java.lang.String
  type POSITION = TOP | TOP_CENTER | TOP_LEFT_POSITION | TOP_RIGHT_POSITION | BOTTOM | BOTTOM_CENTER | BOTTOM_LEFT_POSITION | BOTTOM_RIGHT_POSITION
  type REMOVE_NOTIFICATION = java.lang.String
  type REMOVE_NOTIFICATIONS = java.lang.String
  type STATUSES = DEFAULT_STATUS | INFO_STATUS | SUCCESS_STATUS | WARNING_STATUS | ERROR_STATUS
  type SUCCESS_STATUS = java.lang.String
  type TOP = java.lang.String
  type TOP_CENTER = java.lang.String
  type TOP_LEFT_POSITION = java.lang.String
  type TOP_RIGHT_POSITION = java.lang.String
  type UPDATE_NOTIFICATION = java.lang.String
  type WARNING_STATUS = java.lang.String
}
