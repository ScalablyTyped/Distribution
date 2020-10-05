package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthentication extends js.Object {
  def getAssertion(): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Null, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: ArrayBuffer): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: ArrayBuffer, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: DataView): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: DataView, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Float32Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Float32Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Float64Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Float64Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Int16Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Int16Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Int32Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Int32Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Int8Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Int8Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint16Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint16Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint32Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint32Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint8Array): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint8Array, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint8ClampedArray): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: Uint8ClampedArray, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: js.Array[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Null,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: DataView
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: DataView,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Float32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Float32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Float64Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Float64Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Int16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Int16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Int32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Int32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Int8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Int8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint8ClampedArray
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: Uint8ClampedArray,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(accountInformation: Account, cryptoParameters: Iterable[ScopedCredentialParameters]): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Null,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: ArrayBuffer
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: ArrayBuffer,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: DataView
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: DataView,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Float32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Float32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Float64Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Float64Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Int16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Int16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Int32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Int32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Int8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Int8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint16Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint16Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint32Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint32Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint8Array
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint8Array,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint8ClampedArray
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: Iterable[ScopedCredentialParameters],
    attestationChallenge: Uint8ClampedArray,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
}

