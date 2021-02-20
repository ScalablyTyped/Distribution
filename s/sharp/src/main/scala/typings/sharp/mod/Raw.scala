package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`3`
import typings.sharp.sharpNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Raw extends StObject {
  
  var channels: `1` | `2` | `3` | `4` = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object Raw {
  
  @scala.inline
  def apply(channels: `1` | `2` | `3` | `4`, height: Double, width: Double): Raw = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  @scala.inline
  implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
