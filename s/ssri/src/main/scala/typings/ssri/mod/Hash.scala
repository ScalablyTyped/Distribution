package typings.ssri.mod

import typings.ssri.AnonStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Hash")
@js.native
class Hash protected () extends HashLike {
  def this(hash: String) = this()
  def this(hash: String, opts: AnonStrict) = this()
  /* CompleteClass */
  override var algorithm: String = js.native
  /* CompleteClass */
  override var digest: String = js.native
  var isHash: Boolean = js.native
  var source: String = js.native
  def hexDigest(): String = js.native
  def toJSON(): String = js.native
  def toString(opts: AnonStrict): String = js.native
}

