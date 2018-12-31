package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehydrateAction[Payload] extends js.Object {
  var err: js.UndefOr[RehydrateErrorType] = js.undefined
  var key: java.lang.String
  var payload: js.UndefOr[Payload] = js.undefined
  var `type`: reduxDashPersistLib.reduxDashPersistLibStrings.`redux-persist/es/REHYDRATE`
}

