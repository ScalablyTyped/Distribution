package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSFIDOSignature extends js.Object {
  val authnrData: java.lang.String
  val clientData: java.lang.String
  val signature: java.lang.String
}

object MSFIDOSignature {
  @scala.inline
  def apply(authnrData: java.lang.String, clientData: java.lang.String, signature: java.lang.String): MSFIDOSignature = {
    val __obj = js.Dynamic.literal(authnrData = authnrData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignature]
  }
}

