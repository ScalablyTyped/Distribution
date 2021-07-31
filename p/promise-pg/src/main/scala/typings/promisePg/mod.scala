package typings.promisePg

import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.pg.anon.TypeofPg
import typings.pg.mod.ConnectionConfig
import typings.pg.mod.Defaults_
import typings.pg.mod.PoolConfig
import typings.pg.mod.QueryResultRow
import typings.pgTypes.mod.TypeFormat
import typings.pgTypes.mod.TypeId
import typings.pgTypes.mod.TypesBuiltins
import typings.promisePg.promisePgStrings.drain
import typings.promisePg.promisePgStrings.error
import typings.promisePg.promisePgStrings.notice
import typings.promisePg.promisePgStrings.notification
import typings.q.mod.Promise
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-pg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-pg", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(config: ClientConfig) = this()
    def this(connection: String) = this()
    
    def connect(): Promise[Unit] = js.native
    
    def copyFrom(queryText: String): Writable = js.native
    
    def copyTo(queryText: String): Readable = js.native
    
    def end(): Promise[Unit] = js.native
    
    def on(event: String, listener: js.Function): Client = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): Client = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): Client = js.native
    @JSName("on")
    def on_notice(event: notice, listener: js.Function1[/* message */ js.Any, Unit]): Client = js.native
    @JSName("on")
    def on_notification(event: notification, listener: js.Function1[/* message */ js.Any, Unit]): Client = js.native
    
    def pauseDrain(): Unit = js.native
    
    def query(config: QueryConfig): Query = js.native
    def query(queryText: String): Query = js.native
    def query(queryText: String, values: js.Array[js.Any]): Query = js.native
    
    var raw: typings.pg.mod.Client = js.native
    
    def resumeDrain(): Unit = js.native
    
    def transaction(task: js.Function0[Promise[js.Any]]): Promise[js.Any] = js.native
  }
  
  @JSImport("promise-pg", "Query")
  @js.native
  class Query ()
    extends typings.pg.mod.Query[js.Any, js.Any] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typings.pg.mod.QueryConfig[js.Any]) = this()
    def this(queryTextOrConfig: String, values: js.Any) = this()
    def this(queryTextOrConfig: Unit, values: js.Any) = this()
    def this(queryTextOrConfig: typings.pg.mod.QueryConfig[js.Any], values: js.Any) = this()
    
    var promise: Promise[QueryResult] = js.native
  }
  
  @scala.inline
  def connect(connection: String): Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connection.asInstanceOf[js.Any]).asInstanceOf[Promise[Client]]
  @scala.inline
  def connect(connection: typings.pg.mod.ClientConfig): Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connection.asInstanceOf[js.Any]).asInstanceOf[Promise[Client]]
  
  @scala.inline
  def end(): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Promise[Unit]]
  
  object raw {
    
    @JSImport("promise-pg", "raw.Client")
    @js.native
    class Client ()
      extends typings.pg.mod.Client {
      def this(config: String) = this()
      def this(config: typings.pg.mod.ClientConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.ClientBase")
    @js.native
    class ClientBase ()
      extends typings.pg.mod.ClientBase {
      def this(config: String) = this()
      def this(config: typings.pg.mod.ClientConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Connection")
    @js.native
    class Connection ()
      extends typings.pg.mod.Connection {
      def this(config: ConnectionConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Events")
    @js.native
    class Events ()
      extends typings.pg.mod.Events {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("promise-pg", "raw.Pool")
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
    
    @JSImport("promise-pg", "raw.Query")
    @js.native
    class Query[R /* <: QueryResultRow */, I /* <: js.Array[js.Any] */] ()
      extends typings.pg.mod.Query[R, I] {
      def this(queryTextOrConfig: String) = this()
      def this(queryTextOrConfig: typings.pg.mod.QueryConfig[I]) = this()
      def this(queryTextOrConfig: String, values: I) = this()
      def this(queryTextOrConfig: Unit, values: I) = this()
      def this(queryTextOrConfig: typings.pg.mod.QueryConfig[I], values: I) = this()
    }
    
    @JSImport("promise-pg", "raw.defaults")
    @js.native
    val defaults: Defaults_ & typings.pg.mod.ClientConfig = js.native
    
    @JSImport("promise-pg", "raw.native")
    @js.native
    val native: TypeofPg | Null = js.native
    
    object types {
      
      @JSImport("promise-pg", "raw.types")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayParser")(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
      
      @JSImport("promise-pg", "raw.types.builtins")
      @js.native
      val builtins: TypesBuiltins = js.native
      
      @scala.inline
      def getTypeParser(id: TypeId): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      @scala.inline
      def getTypeParser(id: TypeId, format: TypeFormat): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @scala.inline
      def setTypeParser(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
  
  type ClientConfig = typings.pg.mod.ClientConfig
  
  trait QueryConfig
    extends StObject
       with typings.pg.mod.QueryConfig[js.Array[js.Any]] {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
  }
  object QueryConfig {
    
    @scala.inline
    def apply(text: String): QueryConfig = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryConfig]
    }
    
    @scala.inline
    implicit class QueryConfigMutableBuilder[Self <: QueryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    }
  }
  
  type QueryResult = typings.pg.mod.QueryResult[js.Any]
  
  type ResultBuilder = typings.pg.mod.ResultBuilder[js.Any]
}
