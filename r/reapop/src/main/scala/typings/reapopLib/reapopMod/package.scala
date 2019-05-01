package typings
package reapopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reapopMod {
  type ActionTypes = reapopLib.ADD_NOTIFICATION | reapopLib.UPDATE_NOTIFICATION | reapopLib.REMOVE_NOTIFICATION | reapopLib.REMOVE_NOTIFICATIONS
  type NotificationSystem = reactLib.reactMod.Component[NotificationSystemProps, js.Any, js.Any]
  type POSITION = reapopLib.TOP | reapopLib.TOP_CENTER | reapopLib.TOP_LEFT_POSITION | reapopLib.TOP_RIGHT_POSITION | reapopLib.BOTTOM | reapopLib.BOTTOM_CENTER | reapopLib.BOTTOM_LEFT_POSITION | reapopLib.BOTTOM_RIGHT_POSITION
  type STATUSES = reapopLib.DEFAULT_STATUS | reapopLib.INFO_STATUS | reapopLib.SUCCESS_STATUS | reapopLib.WARNING_STATUS | reapopLib.ERROR_STATUS
}
