package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends StObject {
  
  /** Parsed by the [color](https://www.npmjs.org/package/color) module to extract values for red, green, blue and alpha. */
  var background: Color = js.native
  
  /** Number of bands e.g. 3 for RGB, 4 for RGBA */
  var channels: Channels = js.native
  
  /** Number of pixels high. */
  var height: Double = js.native
  
  /** Number of pixels wide. */
  var width: Double = js.native
}
object Create {
  
  @scala.inline
  def apply(background: Color, channels: Channels, height: Double, width: Double): Create = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
