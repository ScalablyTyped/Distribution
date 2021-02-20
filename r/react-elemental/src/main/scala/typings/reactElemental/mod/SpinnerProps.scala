package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerProps extends StObject {
  
  val accentColor: js.UndefOr[String] = js.native
  
  val duration: js.UndefOr[Double] = js.native
  
  val ringColor: js.UndefOr[String] = js.native
  
  val size: js.UndefOr[SpinnerSize] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val thickness: js.UndefOr[Double] = js.native
}
object SpinnerProps {
  
  @scala.inline
  def apply(): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerProps]
  }
  
  @scala.inline
  implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setRingColor(value: String): Self = StObject.set(x, "ringColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingColorUndefined: Self = StObject.set(x, "ringColor", js.undefined)
    
    @scala.inline
    def setSize(value: SpinnerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
