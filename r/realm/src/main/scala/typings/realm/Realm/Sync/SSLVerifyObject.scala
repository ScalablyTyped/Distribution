package typings.realm.Realm.Sync

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
    val __obj = js.Dynamic.literal(acceptedByOpenSSL = acceptedByOpenSSL.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], pemCertificate = pemCertificate.asInstanceOf[js.Any], serverAddress = serverAddress.asInstanceOf[js.Any], serverPort = serverPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSLVerifyObject]
  }
}

