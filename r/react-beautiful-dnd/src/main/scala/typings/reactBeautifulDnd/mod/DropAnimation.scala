package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropAnimation extends StObject {
  
  var curve: String
  
  var duration: Double
  
  var moveTo: Position
  
  /**
    * This value will actually be `null` instead of `undefined`.
    *
    * The type is fudged because `null` is not compatible with the
    * `React.CSSProperties` type.
    *
    * The `style` prop should interpret `null` and `undefined` the same way.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * This value will actually be `null` instead of `undefined`.
    *
    * The type is fudged because `null` is not compatible with the
    * `React.CSSProperties` type.
    *
    * The `style` prop should interpret `null` and `undefined` the same way.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object DropAnimation {
  
  inline def apply(curve: String, duration: Double, moveTo: Position): DropAnimation = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], moveTo = moveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropAnimation] (val x: Self) extends AnyVal {
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMoveTo(value: Position): Self = StObject.set(x, "moveTo", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
