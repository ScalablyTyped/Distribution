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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acceptedByOpenSSL")(acceptedByOpenSSL)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("pemCertificate")(pemCertificate)
    __obj.updateDynamic("serverAddress")(serverAddress)
    __obj.updateDynamic("serverPort")(serverPort)
    __obj.asInstanceOf[SSLVerifyObject]
  }
}

