package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.KeyAlgorithm
import typings.std.KeyType
import typings.std.KeyUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CryptoKey")
@js.native
class CryptoKey ()
  extends typings.std.CryptoKey {
  /* CompleteClass */
  override val algorithm: KeyAlgorithm = js.native
  /* CompleteClass */
  override val extractable: scala.Boolean = js.native
  /* CompleteClass */
  override val `type`: KeyType = js.native
  /* CompleteClass */
  override val usages: js.Array[KeyUsage] = js.native
}

@JSGlobal("CryptoKey")
@js.native
object CryptoKey
  extends Instantiable0[typings.std.CryptoKey]

