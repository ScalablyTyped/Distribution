package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.label
import typings.reactVis.reactVisStrings.size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunburstProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: ''
  var colorType: js.UndefOr[String] = js.undefined
  
  // default: 'literal'
  var data: SunburstPoint
  
  var getAngle: js.UndefOr[RVGet[SunburstPoint, angle]] = js.undefined
  
  var getAngle0: js.UndefOr[RVGet[SunburstPoint, angle0]] = js.undefined
  
  // default: false
  var getLabel: js.UndefOr[RVGet[SunburstPoint, label]] = js.undefined
  
  var getSize: js.UndefOr[RVGet[SunburstPoint, size]] = js.undefined
  
  var height: Double
  
  var hideRootNode: js.UndefOr[Boolean] = js.undefined
  
  var onValueClick: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.undefined
  
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.undefined
  
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.undefined
  
  var width: Double
}
object SunburstProps {
  
  inline def apply(data: SunburstPoint, height: Double, width: Double): SunburstProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SunburstProps] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setData(value: SunburstPoint): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetAngle(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle", js.Any.fromFunction1(value))
    
    inline def setGetAngle0(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle0", js.Any.fromFunction1(value))
    
    inline def setGetAngle0Undefined: Self = StObject.set(x, "getAngle0", js.undefined)
    
    inline def setGetAngleUndefined: Self = StObject.set(x, "getAngle", js.undefined)
    
    inline def setGetLabel(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    inline def setGetSize(
      value: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHideRootNode(value: Boolean): Self = StObject.set(x, "hideRootNode", value.asInstanceOf[js.Any])
    
    inline def setHideRootNodeUndefined: Self = StObject.set(x, "hideRootNode", js.undefined)
    
    inline def setOnValueClick(value: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueClick", js.Any.fromFunction2(value))
    
    inline def setOnValueClickUndefined: Self = StObject.set(x, "onValueClick", js.undefined)
    
    inline def setOnValueMouseOut(value: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOut", js.Any.fromFunction2(value))
    
    inline def setOnValueMouseOutUndefined: Self = StObject.set(x, "onValueMouseOut", js.undefined)
    
    inline def setOnValueMouseOver(value: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOver", js.Any.fromFunction2(value))
    
    inline def setOnValueMouseOverUndefined: Self = StObject.set(x, "onValueMouseOver", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
