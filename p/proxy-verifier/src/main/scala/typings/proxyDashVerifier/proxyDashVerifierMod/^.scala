package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.request.requestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-verifier", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def test(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]): Unit = js.native
  def test(
    proxy: Proxy,
    options: TestOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, Unit]
  ): Unit = js.native
  def testAll(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ AllResults, Unit]): Unit = js.native
  def testAll(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ AllResults, Unit]
  ): Unit = js.native
  def testAnonymityLevel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]): Unit = js.native
  def testAnonymityLevel(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ String, Unit]
  ): Unit = js.native
  def testProtocol(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = js.native
  def testProtocol(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = js.native
  def testProtocols(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]): Unit = js.native
  def testProtocols(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, Unit]
  ): Unit = js.native
  def testTunnel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]): Unit = js.native
  def testTunnel(
    proxy: Proxy,
    options: CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, Unit]
  ): Unit = js.native
}

