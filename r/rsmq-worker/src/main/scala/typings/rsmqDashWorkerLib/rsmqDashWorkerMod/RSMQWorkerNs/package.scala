package typings
package rsmqDashWorkerLib.rsmqDashWorkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RSMQWorkerNs {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[nodeLib.Error], /* res */ js.UndefOr[R], scala.Unit]
  type CustomExceedCheckCallback = js.Function1[/* message */ rsmqLib.rsmqMod.RedisSMQNs.Message, scala.Boolean]
}
