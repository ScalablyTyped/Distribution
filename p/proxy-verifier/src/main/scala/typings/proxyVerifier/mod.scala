package typings.proxyVerifier

import org.scalablytyped.runtime.StringDictionary
import typings.proxyVerifier.anon.Code
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import typings.proxyVerifier.proxyVerifierBooleans.`true`
import typings.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proxy-verifier", "test")
  @js.native
  def test(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]): Unit = js.native
  @JSImport("proxy-verifier", "test")
  @js.native
  def test(
    proxy: Proxy,
    options: TestOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]
  ): Unit = js.native
  
  @JSImport("proxy-verifier", "testAll")
  @js.native
  def testAll(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ AllResults, Unit]): Unit = js.native
  @JSImport("proxy-verifier", "testAll")
  @js.native
  def testAll(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ AllResults, Unit]
  ): Unit = js.native
  
  @JSImport("proxy-verifier", "testAnonymityLevel")
  @js.native
  def testAnonymityLevel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]): Unit = js.native
  @JSImport("proxy-verifier", "testAnonymityLevel")
  @js.native
  def testAnonymityLevel(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]
  ): Unit = js.native
  
  @JSImport("proxy-verifier", "testProtocol")
  @js.native
  def testProtocol(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = js.native
  @JSImport("proxy-verifier", "testProtocol")
  @js.native
  def testProtocol(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = js.native
  
  @JSImport("proxy-verifier", "testProtocols")
  @js.native
  def testProtocols(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]): Unit = js.native
  @JSImport("proxy-verifier", "testProtocols")
  @js.native
  def testProtocols(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]
  ): Unit = js.native
  
  @JSImport("proxy-verifier", "testTunnel")
  @js.native
  def testTunnel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = js.native
  @JSImport("proxy-verifier", "testTunnel")
  @js.native
  def testTunnel(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = js.native
  
  @js.native
  trait AllResults extends StObject {
    
    var anonymityLevel: js.UndefOr[AnonymityLevel] = js.native
    
    var protocols: js.UndefOr[ProtocolResult] = js.native
    
    var tunnel: js.UndefOr[Result] = js.native
  }
  object AllResults {
    
    @scala.inline
    def apply(): AllResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllResults]
    }
    
    @scala.inline
    implicit class AllResultsMutableBuilder[Self <: AllResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymityLevel(value: AnonymityLevel): Self = StObject.set(x, "anonymityLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymityLevelUndefined: Self = StObject.set(x, "anonymityLevel", js.undefined)
      
      @scala.inline
      def setProtocols(value: ProtocolResult): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setTunnel(value: Result): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.proxyVerifierStrings.transparent
    - typings.proxyVerifier.proxyVerifierStrings.anonymous
    - typings.proxyVerifier.proxyVerifierStrings.elite
  */
  trait AnonymityLevel extends StObject
  object AnonymityLevel {
    
    @scala.inline
    def anonymous: typings.proxyVerifier.proxyVerifierStrings.anonymous = "anonymous".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.anonymous]
    
    @scala.inline
    def elite: typings.proxyVerifier.proxyVerifierStrings.elite = "elite".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.elite]
    
    @scala.inline
    def transparent: typings.proxyVerifier.proxyVerifierStrings.transparent = "transparent".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.transparent]
  }
  
  @js.native
  trait CustomTestBaseResult extends StObject {
    
    var data: String = js.native
    
    var headers: Headers = js.native
    
    var status: Double = js.native
  }
  object CustomTestBaseResult {
    
    @scala.inline
    def apply(data: String, headers: Headers, status: Double): CustomTestBaseResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTestBaseResult]
    }
    
    @scala.inline
    implicit class CustomTestBaseResultMutableBuilder[Self <: CustomTestBaseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomTestNotWorkingResult
    extends CustomTestBaseResult
       with CustomTestResult {
    
    var error: Code = js.native
    
    var ok: `false` = js.native
  }
  object CustomTestNotWorkingResult {
    
    @scala.inline
    def apply(data: String, error: Code, headers: Headers, ok: `false`, status: Double): CustomTestNotWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTestNotWorkingResult]
    }
    
    @scala.inline
    implicit class CustomTestNotWorkingResultMutableBuilder[Self <: CustomTestNotWorkingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.mod.CustomTestWorkingResult
    - typings.proxyVerifier.mod.CustomTestNotWorkingResult
  */
  trait CustomTestResult extends StObject
  object CustomTestResult {
    
    @scala.inline
    def CustomTestNotWorkingResult(data: String, error: Code, headers: Headers, ok: `false`, status: Double): typings.proxyVerifier.mod.CustomTestNotWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.proxyVerifier.mod.CustomTestNotWorkingResult]
    }
    
    @scala.inline
    def CustomTestWorkingResult(data: String, headers: Headers, ok: `true`, status: Double): typings.proxyVerifier.mod.CustomTestWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.proxyVerifier.mod.CustomTestWorkingResult]
    }
  }
  
  @js.native
  trait CustomTestWorkingResult
    extends CustomTestBaseResult
       with CustomTestResult {
    
    var ok: `true` = js.native
  }
  object CustomTestWorkingResult {
    
    @scala.inline
    def apply(data: String, headers: Headers, ok: `true`, status: Double): CustomTestWorkingResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTestWorkingResult]
    }
    
    @scala.inline
    implicit class CustomTestWorkingResultMutableBuilder[Self <: CustomTestWorkingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  @js.native
  trait NotWorkingResult extends Result {
    
    var error: Code = js.native
    
    var ok: `false` = js.native
  }
  object NotWorkingResult {
    
    @scala.inline
    def apply(error: Code, ok: `false`): NotWorkingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotWorkingResult]
    }
    
    @scala.inline
    implicit class NotWorkingResultMutableBuilder[Self <: NotWorkingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def http: typings.proxyVerifier.proxyVerifierStrings.http = "http".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.http]
    
    @scala.inline
    def https: typings.proxyVerifier.proxyVerifierStrings.https = "https".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.https]
    
    @scala.inline
    def socks4: typings.proxyVerifier.proxyVerifierStrings.socks4 = "socks4".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.socks4]
    
    @scala.inline
    def socks5: typings.proxyVerifier.proxyVerifierStrings.socks5 = "socks5".asInstanceOf[typings.proxyVerifier.proxyVerifierStrings.socks5]
  }
  
  type ProtocolResult = StringDictionary[Result]
  
  @js.native
  trait Proxy extends StObject {
    
    /**
      * Proxy-Authorization header
      */
    var auth: js.UndefOr[String] = js.native
    
    var ipAddress: String = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[Protocol] = js.native
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  }
  object Proxy {
    
    @scala.inline
    def apply(ipAddress: String, port: Double): Proxy = {
      val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proxy]
    }
    
    @scala.inline
    implicit class ProxyMutableBuilder[Self <: Proxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyVerifier.mod.WorkingResult
    - typings.proxyVerifier.mod.NotWorkingResult
  */
  trait Result extends StObject
  object Result {
    
    @scala.inline
    def NotWorkingResult(error: Code, ok: `false`): typings.proxyVerifier.mod.NotWorkingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.proxyVerifier.mod.NotWorkingResult]
    }
    
    @scala.inline
    def WorkingResult(ok: `true`): typings.proxyVerifier.mod.WorkingResult = {
      val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.proxyVerifier.mod.WorkingResult]
    }
  }
  
  @js.native
  trait TestOptions extends StObject {
    
    def testFn(data: String, status: Double, headers: Headers): Unit = js.native
    
    var testUrl: String = js.native
  }
  object TestOptions {
    
    @scala.inline
    def apply(testFn: (String, Double, Headers) => Unit, testUrl: String): TestOptions = {
      val __obj = js.Dynamic.literal(testFn = js.Any.fromFunction3(testFn), testUrl = testUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOptions]
    }
    
    @scala.inline
    implicit class TestOptionsMutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTestFn(value: (String, Double, Headers) => Unit): Self = StObject.set(x, "testFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTestUrl(value: String): Self = StObject.set(x, "testUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkingResult extends Result {
    
    var ok: `true` = js.native
  }
  object WorkingResult {
    
    @scala.inline
    def apply(ok: `true`): WorkingResult = {
      val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkingResult]
    }
    
    @scala.inline
    implicit class WorkingResultMutableBuilder[Self <: WorkingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
}
