package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOffset extends StObject {
  
  var animated: js.UndefOr[Boolean | Null] = js.undefined
  
  var index: Double
  
  var viewOffset: js.UndefOr[Double] = js.undefined
  
  var viewPosition: js.UndefOr[Double] = js.undefined
}
object ViewOffset {
  
  @scala.inline
  def apply(index: Double): ViewOffset = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOffset]
  }
  
  @scala.inline
  implicit class ViewOffsetMutableBuilder[Self <: ViewOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedNull: Self = StObject.set(x, "animated", null)
    
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
