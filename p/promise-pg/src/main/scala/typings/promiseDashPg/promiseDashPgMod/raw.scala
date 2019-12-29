package typings.promiseDashPg.promiseDashPgMod

import typings.pg.TypeofPg
import typings.pg.TypeofarrayParser
import typings.pg.pgMod.ConnectionConfig
import typings.pg.pgMod.Defaults
import typings.pg.pgMod.PoolConfig
import typings.pg.pgMod.QueryResultRow
import typings.pgDashTypes.pgDashTypesMod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "raw")
@js.native
object raw extends js.Object {
  @js.native
  class Client ()
    extends typings.pg.pgMod.Client {
    def this(config: String) = this()
    def this(config: typings.pg.pgMod.ClientConfig) = this()
  }
  
  @js.native
  class ClientBase ()
    extends typings.pg.pgMod.ClientBase {
    def this(config: String) = this()
    def this(config: typings.pg.pgMod.ClientConfig) = this()
  }
  
  @js.native
  class Connection ()
    extends typings.pg.pgMod.Connection {
    def this(config: ConnectionConfig) = this()
  }
  
  @js.native
  class Events ()
    extends typings.pg.pgMod.Events
  
  @js.native
  /**
    * Every field of the config object is entirely optional.
    * The config passed to the pool is also passed to every client
    * instance within the pool when the pool creates that client.
    */
  class Pool ()
    extends typings.pg.pgMod.Pool {
    def this(config: PoolConfig) = this()
  }
  
  @js.native
  class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
    extends typings.pg.pgMod.Query[R, I] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typings.pg.pgMod.QueryConfig[I]) = this()
    def this(queryTextOrConfig: String, values: I) = this()
    def this(queryTextOrConfig: typings.pg.pgMod.QueryConfig[I], values: I) = this()
  }
  
  val defaults: Defaults with typings.pg.pgMod.ClientConfig = js.native
  val native: TypeofPg | Null = js.native
  @js.native
  object types extends js.Object {
    val arrayParser: TypeofarrayParser = js.native
    def getTypeParser(oid: Double, format: String): TypeParser = js.native
    def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
    def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
  }
  
}

