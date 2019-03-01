package typings
package stompitLib.libSocketMod.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHandlers
  extends /* command */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* frame */ nodeLib.streamMod.Writable, /* callback */ commandHandler, scala.Unit]
    ]

object CommandHandlers {
  @scala.inline
  def apply(
    StringDictionary: /* command */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* frame */ nodeLib.streamMod.Writable, /* callback */ commandHandler, scala.Unit]
    ] = null
  ): CommandHandlers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CommandHandlers]
  }
}

