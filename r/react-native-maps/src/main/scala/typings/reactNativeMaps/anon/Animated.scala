package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.EdgePadding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animated extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var edgePadding: js.UndefOr[EdgePadding] = js.native
}
object Animated {
  
  @scala.inline
  def apply(): Animated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit class AnimatedMutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setEdgePadding(value: EdgePadding): Self = StObject.set(x, "edgePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgePaddingUndefined: Self = StObject.set(x, "edgePadding", js.undefined)
  }
}
