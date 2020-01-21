package typings.reduxPersist.typesMod

import typings.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typings.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxPersist.typesMod.RehydrateAction
  - typings.reduxPersist.typesMod.RegisterAction
*/
trait PersistorAction extends js.Object

object PersistorAction {
  @scala.inline
  def RehydrateAction(
    key: String,
    `type`: persistSlashREHYDRATE,
    err: RehydrateErrorType = null,
    payload: js.Object = null
  ): PersistorAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorAction]
  }
  @scala.inline
  def RegisterAction(key: String, `type`: persistSlashREGISTER): PersistorAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorAction]
  }
}

