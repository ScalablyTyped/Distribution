package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AverageItemLength extends StObject {
  
  var averageItemLength: Double = js.native
  
  var highestMeasuredFrameIndex: Double = js.native
  
  var index: Double = js.native
}
object AverageItemLength {
  
  @scala.inline
  def apply(averageItemLength: Double, highestMeasuredFrameIndex: Double, index: Double): AverageItemLength = {
    val __obj = js.Dynamic.literal(averageItemLength = averageItemLength.asInstanceOf[js.Any], highestMeasuredFrameIndex = highestMeasuredFrameIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageItemLength]
  }
  
  @scala.inline
  implicit class AverageItemLengthMutableBuilder[Self <: AverageItemLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageItemLength(value: Double): Self = StObject.set(x, "averageItemLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighestMeasuredFrameIndex(value: Double): Self = StObject.set(x, "highestMeasuredFrameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
