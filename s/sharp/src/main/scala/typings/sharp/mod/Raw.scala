package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`3`
import typings.sharp.sharpNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  var channels: `1` | `2` | `3` | `4`
  
  var height: Double
  
  var width: Double
}
object Raw {
  
  inline def apply(channels: `1` | `2` | `3` | `4`, height: Double, width: Double): Raw = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  extension [Self <: Raw](x: Self) {
    
    inline def setChannels(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
