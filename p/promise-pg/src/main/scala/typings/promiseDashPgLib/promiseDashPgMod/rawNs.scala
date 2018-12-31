package typings
package promiseDashPgLib.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "raw")
@js.native
object rawNs extends js.Object {
  @js.native
  class Client ()
    extends pgLib.pgMod.Client {
    def this(config: java.lang.String) = this()
    def this(config: pgLib.pgMod.ClientConfig) = this()
  }
  
  @js.native
  class ClientBase ()
    extends pgLib.pgMod.ClientBase {
    def this(config: java.lang.String) = this()
    def this(config: pgLib.pgMod.ClientConfig) = this()
  }
  
  @js.native
  class Connection ()
    extends pgLib.pgMod.Connection {
    def this(config: pgLib.pgMod.ConnectionConfig) = this()
  }
  
  @js.native
  class Events ()
    extends pgLib.pgMod.Events
  
  @js.native
  // `new Pool('pg://user@localhost/mydb')` is not allowed.
  // But it passes type check because of issue:
  // https://github.com/Microsoft/TypeScript/issues/7485
  class Pool ()
    extends pgLib.pgMod.Pool {
    def this(config: pgLib.pgMod.PoolConfig) = this()
  }
  
  @js.native
  class Query ()
    extends pgLib.pgMod.Query
  
  val defaults: pgLib.pgMod.Defaults with pgLib.pgMod.ClientConfig = js.native
  val native: pgLib.Anon_Defaults | scala.Null = js.native
  val types: pgLib.Anon_GetTypeParser = js.native
}

