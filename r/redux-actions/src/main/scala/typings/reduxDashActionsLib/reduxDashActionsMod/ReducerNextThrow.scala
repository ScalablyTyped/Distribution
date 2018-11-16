package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReducerNextThrow[State, Payload] extends js.Object {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
}

