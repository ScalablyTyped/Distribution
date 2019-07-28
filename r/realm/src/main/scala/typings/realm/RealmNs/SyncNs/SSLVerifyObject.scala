package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLVerifyObject extends js.Object {
  var acceptedByOpenSSL: Boolean
  var depth: Double
  var pemCertificate: String
  var serverAddress: String
  var serverPort: Double
}

object SSLVerifyObject {
  @scala.inline
  def apply(
    acceptedByOpenSSL: Boolean,
    depth: Double,
    pemCertificate: String,
    serverAddress: String,
    serverPort: Double
  ): SSLVerifyObject = {
    val __obj = js.Dynamic.literal(acceptedByOpenSSL = acceptedByOpenSSL, depth = depth, pemCertificate = pemCertificate, serverAddress = serverAddress, serverPort = serverPort)
  
    __obj.asInstanceOf[SSLVerifyObject]
  }
}

