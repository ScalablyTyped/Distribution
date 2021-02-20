package typings.stringPrototypeMatchall

import typings.std.IterableIterator
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string.prototype.matchall", JSImport.Namespace)
  @js.native
  def apply(str: String, regexp: String): IterableIterator[RegExpMatchArray] = js.native
  @JSImport("string.prototype.matchall", JSImport.Namespace)
  @js.native
  def apply(str: String, regexp: RegExp): IterableIterator[RegExpMatchArray] = js.native
  
  @JSImport("string.prototype.matchall", "shim")
  @js.native
  def shim(): Unit = js.native
}
