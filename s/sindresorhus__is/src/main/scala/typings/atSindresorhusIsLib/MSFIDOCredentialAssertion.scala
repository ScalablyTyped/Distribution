package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSFIDOCredentialAssertion extends MSAssertion {
  val algorithm: java.lang.String | Algorithm
  val attestation: js.Any
  val publicKey: java.lang.String
  val transportHints: Array[MSTransportType]
}

@JSGlobal("MSFIDOCredentialAssertion")
@js.native
object MSFIDOCredentialAssertion
  extends org.scalablytyped.runtime.Instantiable0[MSFIDOCredentialAssertion]

