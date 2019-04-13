package typings
package rsmqDashWorkerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqDashWorkerMod {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[stdLib.Error], /* res */ js.UndefOr[R], scala.Unit]
  type CustomExceedCheckCallback = js.Function1[/* message */ rsmqLib.rsmqMod.Message, scala.Boolean]
}
