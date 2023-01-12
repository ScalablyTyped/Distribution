package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionListScrollParams extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var itemIndex: Double
  
  var sectionIndex: Double
  
  var viewOffset: js.UndefOr[Double] = js.undefined
  
  var viewPosition: js.UndefOr[Double] = js.undefined
}
object SectionListScrollParams {
  
  inline def apply(itemIndex: Double, sectionIndex: Double): SectionListScrollParams = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionListScrollParams] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    inline def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    inline def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
    
    inline def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
    
    inline def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    inline def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
