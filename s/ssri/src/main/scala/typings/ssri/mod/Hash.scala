package typings.ssri.mod

import typings.ssri.anon.Strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssri", "Hash")
@js.native
class Hash protected () extends HashLike {
  def this(hash: String) = this()
  def this(hash: String, opts: Strict) = this()
  
  def hexDigest(): String = js.native
  
  var isHash: Boolean = js.native
  
  var source: String = js.native
  
  def toJSON(): String = js.native
  
  def toString(opts: Strict): String = js.native
}
