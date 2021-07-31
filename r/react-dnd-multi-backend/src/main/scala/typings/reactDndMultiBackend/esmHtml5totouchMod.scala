package typings.reactDndMultiBackend

import org.scalablytyped.runtime.Shortcut
import typings.reactDndMultiBackend.mod.Backends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmHtml5totouchMod extends Shortcut {
  
  /**
    * Most commonly used set of Backends.
    * The default backend is the react-dnd-html5-backend.
    * The second backend is the react-dnd-touch-backend with enableMouseEvents = true,
    * preview = true, and the transition triggering on the "touchstart" event.
    */
  @JSImport("react-dnd-multi-backend/dist/esm/HTML5toTouch", JSImport.Default)
  @js.native
  val default: Backends = js.native
  
  type _To = Backends
  
  /* This means you don't have to write `default`, but can instead just say `esmHtml5totouchMod.foo` */
  override def _to: Backends = default
}
