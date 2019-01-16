package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthentication extends js.Object {
  def getAssertion(): Promise[WebAuthnAssertion] = js.native
  def getAssertion(
    assertionChallenge: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): Promise[WebAuthnAssertion] = js.native
  def getAssertion(
    assertionChallenge: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    options: AssertionOptions
  ): Promise[WebAuthnAssertion] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: Array[ScopedCredentialParameters]): Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Array[ScopedCredentialParameters],
    attestationChallenge: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Array[ScopedCredentialParameters],
    attestationChallenge: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    options: ScopedCredentialOptions
  ): Promise[ScopedCredentialInfo] = js.native
}

@JSGlobal("WebAuthentication")
@js.native
object WebAuthentication
  extends org.scalablytyped.runtime.Instantiable0[WebAuthentication]

