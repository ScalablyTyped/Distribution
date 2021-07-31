package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedOffset extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var offset: Double
}
object AnimatedOffset {
  
  @scala.inline
  def apply(offset: Double): AnimatedOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedOffset]
  }
  
  @scala.inline
  implicit class AnimatedOffsetMutableBuilder[Self <: AnimatedOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
