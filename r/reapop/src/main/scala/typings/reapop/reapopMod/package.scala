package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reapopMod {
  import typings.react.reactMod.Component

  // Action types
  type ADD_NOTIFICATION = String
  type ActionTypes = ADD_NOTIFICATION | UPDATE_NOTIFICATION | REMOVE_NOTIFICATION | REMOVE_NOTIFICATIONS
  type BOTTOM = String
  type BOTTOM_CENTER = String
  type BOTTOM_LEFT_POSITION = String
  type BOTTOM_RIGHT_POSITION = String
  // Constants
  type DEFAULT_STATUS = String
  type ERROR_STATUS = String
  type INFO_STATUS = String
  type NotificationSystem = Component[NotificationSystemProps, js.Any, js.Any]
  type POSITION = TOP | TOP_CENTER | TOP_LEFT_POSITION | TOP_RIGHT_POSITION | BOTTOM | BOTTOM_CENTER | BOTTOM_LEFT_POSITION | BOTTOM_RIGHT_POSITION
  type REMOVE_NOTIFICATION = String
  type REMOVE_NOTIFICATIONS = String
  type STATUSES = DEFAULT_STATUS | INFO_STATUS | SUCCESS_STATUS | WARNING_STATUS | ERROR_STATUS
  type SUCCESS_STATUS = String
  type TOP = String
  type TOP_CENTER = String
  type TOP_LEFT_POSITION = String
  type TOP_RIGHT_POSITION = String
  type UPDATE_NOTIFICATION = String
  type WARNING_STATUS = String
}
