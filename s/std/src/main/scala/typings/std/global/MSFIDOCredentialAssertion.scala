package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.Algorithm
import typings.std.MSCredentialType
import typings.std.MSTransportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSFIDOCredentialAssertion")
@js.native
class MSFIDOCredentialAssertion ()
  extends typings.std.MSFIDOCredentialAssertion {
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
object MSFIDOCredentialAssertion
  extends Instantiable0[typings.std.MSFIDOCredentialAssertion]

