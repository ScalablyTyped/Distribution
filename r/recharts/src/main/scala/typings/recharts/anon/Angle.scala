package typings.recharts.anon

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.mod.ContentRenderer
import typings.recharts.mod.LabelFormatter
import typings.recharts.mod.LabelProps
import typings.recharts.mod.PositionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var clockWise: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[ReactElement | ContentRenderer[LabelProps]] = js.undefined
  
  var data: js.UndefOr[Double] = js.undefined
  
  var formatter: js.UndefOr[LabelFormatter] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
}
object Angle {
  
  inline def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  extension [Self <: Angle](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClockWise(value: Boolean): Self = StObject.set(x, "clockWise", value.asInstanceOf[js.Any])
    
    inline def setClockWiseUndefined: Self = StObject.set(x, "clockWise", js.undefined)
    
    inline def setContent(value: ReactElement | ContentRenderer[LabelProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: LabelProps => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormatter(value: /* label */ String | Double => ReactNode): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
