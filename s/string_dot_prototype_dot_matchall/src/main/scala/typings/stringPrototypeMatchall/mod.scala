package typings.stringPrototypeMatchall

import typings.std.IterableIterator
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("string.prototype.matchall", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(str: String, regexp: String): IterableIterator[RegExpMatchArray] = js.native
  def apply(str: String, regexp: RegExp): IterableIterator[RegExpMatchArray] = js.native
  
  def shim(): Unit = js.native
}
