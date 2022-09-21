package typings.requirejsDomready

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("requirejs-domready", JSImport.Namespace)
  @js.native
  val ^ : DomReady = js.native
  
  @js.native
  trait DomReady extends StObject {
    
    def apply(callback: js.Function0[Any]): DomReady = js.native
    
    var version: String = js.native
  }
  
  type _To = DomReady
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DomReady = ^
}
