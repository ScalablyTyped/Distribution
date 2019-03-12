package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCSecretKey extends js.Object {
  def get(): BitArray
}

object SjclECCSecretKey {
  @scala.inline
  def apply(get: () => BitArray): SjclECCSecretKey = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[SjclECCSecretKey]
  }
}

