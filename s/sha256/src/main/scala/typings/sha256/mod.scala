package typings.sha256

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.sha256.anon.AsBytes
import typings.sha256.anon.AsString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sha256", JSImport.Namespace)
  @js.native
  val ^ : Sha256WithX2 = js.native
  
  type Message = String | Buffer | js.Array[Double]
  
  @js.native
  trait Sha256 extends StObject {
    
    def apply(message: Message): String = js.native
    def apply(message: Message, options: AsBytes): js.Array[Double] = js.native
    def apply(message: Message, options: AsString): String = js.native
  }
  
  @js.native
  trait Sha256WithX2
    extends StObject
       with Sha256 {
    
    def x2(message: Message): String = js.native
    def x2(message: Message, options: AsBytes): js.Array[Double] = js.native
    def x2(message: Message, options: AsString): String = js.native
    @JSName("x2")
    var x2_Original: Sha256 = js.native
  }
  
  type _To = Sha256WithX2
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sha256WithX2 = ^
}
