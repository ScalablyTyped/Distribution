package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
trait CryptoKey extends js.Object {
  val algorithm: KeyAlgorithm
  val extractable: scala.Boolean
  val `type`: KeyType
  val usages: js.Array[KeyUsage]
}

@JSGlobal("CryptoKey")
@js.native
object CryptoKey extends Instantiable0[CryptoKey]

