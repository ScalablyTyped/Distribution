package typings.smtpServer.mod

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
    val __obj = js.Dynamic.literal(clientHostname = clientHostname.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], hostNameAppearsAs = hostNameAppearsAs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], openingCommand = openingCommand.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], transmissionType = transmissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerSession]
  }
}

