package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSocketMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.streamMod.Writable

  type CommandHandlers = StringDictionary[js.Function2[/* frame */ Writable, /* callback */ commandHandler, Unit]]
  type Heartbeat = js.Array[Double]
  type commandHandler = js.Function1[/* frame */ Writable, Unit]
}
