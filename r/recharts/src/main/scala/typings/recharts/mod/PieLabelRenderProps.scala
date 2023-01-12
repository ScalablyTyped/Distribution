package typings.recharts.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieLabelRenderProps
  extends StObject
     with PieProps
     with /* key */ StringDictionary[Any] {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var percent: js.UndefOr[Double] = js.undefined
  
  @JSName("stroke")
  var stroke_PieLabelRenderProps: String
  
  @JSName("textAnchor")
  var textAnchor_PieLabelRenderProps: String
  
  @JSName("x")
  var x_PieLabelRenderProps: Double
  
  @JSName("y")
  var y_PieLabelRenderProps: Double
}
object PieLabelRenderProps {
  
  inline def apply(dataKey: DataKey, name: String, stroke: String, textAnchor: String, x: Double, y: Double): PieLabelRenderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieLabelRenderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieLabelRenderProps] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
