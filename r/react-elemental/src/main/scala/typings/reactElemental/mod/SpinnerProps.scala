package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerProps extends StObject {
  
  val accentColor: js.UndefOr[String] = js.undefined
  
  val duration: js.UndefOr[Double] = js.undefined
  
  val ringColor: js.UndefOr[String] = js.undefined
  
  val size: js.UndefOr[SpinnerSize] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val thickness: js.UndefOr[Double] = js.undefined
}
object SpinnerProps {
  
  inline def apply(): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerProps]
  }
  
  extension [Self <: SpinnerProps](x: Self) {
    
    inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
    
    inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setRingColor(value: String): Self = StObject.set(x, "ringColor", value.asInstanceOf[js.Any])
    
    inline def setRingColorUndefined: Self = StObject.set(x, "ringColor", js.undefined)
    
    inline def setSize(value: SpinnerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
