package typings
package schedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schedulerMod {
  type FrameCallbackType = js.Function1[/* deadline */ Deadline, js.Object | scala.Unit]
}
