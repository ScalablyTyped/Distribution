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
    extends pgLib.pgMod.Query {
    def this(queryTextOrConfig: java.lang.String) = this()
    def this(queryTextOrConfig: pgLib.pgMod.QueryConfig) = this()
    def this(queryTextOrConfig: java.lang.String, values: js.Array[_]) = this()
    def this(queryTextOrConfig: pgLib.pgMod.QueryConfig, values: js.Array[_]) = this()
  }
  
  val defaults: pgLib.pgMod.Defaults with pgLib.pgMod.ClientConfig = js.native
  val native: pgLib.TypeofPg | scala.Null = js.native
  @js.native
  object types extends js.Object {
    val arrayParserNs: pgLib.TypeofarrayParser = js.native
    def getTypeParser(oid: scala.Double, format: java.lang.String): pgDashTypesLib.pgDashTypesMod.TypeParser = js.native
    def setTypeParser(oid: scala.Double, format: java.lang.String, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
    def setTypeParser(oid: scala.Double, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
  }
  
}

