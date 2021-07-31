package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
trait Screen extends StObject {
  
  val availHeight: Double
  
  val availWidth: Double
  
  val colorDepth: Double
  
  val height: Double
  
  val orientation: ScreenOrientation
  
  val pixelDepth: Double
  
  val width: Double
}
object Screen {
  
  @scala.inline
  def apply(
    availHeight: Double,
    availWidth: Double,
    colorDepth: Double,
    height: Double,
    orientation: ScreenOrientation,
    pixelDepth: Double,
    width: Double
  ): Screen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit class ScreenMutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailHeight(value: Double): Self = StObject.set(x, "availHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailWidth(value: Double): Self = StObject.set(x, "availWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: ScreenOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDepth(value: Double): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
