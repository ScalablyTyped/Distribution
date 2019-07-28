package typings.reduxDashPersist.esTypesMod

import typings.reduxDashPersist.reduxDashPersistStrings.`redux-persist/es/REGISTER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterAction extends js.Object {
  var key: String
  var `type`: `redux-persist/es/REGISTER`
}

object RegisterAction {
  @scala.inline
  def apply(key: String, `type`: `redux-persist/es/REGISTER`): RegisterAction = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegisterAction]
  }
}

