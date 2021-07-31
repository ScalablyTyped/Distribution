package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapProps
  extends StObject
     with EventAttributes
     with Animatable {
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[ReactElement | ContentRenderer[js.Any]] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var nameKey: js.UndefOr[String | Double | RechartsFunction] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TreemapProps {
  
  @scala.inline
  def apply(): TreemapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapProps]
  }
  
  @scala.inline
  implicit class TreemapPropsMutableBuilder[Self <: TreemapProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: ReactElement | ContentRenderer[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: js.Any => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setNameKey(value: String | Double | RechartsFunction): Self = StObject.set(x, "nameKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameKeyUndefined: Self = StObject.set(x, "nameKey", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
