package typings.proxyVerifier

import org.scalablytyped.runtime.StringDictionary
import typings.proxyVerifier.anon.Code
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import typings.proxyVerifier.proxyVerifierBooleans.`true`
import typings.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proxy-verifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def test(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(proxy.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def test(
    proxy: Proxy,
    options: TestOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testAll(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ AllResults, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testAll")(proxy.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def testAll(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ AllResults, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testAll")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testAnonymityLevel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testAnonymityLevel")(proxy.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def testAnonymityLevel(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testAnonymityLevel")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testProtocol(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testProtocol")(proxy.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def testProtocol(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testProtocol")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testProtocols(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testProtocols")(proxy.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def testProtocols(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testProtocols")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testTunnel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testTunnel")(proxy.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def testTunnel(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("testTunnel")(proxy.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AllResults extends StObject {
    
    var anonymityLevel: js.UndefOr[AnonymityLevel] = js.undefined
    
    var protocols: js.UndefOr[ProtocolResult] = js.undefined
    
    var tunnel: js.UndefOr[Result] = js.undefined
  }
  object AllResults {
    
    inline def apply(): AllResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllResults]
    }
    
    extension [Self <: AllResults](x: Self) {
      
      inline def setAnonymityLevel(value: AnonymityLevel): Self = StObject.set(x, "anonymityLevel", value.asInstanceOf[js.Any])
      
      inline def setAnonymityLevelUndefined: Self = StObject.set(x, "anonymityLevel", js.undefined)
      
      inline def setProtocols(value: ProtocolResult): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setTunnel(value: Result): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
      
      inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.proxyVerifierStrings.transparent
    - typings.proxyVerifier.proxyVerifierStrings.anonymous
    - typings.proxyVerifier.proxyVerifierStrings.elite
  */
  trait AnonymityLevel extends StObject
  object AnonymityLevel {
    
    inline def anonymous: typings.proxyVerifier.proxyVerifierStrings.anonymous = "anonymous".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.anonymous]
    
    inline def elite: typings.proxyVerifier.proxyVerifierStrings.elite = "elite".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.elite]
    
    inline def transparent: typings.proxyVerifier.proxyVerifierStrings.transparent = "transparent".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.transparent]
  }
  
  trait CustomTestBaseResult extends StObject {
    
    var data: String
    
    var headers: Headers
    
    var status: Double
  }
  object CustomTestBaseResult {
    
    inline def apply(data: String, headers: Headers, status: Double): CustomTestBaseResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTestBaseResult]
    }
    
    extension [Self <: CustomTestBaseResult](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomTestNotWorkingResult
    extends StObject
       with CustomTestBaseResult
       with CustomTestResult {
    
    var error: Code
    
    var ok: `false`
  }
  object CustomTestNotWorkingResult {
    
    inline def apply(data: String, error: Code, headers: Headers, status: Double): CustomTestNotWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = false, status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTestNotWorkingResult]
    }
    
    extension [Self <: CustomTestNotWorkingResult](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.mod.CustomTestWorkingResult
    - typings.proxyVerifier.mod.CustomTestNotWorkingResult
  */
  trait CustomTestResult extends StObject
  object CustomTestResult {
    
    inline def CustomTestNotWorkingResult(data: String, error: Code, headers: Headers, status: Double): typings.proxyVerifier.mod.CustomTestNotWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = false, status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.proxyVerifier.mod.CustomTestNotWorkingResult]
    }
    
    inline def CustomTestWorkingResult(data: String, headers: Headers, status: Double): typings.proxyVerifier.mod.CustomTestWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = true, status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.proxyVerifier.mod.CustomTestWorkingResult]
    }
  }
  
  trait CustomTestWorkingResult
    extends StObject
       with CustomTestBaseResult
       with CustomTestResult {
    
    var ok: `true`
  }
  object CustomTestWorkingResult {
    
    inline def apply(data: String, headers: Headers, status: Double): CustomTestWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = true, status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTestWorkingResult]
    }
    
    extension [Self <: CustomTestWorkingResult](x: Self) {
      
      inline def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait NotWorkingResult
    extends StObject
       with Result {
    
    var error: Code
    
    var ok: `false`
  }
  object NotWorkingResult {
    
    inline def apply(error: Code): NotWorkingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = false)
      __obj.asInstanceOf[NotWorkingResult]
    }
    
    extension [Self <: NotWorkingResult](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.proxyVerifierStrings.http
    - typings.proxyVerifier.proxyVerifierStrings.https
    - typings.proxyVerifier.proxyVerifierStrings.socks5
    - typings.proxyVerifier.proxyVerifierStrings.socks4
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def http: typings.proxyVerifier.proxyVerifierStrings.http = "http".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.http]
    
    inline def https: typings.proxyVerifier.proxyVerifierStrings.https = "https".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.https]
    
    inline def socks4: typings.proxyVerifier.proxyVerifierStrings.socks4 = "socks4".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.socks4]
    
    inline def socks5: typings.proxyVerifier.proxyVerifierStrings.socks5 = "socks5".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.socks5]
  }
  
  type ProtocolResult = StringDictionary[Result]
  
  trait Proxy extends StObject {
    
    /**
      * Proxy-Authorization header
      */
    var auth: js.UndefOr[String] = js.undefined
    
    var ipAddress: String
    
    var port: Double
    
    var protocol: js.UndefOr[Protocol] = js.undefined
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  }
  object Proxy {
    
    inline def apply(ipAddress: String, port: Double): Proxy = {
      val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proxy]
    }
    
    extension [Self <: Proxy](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.mod.WorkingResult
    - typings.proxyVerifier.mod.NotWorkingResult
  */
  trait Result extends StObject
  object Result {
    
    inline def NotWorkingResult(error: Code): typings.proxyVerifier.mod.NotWorkingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = false)
      __obj.asInstanceOf[typings.proxyVerifier.mod.NotWorkingResult]
    }
    
    inline def WorkingResult(): typings.proxyVerifier.mod.WorkingResult = {
      val __obj = js.Dynamic.literal(ok = true)
      __obj.asInstanceOf[typings.proxyVerifier.mod.WorkingResult]
    }
  }
  
  trait TestOptions extends StObject {
    
    def testFn(data: String, status: Double, headers: Headers): Unit
    
    var testUrl: String
  }
  object TestOptions {
    
    inline def apply(testFn: (String, Double, Headers) => Unit, testUrl: String): TestOptions = {
      val __obj = js.Dynamic.literal(testFn = js.Any.fromFunction3(testFn), testUrl = testUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOptions]
    }
    
    extension [Self <: TestOptions](x: Self) {
      
      inline def setTestFn(value: (String, Double, Headers) => Unit): Self = StObject.set(x, "testFn", js.Any.fromFunction3(value))
      
      inline def setTestUrl(value: String): Self = StObject.set(x, "testUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkingResult
    extends StObject
       with Result {
    
    var ok: `true`
  }
  object WorkingResult {
    
    inline def apply(): WorkingResult = {
      val __obj = js.Dynamic.literal(ok = true)
      __obj.asInstanceOf[WorkingResult]
    }
    
    extension [Self <: WorkingResult](x: Self) {
      
      inline def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
}
