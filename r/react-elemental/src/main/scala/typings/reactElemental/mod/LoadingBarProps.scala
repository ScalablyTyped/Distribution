package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingBarProps extends StObject {
  
  val color: js.UndefOr[String] = js.undefined
  
  val delay: js.UndefOr[Double] = js.undefined
  
  val duration: js.UndefOr[Double] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val thickness: js.UndefOr[Double] = js.undefined
}
object LoadingBarProps {
  
  inline def apply(): LoadingBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingBarProps] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
