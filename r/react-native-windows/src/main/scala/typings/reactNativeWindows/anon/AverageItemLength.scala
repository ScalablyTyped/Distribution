package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AverageItemLength extends StObject {
  
  var averageItemLength: Double
  
  var highestMeasuredFrameIndex: Double
  
  var index: Double
}
object AverageItemLength {
  
  inline def apply(averageItemLength: Double, highestMeasuredFrameIndex: Double, index: Double): AverageItemLength = {
    val __obj = js.Dynamic.literal(averageItemLength = averageItemLength.asInstanceOf[js.Any], highestMeasuredFrameIndex = highestMeasuredFrameIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageItemLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AverageItemLength] (val x: Self) extends AnyVal {
    
    inline def setAverageItemLength(value: Double): Self = StObject.set(x, "averageItemLength", value.asInstanceOf[js.Any])
    
    inline def setHighestMeasuredFrameIndex(value: Double): Self = StObject.set(x, "highestMeasuredFrameIndex", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
