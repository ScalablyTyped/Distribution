package typings.siege

import typings.siege.anon.C2mem
import typings.siege.siegeStrings.color
import typings.siege.siegeStrings.json
import typings.siege.siegeStrings.plain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Siege = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Siege]
  inline def apply(options: Options): Siege = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Siege]
  inline def apply(path: String): Siege = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Siege]
  inline def apply(path: String, options: Options): Siege = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Siege]
  inline def apply(path: Unit, options: Options): Siege = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Siege]
  
  @JSImport("siege", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait For[T] extends StObject {
    
    val seconds: T
    
    val times: T
  }
  object For {
    
    inline def apply[T](seconds: T, times: T): For[T] = {
      val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[For[T]]
    }
    
    extension [Self <: For[?], T](x: Self & For[T]) {
      
      inline def setSeconds(value: T): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setTimes(value: T): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.siege.siegeStrings.GET
    - typings.siege.siegeStrings.POST
  */
  trait Method extends StObject
  object Method {
    
    inline def GET: typings.siege.siegeStrings.GET = "GET".asInstanceOf[typings.siege.siegeStrings.GET]
    
    inline def POST: typings.siege.siegeStrings.POST = "POST".asInstanceOf[typings.siege.siegeStrings.POST]
  }
  
  trait Options extends StObject {
    
    var agent: js.UndefOr[String] = js.undefined
    
    var concurrent: js.UndefOr[Double] = js.undefined
    
    var enable304: js.UndefOr[Boolean] = js.undefined
    
    var enableCookie: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[Method] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var requestCert: js.UndefOr[Boolean] = js.undefined
    
    var serve: js.UndefOr[String] = js.undefined
    
    var sslProtocol: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      inline def setEnable304(value: Boolean): Self = StObject.set(x, "enable304", value.asInstanceOf[js.Any])
      
      inline def setEnable304Undefined: Self = StObject.set(x, "enable304", js.undefined)
      
      inline def setEnableCookie(value: Boolean): Self = StObject.set(x, "enableCookie", value.asInstanceOf[js.Any])
      
      inline def setEnableCookieUndefined: Self = StObject.set(x, "enableCookie", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
      
      inline def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
      
      inline def setServe(value: String): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      
      inline def setSslProtocol(value: Boolean): Self = StObject.set(x, "sslProtocol", value.asInstanceOf[js.Any])
      
      inline def setSslProtocolUndefined: Self = StObject.set(x, "sslProtocol", js.undefined)
    }
  }
  
  trait ReportOptions extends StObject {
    
    var graph: js.UndefOr[C2mem] = js.undefined
    
    var responseTime: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rps: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[json | plain | color] = js.undefined
    
    var weight: js.UndefOr[Boolean] = js.undefined
  }
  object ReportOptions {
    
    inline def apply(): ReportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOptions]
    }
    
    extension [Self <: ReportOptions](x: Self) {
      
      inline def setGraph(value: C2mem): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setResponseTime(value: js.Array[Double]): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
      
      inline def setResponseTimeVarargs(value: Double*): Self = StObject.set(x, "responseTime", js.Array(value*))
      
      inline def setRps(value: Boolean): Self = StObject.set(x, "rps", value.asInstanceOf[js.Any])
      
      inline def setRpsUndefined: Self = StObject.set(x, "rps", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: json | plain | color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait Siege extends StObject {
    
    def agent(agent: String): Siege = js.native
    
    def attack(): Unit = js.native
    
    def concurrent(n: Double): Siege = js.native
    
    def describe(description: String): Task = js.native
    
    def `for`(n: Double): For[Siege] = js.native
    
    def get(url: String): Siege = js.native
    def get(url: String, query: Stringifiable): Siege = js.native
    
    def host(host: String): Siege = js.native
    
    def hostname(hostname: String): Siege = js.native
    
    def on(port: Double): Siege = js.native
    
    def post(url: String, params: Stringifiable): Siege = js.native
    
    def rejectUnauthorized(rejectUnauthorized: Boolean): Siege = js.native
    
    def report(options: ReportOptions): Siege = js.native
    
    def requestCert(requestCert: Boolean): Siege = js.native
    
    def set(name: String, value: String): Siege = js.native
    
    def sslProtocol(sslProtocol: Boolean): Siege = js.native
    
    def wait(ms: Double): Siege = js.native
    
    val with304: Siege = js.native
    
    val withCookie: Siege = js.native
    
    val without304: js.UndefOr[Siege] = js.native
    
    val withoutCookie: Siege = js.native
  }
  
  type Stringifiable = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<string | number | boolean | ReadonlyArray<string> | ReadonlyArray<number> | ReadonlyArray<boolean> | null> */ Any
  
  trait Task extends StObject {
    
    def concurrent(concurrent: Double): Task
    
    def `for`(num: Double): For[Task]
    
    def report(options: ReportOptions): Unit
    
    def request(options: typings.siege.anon.Method): Unit
    
    val with304: Siege
    
    val withCookie: Siege
    
    val without304: js.UndefOr[Siege] = js.undefined
    
    val withoutCookie: Siege
  }
  object Task {
    
    inline def apply(
      concurrent: Double => Task,
      `for`: Double => For[Task],
      report: ReportOptions => Unit,
      request: typings.siege.anon.Method => Unit,
      with304: Siege,
      withCookie: Siege,
      withoutCookie: Siege
    ): Task = {
      val __obj = js.Dynamic.literal(concurrent = js.Any.fromFunction1(concurrent), report = js.Any.fromFunction1(report), request = js.Any.fromFunction1(request), with304 = with304.asInstanceOf[js.Any], withCookie = withCookie.asInstanceOf[js.Any], withoutCookie = withoutCookie.asInstanceOf[js.Any])
      __obj.updateDynamic("for")(js.Any.fromFunction1(`for`))
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setConcurrent(value: Double => Task): Self = StObject.set(x, "concurrent", js.Any.fromFunction1(value))
      
      inline def setFor(value: Double => For[Task]): Self = StObject.set(x, "for", js.Any.fromFunction1(value))
      
      inline def setReport(value: ReportOptions => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
      
      inline def setRequest(value: typings.siege.anon.Method => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setWith304(value: Siege): Self = StObject.set(x, "with304", value.asInstanceOf[js.Any])
      
      inline def setWithCookie(value: Siege): Self = StObject.set(x, "withCookie", value.asInstanceOf[js.Any])
      
      inline def setWithout304(value: Siege): Self = StObject.set(x, "without304", value.asInstanceOf[js.Any])
      
      inline def setWithout304Undefined: Self = StObject.set(x, "without304", js.undefined)
      
      inline def setWithoutCookie(value: Siege): Self = StObject.set(x, "withoutCookie", value.asInstanceOf[js.Any])
    }
  }
}
