package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.request.requestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-verifier", "testProtocols")
@js.native
object testProtocols extends js.Object {
  def apply(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]): Unit = js.native
  def apply(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]
  ): Unit = js.native
}

