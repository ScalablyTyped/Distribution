package typings.sharp.mod

import typings.sharp.sharpInts.`1`
import typings.sharp.sharpInts.`2`
import typings.sharp.sharpInts.`3`
import typings.sharp.sharpInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRaw
  extends StObject
     with Raw {
  
  /** Specifies that the raw input has already been premultiplied, set to true to avoid sharp premultiplying the image. (optional, default false) */
  var premultiplied: js.UndefOr[Boolean] = js.undefined
}
object CreateRaw {
  
  inline def apply(channels: `1` | `2` | `3` | `4`, height: Double, width: Double): CreateRaw = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRaw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRaw] (val x: Self) extends AnyVal {
    
    inline def setPremultiplied(value: Boolean): Self = StObject.set(x, "premultiplied", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedUndefined: Self = StObject.set(x, "premultiplied", js.undefined)
  }
}
