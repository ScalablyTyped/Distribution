package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen extends StObject {
  
  /**
    * Layout of the whole screen.
    */
  var screen: Layout = js.native
}
object Screen {
  
  @scala.inline
  def apply(screen: Layout): Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit class ScreenMutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreen(value: Layout): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
