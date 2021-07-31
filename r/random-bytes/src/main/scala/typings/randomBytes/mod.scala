package typings.randomBytes

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("random-bytes", JSImport.Namespace)
  @js.native
  val ^ : RandomBytesStatic = js.native
  
  @js.native
  trait RandomBytesStatic extends StObject {
    
    /**
      * Generates strong pseudo-random bytes.
      * @param size - Number of bytes to generate.
      */
    def apply(size: Double): js.Promise[Buffer] = js.native
    /**
      * Generates strong pseudo-random bytes.
      * @param size - Number of bytes to generate.
      * @param callback - Asynchronous callback function.
      */
    def apply(size: Double, callback: js.Function2[/* error */ Error, /* bytes */ Buffer, Unit]): Unit = js.native
    
    /**
      * Synchronously generates strong pseudo-random bytes.
      * @param size - Number of bytes to generate.
      */
    def sync(size: Double): Buffer = js.native
  }
  
  type _To = RandomBytesStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RandomBytesStatic = ^
}
