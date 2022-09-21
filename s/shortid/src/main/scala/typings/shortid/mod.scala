package typings.shortid

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shortid", JSImport.Namespace)
  @js.native
  val ^ : ShortId = js.native
  
  @js.native
  trait ShortId extends StObject {
    
    def apply(): String = js.native
    
    def characters(string: String): String = js.native
    
    def generate(): String = js.native
    
    def isValid(id: Any): Boolean = js.native
    
    def seed(float: Double): Unit = js.native
    
    def worker(integer: Double): Unit = js.native
  }
  
  type _To = ShortId
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ShortId = ^
}
