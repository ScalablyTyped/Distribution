package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
@js.native
trait SjclHash extends js.Object {
  def reset(): SjclHash = js.native
  def update(data: String): SjclHash = js.native
  def update(data: BitArray): SjclHash = js.native
}

