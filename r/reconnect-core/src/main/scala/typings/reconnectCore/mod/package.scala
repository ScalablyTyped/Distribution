package typings.reconnectCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConnectFunction[ArgType, ConnectionType] = js.ThisFunction1[
    /* this */ typings.reconnectCore.mod.Instance[ArgType, ConnectionType], 
    /* opts */ ArgType, 
    ConnectionType
  ]
  
  // TODO: Once DT supports TS 3.0, use new Generic Rest Parameter feature for
  // ArgType.  Current definitions only support one parameter passed to
  // connect() but the library actually allows any number of args.
  type CustomModule[ArgType, ConnectionType] = js.Function2[
    /* opts */ js.UndefOr[typings.reconnectCore.mod.ModuleOptions[ConnectionType]], 
    /* cb */ js.UndefOr[js.Function1[/* con */ ConnectionType, scala.Unit]], 
    typings.reconnectCore.mod.Instance[ArgType, ConnectionType]
  ]
}
