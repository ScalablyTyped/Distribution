package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactReduxContextValue[SS, A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  var store: reduxLib.reduxMod.Store[SS, A]
  var storeState: SS
}

