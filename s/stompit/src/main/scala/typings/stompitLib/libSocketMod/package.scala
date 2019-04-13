package typings
package stompitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSocketMod {
  type CommandHandlers = org.scalablytyped.runtime.StringDictionary[
    js.Function2[/* frame */ nodeLib.streamMod.Writable, /* callback */ commandHandler, scala.Unit]
  ]
  type Heartbeat = js.Array[scala.Double]
  type commandHandler = js.Function1[/* frame */ nodeLib.streamMod.Writable, scala.Unit]
}
