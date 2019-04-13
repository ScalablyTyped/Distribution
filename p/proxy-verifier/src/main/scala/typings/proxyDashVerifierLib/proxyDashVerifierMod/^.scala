package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-verifier", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def test(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, scala.Unit]): scala.Unit = js.native
  def test(
    proxy: Proxy,
    options: TestOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ CustomTestResult, scala.Unit]
  ): scala.Unit = js.native
  def testAll(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ AllResults, scala.Unit]): scala.Unit = js.native
  def testAll(
    proxy: Proxy,
    options: requestLib.requestMod.CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ AllResults, scala.Unit]
  ): scala.Unit = js.native
  def testAnonymityLevel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def testAnonymityLevel(
    proxy: Proxy,
    options: requestLib.requestMod.CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def testProtocol(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, scala.Unit]): scala.Unit = js.native
  def testProtocol(
    proxy: Proxy,
    options: requestLib.requestMod.CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, scala.Unit]
  ): scala.Unit = js.native
  def testProtocols(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, scala.Unit]): scala.Unit = js.native
  def testProtocols(
    proxy: Proxy,
    options: requestLib.requestMod.CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ ProtocolResult, scala.Unit]
  ): scala.Unit = js.native
  def testTunnel(proxy: Proxy, cb: js.Function2[/* error */ js.Any, /* result */ Result, scala.Unit]): scala.Unit = js.native
  def testTunnel(
    proxy: Proxy,
    options: requestLib.requestMod.CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ Result, scala.Unit]
  ): scala.Unit = js.native
}

