package typings.storybookChannels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ChannelHandler = js.Function1[/* event */ typings.storybookChannels.mod.ChannelEvent, scala.Unit]
  
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
}
