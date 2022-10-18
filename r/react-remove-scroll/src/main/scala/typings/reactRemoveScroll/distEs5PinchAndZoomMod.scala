package typings.reactRemoveScroll

import typings.react.mod.Touch
import typings.reactRemoveScroll.anon.Action
import typings.reactRemoveScroll.anon.Coords
import typings.reactRemoveScroll.reactRemoveScrollBooleans.`false`
import typings.std.Record
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5PinchAndZoomMod {
  
  @JSImport("react-remove-scroll/dist/es5/pinchAndZoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pinchOrZoom(event: TouchEvent, cache: Record[Double, Touch]): `false` | Action | Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("pinchOrZoom")(event.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[`false` | Action | Coords]
}
