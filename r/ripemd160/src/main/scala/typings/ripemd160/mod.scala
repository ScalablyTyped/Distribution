package typings.ripemd160

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ripemd160", JSImport.Namespace)
  @js.native
  class ^ () extends Hash
  @JSImport("ripemd160", JSImport.Namespace)
  @js.native
  val ^ : RIPEMD160Static = js.native
  
  @js.native
  trait RIPEMD160Static extends Instantiable0[Hash]
  
  type _To = RIPEMD160Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RIPEMD160Static = ^
}
