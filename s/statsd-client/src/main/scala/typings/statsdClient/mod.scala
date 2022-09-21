package typings.statsdClient

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.statsdClient.anon.GetExpressMiddleware
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("statsd-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StatsdClient {
    def this(options: HttpOptions) = this()
    def this(options: TcpOptions) = this()
    def this(options: UdpOptions) = this()
  }
  
  trait CommonOptions extends StObject {
    
    /**
      * Print what is being sent to stderr (default false).
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefix all stats with this value (default "").
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Dual-use timer. Will flush metrics every interval. For UDP,
      * it auto-closes the socket after this long without activity
      * (default 1000 ms; 0 disables this). For TCP, it auto-closes
      * the socket after socketTimeoutsToClose number of timeouts
      * have elapsed without activity.
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Object of string key/value pairs which will be appended on
      * to all StatsD payloads (excluding raw payloads)
      * (default {})
      */
    var tags: js.UndefOr[Tags] = js.undefined
    
    /**
      * User specifically wants to use tcp (default false)
      */
    var tcp: js.UndefOr[Boolean] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTcp(value: Boolean): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
    }
  }
  
  trait ExpressMiddlewareOptions extends StObject {
    
    /**
      * Metric name to use for reporting if a matching route is not
      * found (default "unknown_express_route").
      */
    var notFoundRouteName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback called after reporting metrics for an
      * express route.
      */
    var onResponseEnd: js.UndefOr[
        js.Function4[
          /* client */ StatsdClient, 
          /* startTime */ js.Date, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Enables inclusion of per-URL response code and timing
      * metrics (default false).
      */
    var timeByUrl: js.UndefOr[Boolean] = js.undefined
  }
  object ExpressMiddlewareOptions {
    
    inline def apply(): ExpressMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressMiddlewareOptions]
    }
    
    extension [Self <: ExpressMiddlewareOptions](x: Self) {
      
      inline def setNotFoundRouteName(value: String): Self = StObject.set(x, "notFoundRouteName", value.asInstanceOf[js.Any])
      
      inline def setNotFoundRouteNameUndefined: Self = StObject.set(x, "notFoundRouteName", js.undefined)
      
      inline def setOnResponseEnd(
        value: (/* client */ StatsdClient, /* startTime */ js.Date, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Unit
      ): Self = StObject.set(x, "onResponseEnd", js.Any.fromFunction4(value))
      
      inline def setOnResponseEndUndefined: Self = StObject.set(x, "onResponseEnd", js.undefined)
      
      inline def setTimeByUrl(value: Boolean): Self = StObject.set(x, "timeByUrl", value.asInstanceOf[js.Any])
      
      inline def setTimeByUrlUndefined: Self = StObject.set(x, "timeByUrl", js.undefined)
    }
  }
  
  trait HttpOptions
    extends StObject
       with CommonOptions {
    
    /**
      * Additional headers to send (default {}).
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Where to send the stats (default localhost).
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * What HTTP method to use (default "PUT").
      */
    var method: js.UndefOr[String] = js.undefined
  }
  object HttpOptions {
    
    inline def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    extension [Self <: HttpOptions](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait StatsdClient extends StObject {
    
    def close(): this.type = js.native
    
    def counter(metric: String, delta: Double): this.type = js.native
    def counter(metric: String, delta: Double, tags: Tags): this.type = js.native
    
    def decrement(metric: String): this.type = js.native
    def decrement(metric: String, delta: Double): this.type = js.native
    def decrement(metric: String, delta: Double, tags: Tags): this.type = js.native
    def decrement(metric: String, delta: Unit, tags: Tags): this.type = js.native
    
    def distribution(name: String, value: Double): this.type = js.native
    def distribution(name: String, value: Double, tags: Tags): this.type = js.native
    
    def formatTags(): String = js.native
    def formatTags(tags: Tags): String = js.native
    
    def gauge(name: String, value: Double): this.type = js.native
    def gauge(name: String, value: Double, tags: Tags): this.type = js.native
    
    def gaugeDelta(name: String, delta: Double): this.type = js.native
    def gaugeDelta(name: String, delta: Double, tags: Tags): this.type = js.native
    
    def getChildClient(name: String): StatsdClient = js.native
    
    var helpers: GetExpressMiddleware = js.native
    
    def histogram(name: String, value: Double): this.type = js.native
    def histogram(name: String, value: Double, tags: Tags): this.type = js.native
    
    def increment(metric: String): this.type = js.native
    def increment(metric: String, delta: Double): this.type = js.native
    def increment(metric: String, delta: Double, tags: Tags): this.type = js.native
    def increment(metric: String, delta: Unit, tags: Tags): this.type = js.native
    
    def raw(rawData: String): this.type = js.native
    
    def set(name: String, value: Double): this.type = js.native
    def set(name: String, value: Double, tags: Tags): this.type = js.native
    
    def timing(name: String, startOrDuration: js.Date): this.type = js.native
    def timing(name: String, startOrDuration: js.Date, tags: Tags): this.type = js.native
    def timing(name: String, startOrDuration: Double): this.type = js.native
    def timing(name: String, startOrDuration: Double, tags: Tags): this.type = js.native
  }
  
  type Tags = StringDictionary[String | Double]
  
  trait TcpOptions
    extends StObject
       with CommonOptions {
    
    /**
      * Where to send the stats (default localhost).
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Port to contact the statsd-daemon on (default 8125).
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of timeouts in which the socket auto-closes if it
      * has been inactive. (default 10; 1 to auto-close after a
      * single timeout).
      */
    var socketTimeoutsToClose: Double
  }
  object TcpOptions {
    
    inline def apply(socketTimeoutsToClose: Double): TcpOptions = {
      val __obj = js.Dynamic.literal(socketTimeoutsToClose = socketTimeoutsToClose.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpOptions]
    }
    
    extension [Self <: TcpOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSocketTimeoutsToClose(value: Double): Self = StObject.set(x, "socketTimeoutsToClose", value.asInstanceOf[js.Any])
    }
  }
  
  trait UdpOptions
    extends StObject
       with CommonOptions {
    
    /**
      * Where to send the stats (default localhost).
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Port to contact the statsd-daemon on (default 8125).
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object UdpOptions {
    
    inline def apply(): UdpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UdpOptions]
    }
    
    extension [Self <: UdpOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait WrappedCallbackOptions extends StObject {
    
    /**
      * Object of string key/value pairs which will be appended on
      * to all StatsD payloads (excluding raw payloads)
      * (default {})
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  object WrappedCallbackOptions {
    
    inline def apply(): WrappedCallbackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedCallbackOptions]
    }
    
    extension [Self <: WrappedCallbackOptions](x: Self) {
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
