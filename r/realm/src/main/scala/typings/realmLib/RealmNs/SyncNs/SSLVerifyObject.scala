package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLVerifyObject extends js.Object {
  var acceptedByOpenSSL: scala.Boolean
  var depth: scala.Double
  var pemCertificate: java.lang.String
  var serverAddress: java.lang.String
  var serverPort: scala.Double
}

object SSLVerifyObject {
  @scala.inline
  def apply(
    acceptedByOpenSSL: scala.Boolean,
    depth: scala.Double,
    pemCertificate: java.lang.String,
    serverAddress: java.lang.String,
    serverPort: scala.Double
  ): SSLVerifyObject = {
    val __obj = js.Dynamic.literal(acceptedByOpenSSL = acceptedByOpenSSL, depth = depth, pemCertificate = pemCertificate, serverAddress = serverAddress, serverPort = serverPort)
  
    __obj.asInstanceOf[SSLVerifyObject]
  }
}

