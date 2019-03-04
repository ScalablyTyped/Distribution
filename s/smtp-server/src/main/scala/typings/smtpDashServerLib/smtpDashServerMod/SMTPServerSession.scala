package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerSession extends js.Object {
  /**
    * reverse resolved hostname for remoteAddress
    */
  var clientHostname: java.lang.String
  /**
    * Envelope Object
    */
  var envelope: SMTPServerEnvelope
  /**
    * hostname the client provided with HELO/EHLO call
    */
  var hostNameAppearsAs: java.lang.String
  /**
    * random string identificator generated when the client connected
    */
  var id: java.lang.String
  /**
    * local IP address for the connected client
    */
  var localAddress: java.lang.String
  /**
    * local port number for the connected client
    */
  var localPort: scala.Double
  /**
    * the opening SMTP command (HELO/EHLO/LHLO)
    */
  var openingCommand: java.lang.String
  /**
    * remote IP address for the connected client
    */
  var remoteAddress: java.lang.String
  /**
    * remote port number for the connected client
    */
  var remotePort: scala.Double
  /**
    *  If true, then the connection is using TLS
    */
  var secure: scala.Boolean
  var tlsOptions: nodeLib.tlsMod.TlsOptions
  var transmissionType: java.lang.String
}

object SMTPServerSession {
  @scala.inline
  def apply(
    clientHostname: java.lang.String,
    envelope: SMTPServerEnvelope,
    hostNameAppearsAs: java.lang.String,
    id: java.lang.String,
    localAddress: java.lang.String,
    localPort: scala.Double,
    openingCommand: java.lang.String,
    remoteAddress: java.lang.String,
    remotePort: scala.Double,
    secure: scala.Boolean,
    tlsOptions: nodeLib.tlsMod.TlsOptions,
    transmissionType: java.lang.String
  ): SMTPServerSession = {
    val __obj = js.Dynamic.literal(clientHostname = clientHostname, envelope = envelope, hostNameAppearsAs = hostNameAppearsAs, id = id, localAddress = localAddress, localPort = localPort, openingCommand = openingCommand, remoteAddress = remoteAddress, remotePort = remotePort, secure = secure, tlsOptions = tlsOptions, transmissionType = transmissionType)
  
    __obj.asInstanceOf[SMTPServerSession]
  }
}

