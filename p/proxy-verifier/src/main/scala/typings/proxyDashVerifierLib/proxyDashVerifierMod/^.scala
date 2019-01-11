package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-verifier", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def test(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.CustomTestResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def test(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    options: proxyDashVerifierLib.proxyDashVerifierMod.TestOptions,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.CustomTestResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testAll(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.AllResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testAll(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    options: requestLib.requestMod.requestNs.CoreOptions,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.AllResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testAnonymityLevel(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    cb: js.Function2[/* error */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def testAnonymityLevel(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    options: requestLib.requestMod.requestNs.CoreOptions,
    cb: js.Function2[/* error */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def testProtocol(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testProtocol(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    options: requestLib.requestMod.requestNs.CoreOptions,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testProtocols(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.ProtocolResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testProtocols(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    options: requestLib.requestMod.requestNs.CoreOptions,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.ProtocolResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testTunnel(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def testTunnel(
    proxy: proxyDashVerifierLib.proxyDashVerifierMod.Proxy,
    options: requestLib.requestMod.requestNs.CoreOptions,
    cb: js.Function2[
      /* error */ js.Any, 
      /* result */ proxyDashVerifierLib.proxyDashVerifierMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

