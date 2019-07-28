package typings.reconnectDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reconnectDashCoreMod {
  type ConnectFunction[ArgType, ConnectionType] = js.ThisFunction1[/* this */ Instance[ArgType, ConnectionType], /* opts */ ArgType, ConnectionType]
  // TODO: Once DT supports TS 3.0, use new Generic Rest Parameter feature for
  // ArgType.  Current definitions only support one parameter passed to
  // connect() but the library actually allows any number of args.
  type CustomModule[ArgType, ConnectionType] = js.Function2[
    /* opts */ js.UndefOr[ModuleOptions[ConnectionType]], 
    /* cb */ js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]], 
    Instance[ArgType, ConnectionType]
  ]
}
