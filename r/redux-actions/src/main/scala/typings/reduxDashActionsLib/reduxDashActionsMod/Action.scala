package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Action[Payload] extends BaseAction {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var payload: js.UndefOr[Payload] = js.undefined
}

