package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargestContentfulPaintData
  extends StObject
     with _AllPerformanceEntryData {
  
  /**
    * The recording id of the LCP node. -1 if not found
    */
  var nodeId: js.UndefOr[Double] = js.undefined
  
  var size: Double
  
  /**
    * Render time (in ms) of the LCP
    */
  var value: Double
}
object LargestContentfulPaintData {
  
  inline def apply(size: Double, value: Double): LargestContentfulPaintData = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargestContentfulPaintData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargestContentfulPaintData] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
