package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object socketMod {
  
  type CommandHandlers = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* frame */ typings.node.streamMod.Writable, 
      /* callback */ typings.stompit.socketMod.commandHandler, 
      scala.Unit
    ]
  ]
  
  type Heartbeat = js.Array[scala.Double]
  
  type commandHandler = js.Function1[/* frame */ typings.node.streamMod.Writable, scala.Unit]
}
