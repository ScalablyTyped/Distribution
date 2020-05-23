package typings.promisePg.mod

import typings.pg.anon.TypeofPg
import typings.pg.anon.TypeofarrayParser
import typings.pg.mod.ConnectionConfig
import typings.pg.mod.Defaults_
import typings.pg.mod.PoolConfig
import typings.pg.mod.QueryResultRow
import typings.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "raw")
@js.native
object raw extends js.Object {
  @js.native
  class Client ()
    extends typings.pg.mod.Client {
    def this(config: String) = this()
    def this(config: typings.pg.mod.ClientConfig) = this()
  }
  
  @js.native
  class ClientBase ()
    extends typings.pg.mod.ClientBase {
    def this(config: String) = this()
    def this(config: typings.pg.mod.ClientConfig) = this()
  }
  
  @js.native
  class Connection ()
    extends typings.pg.mod.Connection {
    def this(config: ConnectionConfig) = this()
  }
  
  @js.native
  class Events ()
    extends typings.pg.mod.Events
  
  @js.native
  /**
    * Every field of the config object is entirely optional.
    * The config passed to the pool is also passed to every client
    * instance within the pool when the pool creates that client.
    */
  class Pool ()
    extends typings.pg.mod.Pool {
    def this(config: PoolConfig) = this()
  }
  
  @js.native
  class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
    extends typings.pg.mod.Query[R, I] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typings.pg.mod.QueryConfig[I]) = this()
    def this(queryTextOrConfig: String, values: I) = this()
    def this(queryTextOrConfig: typings.pg.mod.QueryConfig[I], values: I) = this()
  }
  
  val defaults: Defaults_ with typings.pg.mod.ClientConfig = js.native
  val native: TypeofPg | Null = js.native
  @js.native
  object types extends js.Object {
    val arrayParser: TypeofarrayParser = js.native
    def getTypeParser(oid: Double, format: String): TypeParser = js.native
    def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
    def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
  }
  
}

