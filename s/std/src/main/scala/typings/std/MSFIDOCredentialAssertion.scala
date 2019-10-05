package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSFIDOCredentialAssertion extends MSAssertion {
  val algorithm: java.lang.String | Algorithm
  val attestation: js.Any
  val publicKey: java.lang.String
  val transportHints: js.Array[MSTransportType]
}

@JSGlobal("MSFIDOCredentialAssertion")
@js.native
object MSFIDOCredentialAssertion extends Instantiable0[MSFIDOCredentialAssertion]

