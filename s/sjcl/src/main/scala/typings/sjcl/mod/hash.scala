package typings.sjcl.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hash extends Shortcut {
  
  @JSImport("sjcl", "hash")
  @js.native
  val ^ : SjclHashes = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "hash.ripemd160")
  @js.native
  class ripemd160 ()
    extends StObject
       with SjclHash {
    def this(hash: SjclHash) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "hash.sha1")
  @js.native
  class sha1 ()
    extends StObject
       with SjclHash {
    def this(hash: SjclHash) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "hash.sha256")
  @js.native
  class sha256 ()
    extends StObject
       with SjclHash {
    def this(hash: SjclHash) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sjcl", "hash.sha512")
  @js.native
  class sha512 ()
    extends StObject
       with SjclHash {
    def this(hash: SjclHash) = this()
  }
  
  type _To = SjclHashes
  
  /* This means you don't have to write `^`, but can instead just say `hash.foo` */
  override def _to: SjclHashes = ^
}
