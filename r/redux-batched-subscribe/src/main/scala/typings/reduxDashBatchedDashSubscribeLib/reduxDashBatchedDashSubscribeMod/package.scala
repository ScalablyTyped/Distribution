package typings
package reduxDashBatchedDashSubscribeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashBatchedDashSubscribeMod {
  type BatchFunction = js.Function1[/* notify */ NotifyFunction, scala.Unit]
  type NotifyFunction = js.Function0[scala.Unit]
}
