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
class MSFIDOCredentialAssertionCls () extends MSFIDOCredentialAssertion {
  /* CompleteClass */
  override val algorithm: java.lang.String | Algorithm = js.native
  /* CompleteClass */
  override val attestation: js.Any = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val publicKey: java.lang.String = js.native
  /* CompleteClass */
  override val transportHints: js.Array[MSTransportType] = js.native
  /* CompleteClass */
  override val `type`: MSCredentialType = js.native
}

@JSGlobal("MSFIDOCredentialAssertion")
@js.native
object MSFIDOCredentialAssertion extends Instantiable0[MSFIDOCredentialAssertion]

