package typings.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proxy-verifier", "test")
@js.native
object test extends js.Object {
  
  def apply(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]): Unit = js.native
  def apply(
    proxy: Proxy,
    options: TestOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]
  ): Unit = js.native
}
