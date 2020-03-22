package typings.sinonjsFakeTimers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InstalledClock = typings.sinonjsFakeTimers.mod.Clock with typings.sinonjsFakeTimers.mod.InstalledMethods
  type TimerId = scala.Double | typings.sinonjsFakeTimers.mod.NodeTimer
}
