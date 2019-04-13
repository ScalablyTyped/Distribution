package typings
package sockjsDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sockjsDashClientMod {
  type CLOSED = sockjsDashClientLib.sockjsDashClientLibNumbers.`3`
  type CLOSING = sockjsDashClientLib.sockjsDashClientLibNumbers.`2`
  type CONNECTING = sockjsDashClientLib.sockjsDashClientLibNumbers.`0`
  type OPEN = sockjsDashClientLib.sockjsDashClientLibNumbers.`1`
  type OpenEvent = BaseEvent
  type SessionGenerator = js.Function0[java.lang.String]
  type State = CONNECTING | OPEN | CLOSING | CLOSED
}
