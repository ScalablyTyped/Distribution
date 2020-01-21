package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclHmac extends SjclPseudorandomFunctionFamily {
  def digest(): BitArray_ = js.native
  def mac(data: String): BitArray_ = js.native
  def mac(data: BitArray_): BitArray_ = js.native
  def reset(): Unit = js.native
  def update(data: String): Unit = js.native
  def update(data: BitArray_): Unit = js.native
}

