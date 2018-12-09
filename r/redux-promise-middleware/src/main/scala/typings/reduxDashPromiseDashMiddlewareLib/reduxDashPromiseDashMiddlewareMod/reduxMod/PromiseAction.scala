package typings
package reduxDashPromiseDashMiddlewareLib.reduxDashPromiseDashMiddlewareMod.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromiseAction[R]
  extends reduxLib.reduxMod.Action[js.Any] {
  var payload: js.Promise[R]
}

