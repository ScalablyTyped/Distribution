package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlamegraphChartData extends StObject {
  
  var baseDuration: Double
  
  var depth: Double
  
  var idToDepthMap: Map[Double, Double]
  
  var maxSelfDuration: Double
  
  var renderPathNodes: Set[Double]
  
  var rows: js.Array[js.Array[ChartNode]]
}
object FlamegraphChartData {
  
  inline def apply(
    baseDuration: Double,
    depth: Double,
    idToDepthMap: Map[Double, Double],
    maxSelfDuration: Double,
    renderPathNodes: Set[Double],
    rows: js.Array[js.Array[ChartNode]]
  ): FlamegraphChartData = {
    val __obj = js.Dynamic.literal(baseDuration = baseDuration.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], idToDepthMap = idToDepthMap.asInstanceOf[js.Any], maxSelfDuration = maxSelfDuration.asInstanceOf[js.Any], renderPathNodes = renderPathNodes.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlamegraphChartData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlamegraphChartData] (val x: Self) extends AnyVal {
    
    inline def setBaseDuration(value: Double): Self = StObject.set(x, "baseDuration", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setIdToDepthMap(value: Map[Double, Double]): Self = StObject.set(x, "idToDepthMap", value.asInstanceOf[js.Any])
    
    inline def setMaxSelfDuration(value: Double): Self = StObject.set(x, "maxSelfDuration", value.asInstanceOf[js.Any])
    
    inline def setRenderPathNodes(value: Set[Double]): Self = StObject.set(x, "renderPathNodes", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[js.Array[ChartNode]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: js.Array[ChartNode]*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
