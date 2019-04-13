package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclHmac extends SjclPseudorandomFunctionFamily {
  def digest(): BitArray = js.native
  def mac(data: java.lang.String): BitArray = js.native
  def mac(data: BitArray): BitArray = js.native
  def reset(): scala.Unit = js.native
  def update(data: java.lang.String): scala.Unit = js.native
  def update(data: BitArray): scala.Unit = js.native
}

