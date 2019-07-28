package typings.smtpDashServer.smtpDashServerMod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerSession extends js.Object {
  /**
    * reverse resolved hostname for remoteAddress
    */
  var clientHostname: String
  /**
    * Envelope Object
    */
  var envelope: SMTPServerEnvelope
  /**
    * hostname the client provided with HELO/EHLO call
    */
  var hostNameAppearsAs: String
  /**
    * random string identificator generated when the client connected
    */
  var id: String
  /**
    * local IP address for the connected client
    */
  var localAddress: String
  /**
    * local port number for the connected client
    */
  var localPort: Double
  /**
    * the opening SMTP command (HELO/EHLO/LHLO)
    */
  var openingCommand: String
  /**
    * remote IP address for the connected client
    */
  var remoteAddress: String
  /**
    * remote port number for the connected client
    */
  var remotePort: Double
  /**
    *  If true, then the connection is using TLS
    */
  var secure: Boolean
  var tlsOptions: TlsOptions
  var transmissionType: String
}

object SMTPServerSession {
  @scala.inline
  def apply(
    clientHostname: String,
    envelope: SMTPServerEnvelope,
    hostNameAppearsAs: String,
    id: String,
    localAddress: String,
    localPort: Double,
    openingCommand: String,
    remoteAddress: String,
    remotePort: Double,
    secure: Boolean,
    tlsOptions: TlsOptions,
    transmissionType: String
  ): SMTPServerSession = {
    val __obj = js.Dynamic.literal(clientHostname = clientHostname, envelope = envelope, hostNameAppearsAs = hostNameAppearsAs, id = id, localAddress = localAddress, localPort = localPort, openingCommand = openingCommand, remoteAddress = remoteAddress, remotePort = remotePort, secure = secure, tlsOptions = tlsOptions, transmissionType = transmissionType)
  
    __obj.asInstanceOf[SMTPServerSession]
  }
}

