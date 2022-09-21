package typings.stringPrototypeMatchall

import typings.std.IterableIterator
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String, regexp: String): IterableIterator[RegExpMatchArray] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[RegExpMatchArray]]
  inline def apply(str: String, regexp: js.RegExp): IterableIterator[RegExpMatchArray] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[RegExpMatchArray]]
  
  @JSImport("string.prototype.matchall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shim(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[Unit]
}
