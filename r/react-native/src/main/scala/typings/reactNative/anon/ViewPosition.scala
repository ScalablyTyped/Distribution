package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPosition extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var index: Double = js.native
  
  var viewOffset: js.UndefOr[Double] = js.native
  
  var viewPosition: js.UndefOr[Double] = js.native
}
object ViewPosition {
  
  @scala.inline
  def apply(index: Double): ViewPosition = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPosition]
  }
  
  @scala.inline
  implicit class ViewPositionMutableBuilder[Self <: ViewPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
    
    @scala.inline
    def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
