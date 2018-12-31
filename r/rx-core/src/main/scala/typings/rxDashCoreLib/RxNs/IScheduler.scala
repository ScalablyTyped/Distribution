package typings
package rxDashCoreLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): IScheduler
  def catchException(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): IScheduler
}

