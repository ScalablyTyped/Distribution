package typings.sjcl.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object misc extends Shortcut {
  
  @JSImport("sjcl", "misc")
  @js.native
  val ^ : SjclMisc = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "misc.hmac")
  @js.native
  class hmac protected () extends SjclHMAC {
    def this(key: BitArray_) = this()
    def this(key: BitArray_, Hash: SjclHashStatic) = this()
  }
  
  type _To = SjclMisc
  
  /* This means you don't have to write `^`, but can instead just say `misc.foo` */
  override def _to: SjclMisc = ^
}
