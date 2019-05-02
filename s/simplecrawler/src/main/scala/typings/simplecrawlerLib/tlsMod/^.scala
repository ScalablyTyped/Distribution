package typings
package simplecrawlerLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: ConnectionOptions): TLSSocket = js.native
  def connect(options: ConnectionOptions, secureConnectionListener: js.Function0[scala.Unit]): TLSSocket = js.native
  def connect(port: scala.Double): TLSSocket = js.native
  def connect(port: scala.Double, host: java.lang.String): TLSSocket = js.native
  def connect(port: scala.Double, host: java.lang.String, options: ConnectionOptions): TLSSocket = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): TLSSocket = js.native
  def connect(port: scala.Double, options: ConnectionOptions): TLSSocket = js.native
  def connect(port: scala.Double, options: ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): TLSSocket = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: simplecrawlerLib.cryptoMod.Credentials): SecurePair = js.native
  def createSecurePair(credentials: simplecrawlerLib.cryptoMod.Credentials, isServer: scala.Boolean): SecurePair = js.native
  def createSecurePair(
    credentials: simplecrawlerLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean
  ): SecurePair = js.native
  def createSecurePair(
    credentials: simplecrawlerLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): SecurePair = js.native
  def createServer(options: TlsOptions): Server = js.native
  def createServer(options: TlsOptions, secureConnectionListener: js.Function1[/* socket */ TLSSocket, scala.Unit]): Server = js.native
}

