package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reapopMod {
  import typings.react.reactMod.Component
  import typings.reapop.ADD_NOTIFICATION
  import typings.reapop.BOTTOM
  import typings.reapop.BOTTOM_CENTER
  import typings.reapop.BOTTOM_LEFT_POSITION
  import typings.reapop.BOTTOM_RIGHT_POSITION
  import typings.reapop.DEFAULT_STATUS
  import typings.reapop.ERROR_STATUS
  import typings.reapop.INFO_STATUS
  import typings.reapop.REMOVE_NOTIFICATION
  import typings.reapop.REMOVE_NOTIFICATIONS
  import typings.reapop.SUCCESS_STATUS
  import typings.reapop.TOP
  import typings.reapop.TOP_CENTER
  import typings.reapop.TOP_LEFT_POSITION
  import typings.reapop.TOP_RIGHT_POSITION
  import typings.reapop.UPDATE_NOTIFICATION
  import typings.reapop.WARNING_STATUS

  type ActionTypes = ADD_NOTIFICATION | UPDATE_NOTIFICATION | REMOVE_NOTIFICATION | REMOVE_NOTIFICATIONS
  type NotificationSystem = Component[NotificationSystemProps, js.Any, js.Any]
  type POSITION = TOP | TOP_CENTER | TOP_LEFT_POSITION | TOP_RIGHT_POSITION | BOTTOM | BOTTOM_CENTER | BOTTOM_LEFT_POSITION | BOTTOM_RIGHT_POSITION
  type STATUSES = DEFAULT_STATUS | INFO_STATUS | SUCCESS_STATUS | WARNING_STATUS | ERROR_STATUS
}
