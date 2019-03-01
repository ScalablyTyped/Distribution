package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterAction extends js.Object {
  var key: java.lang.String
  var `type`: reduxDashPersistLib.reduxDashPersistLibStrings.`redux-persist/es/REGISTER`
}

object RegisterAction {
  @scala.inline
  def apply(
    key: java.lang.String,
    `type`: reduxDashPersistLib.reduxDashPersistLibStrings.`redux-persist/es/REGISTER`
  ): RegisterAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[RegisterAction]
  }
}

