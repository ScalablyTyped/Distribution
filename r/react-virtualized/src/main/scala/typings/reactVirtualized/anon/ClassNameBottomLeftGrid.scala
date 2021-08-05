package typings.reactVirtualized.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameBottomLeftGrid extends StObject {
  
  var classNameBottomLeftGrid: Validator[String]
  
  var classNameBottomRightGrid: Validator[String]
  
  var classNameTopLeftGrid: Validator[String]
  
  var classNameTopRightGrid: Validator[String]
  
  var enableFixedColumnScroll: Validator[Boolean]
  
  var enableFixedRowScroll: Validator[Boolean]
  
  var fixedColumnCount: Validator[Double]
  
  var fixedRowCount: Validator[Double]
  
  var style: Validator[CSSProperties]
  
  var styleBottomLeftGrid: Validator[CSSProperties]
  
  var styleBottomRightGrid: Validator[CSSProperties]
  
  var styleTopLeftGrid: Validator[CSSProperties]
  
  var styleTopRightGrid: Validator[CSSProperties]
}
object ClassNameBottomLeftGrid {
  
  inline def apply(
    classNameBottomLeftGrid: Validator[String],
    classNameBottomRightGrid: Validator[String],
    classNameTopLeftGrid: Validator[String],
    classNameTopRightGrid: Validator[String],
    enableFixedColumnScroll: Validator[Boolean],
    enableFixedRowScroll: Validator[Boolean],
    fixedColumnCount: Validator[Double],
    fixedRowCount: Validator[Double],
    style: Validator[CSSProperties],
    styleBottomLeftGrid: Validator[CSSProperties],
    styleBottomRightGrid: Validator[CSSProperties],
    styleTopLeftGrid: Validator[CSSProperties],
    styleTopRightGrid: Validator[CSSProperties]
  ): ClassNameBottomLeftGrid = {
    val __obj = js.Dynamic.literal(classNameBottomLeftGrid = classNameBottomLeftGrid.asInstanceOf[js.Any], classNameBottomRightGrid = classNameBottomRightGrid.asInstanceOf[js.Any], classNameTopLeftGrid = classNameTopLeftGrid.asInstanceOf[js.Any], classNameTopRightGrid = classNameTopRightGrid.asInstanceOf[js.Any], enableFixedColumnScroll = enableFixedColumnScroll.asInstanceOf[js.Any], enableFixedRowScroll = enableFixedRowScroll.asInstanceOf[js.Any], fixedColumnCount = fixedColumnCount.asInstanceOf[js.Any], fixedRowCount = fixedRowCount.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleBottomLeftGrid = styleBottomLeftGrid.asInstanceOf[js.Any], styleBottomRightGrid = styleBottomRightGrid.asInstanceOf[js.Any], styleTopLeftGrid = styleTopLeftGrid.asInstanceOf[js.Any], styleTopRightGrid = styleTopRightGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameBottomLeftGrid]
  }
  
  extension [Self <: ClassNameBottomLeftGrid](x: Self) {
    
    inline def setClassNameBottomLeftGrid(value: Validator[String]): Self = StObject.set(x, "classNameBottomLeftGrid", value.asInstanceOf[js.Any])
    
    inline def setClassNameBottomRightGrid(value: Validator[String]): Self = StObject.set(x, "classNameBottomRightGrid", value.asInstanceOf[js.Any])
    
    inline def setClassNameTopLeftGrid(value: Validator[String]): Self = StObject.set(x, "classNameTopLeftGrid", value.asInstanceOf[js.Any])
    
    inline def setClassNameTopRightGrid(value: Validator[String]): Self = StObject.set(x, "classNameTopRightGrid", value.asInstanceOf[js.Any])
    
    inline def setEnableFixedColumnScroll(value: Validator[Boolean]): Self = StObject.set(x, "enableFixedColumnScroll", value.asInstanceOf[js.Any])
    
    inline def setEnableFixedRowScroll(value: Validator[Boolean]): Self = StObject.set(x, "enableFixedRowScroll", value.asInstanceOf[js.Any])
    
    inline def setFixedColumnCount(value: Validator[Double]): Self = StObject.set(x, "fixedColumnCount", value.asInstanceOf[js.Any])
    
    inline def setFixedRowCount(value: Validator[Double]): Self = StObject.set(x, "fixedRowCount", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Validator[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBottomLeftGrid(value: Validator[CSSProperties]): Self = StObject.set(x, "styleBottomLeftGrid", value.asInstanceOf[js.Any])
    
    inline def setStyleBottomRightGrid(value: Validator[CSSProperties]): Self = StObject.set(x, "styleBottomRightGrid", value.asInstanceOf[js.Any])
    
    inline def setStyleTopLeftGrid(value: Validator[CSSProperties]): Self = StObject.set(x, "styleTopLeftGrid", value.asInstanceOf[js.Any])
    
    inline def setStyleTopRightGrid(value: Validator[CSSProperties]): Self = StObject.set(x, "styleTopRightGrid", value.asInstanceOf[js.Any])
  }
}
