package typings.pusherJs

import org.scalablytyped.runtime.Shortcut
import typings.pusherJs.mod.Config
import typings.pusherJs.mod.PusherStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Pusher extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Pusher")
    @js.native
    class ^ protected ()
      extends StObject
         with typings.pusherJs.mod.Pusher {
      def this(apiKey: String) = this()
      def this(apiKey: String, config: Config) = this()
    }
    
    @JSGlobal("Pusher")
    @js.native
    val ^ : js.Object & PusherStatic = js.native
    
    type _To = js.Object & PusherStatic
    
    /* This means you don't have to write `^`, but can instead just say `Pusher.foo` */
    override def _to: js.Object & PusherStatic = ^
  }
}
