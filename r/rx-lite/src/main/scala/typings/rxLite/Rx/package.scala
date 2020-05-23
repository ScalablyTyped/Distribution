package typings.rxLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Rx {
  type Scheduler = typings.rxLite.Rx.IScheduler
  // SerialDisposable it's an alias of SingleAssignmentDisposable
  type SerialDisposable = typings.rxLite.Rx.SingleAssignmentDisposable
}
