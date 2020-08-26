package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLVerifyObject extends js.Object {
  var acceptedByOpenSSL: Boolean = js.native
  var depth: Double = js.native
  var pemCertificate: String = js.native
  var serverAddress: String = js.native
  var serverPort: Double = js.native
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
  @scala.inline
  implicit class SSLVerifyObjectOps[Self <: SSLVerifyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptedByOpenSSL(value: Boolean): Self = this.set("acceptedByOpenSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPemCertificate(value: String): Self = this.set("pemCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerAddress(value: String): Self = this.set("serverAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerPort(value: Double): Self = this.set("serverPort", value.asInstanceOf[js.Any])
  }
  
}

