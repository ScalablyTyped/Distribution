package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherEncrypted extends SjclCipherEncryptParams {
  var ct: BitArray
  var kemtag: js.UndefOr[BitArray] = js.undefined
}

