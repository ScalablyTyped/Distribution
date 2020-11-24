package typings.sha256.mod

import typings.sha256.anon.AsBytes
import typings.sha256.anon.AsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha256 extends js.Object {
  
  def apply(message: Message): String = js.native
  def apply(message: Message, options: AsBytes): js.Array[Double] = js.native
  def apply(message: Message, options: AsString): String = js.native
}
