package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclHmac extends SjclPseudorandomFunctionFamily {
  def digest(): BitArray = js.native
  def mac(data: String): BitArray = js.native
  def mac(data: BitArray): BitArray = js.native
  def reset(): Unit = js.native
  def update(data: String): Unit = js.native
  def update(data: BitArray): Unit = js.native
}

