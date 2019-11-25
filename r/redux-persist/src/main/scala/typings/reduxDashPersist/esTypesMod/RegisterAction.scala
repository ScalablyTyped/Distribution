package typings.reduxDashPersist.esTypesMod

import typings.reduxDashPersist.reduxDashPersistStrings.`persist/REGISTER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterAction extends PersistorAction {
  var key: String
  var `type`: `persist/REGISTER`
}

object RegisterAction {
  @scala.inline
  def apply(key: String, `type`: `persist/REGISTER`): RegisterAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAction]
  }
}

