package typings.removeAccents

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remove-accents", JSImport.Namespace)
  @js.native
  val ^ : RemoveAccents = js.native
  
  @js.native
  trait RemoveAccents extends StObject {
    
    def apply(part: String): String = js.native
    
    def has(part: String): Boolean = js.native
    
    def remove(part: String): String = js.native
  }
  
  type _To = RemoveAccents
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RemoveAccents = ^
}
