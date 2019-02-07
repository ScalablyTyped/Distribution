package typings
package ssriLib.ssriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Hash")
@js.native
class Hash protected () extends HashLike {
  def this(hash: java.lang.String) = this()
  def this(hash: java.lang.String, opts: ssriLib.Anon_Strict) = this()
  /* CompleteClass */
  override var algorithm: java.lang.String = js.native
  /* CompleteClass */
  override var digest: java.lang.String = js.native
  var isHash: scala.Boolean = js.native
  var source: java.lang.String = js.native
  def hexDigest(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toString(opts: ssriLib.Anon_Strict): java.lang.String = js.native
}

