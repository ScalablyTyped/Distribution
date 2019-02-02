package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookChannelsLib {
  type EventHandler = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Channel.Event */ /* event */ js.Any, 
    scala.Unit
  ]
  type EventName = stdLib.PropertyKey
  type Listener = js.Function1[/* args */ js.Any, scala.Unit]
}
