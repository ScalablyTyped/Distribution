package typings.socketioJwt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JwtAuthOptions extends js.Object {
   // In milliseconds to handle the second round trip.
  var callback: js.UndefOr[Boolean] = js.native
   // To disconnect socket server-side without a client-side callback if no valid token.
  var decodedPropertyName: js.UndefOr[String] = js.native
   // Property to store the decoded token to.
  var handshake: js.UndefOr[Boolean] = js.native
  var secret: String | JwtSecretFunc = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object JwtAuthOptions {
  @scala.inline
  def apply(secret: String | JwtSecretFunc): JwtAuthOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthOptions]
  }
  @scala.inline
  implicit class JwtAuthOptionsOps[Self <: JwtAuthOptions] (val x: Self) extends AnyVal {
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
    def setSecretFunction3(value: (/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback) => Unit): Self = this.set("secret", js.Any.fromFunction3(value))
    @scala.inline
    def setSecret(value: String | JwtSecretFunc): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: Boolean): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDecodedPropertyName(value: String): Self = this.set("decodedPropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodedPropertyName: Self = this.set("decodedPropertyName", js.undefined)
    @scala.inline
    def setHandshake(value: Boolean): Self = this.set("handshake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandshake: Self = this.set("handshake", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

