package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionOptions extends StObject {
  
  var position: js.UndefOr[Double] = js.undefined
}
object PositionOptions {
  
  @scala.inline
  def apply(): PositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionOptions]
  }
  
  @scala.inline
  implicit class PositionOptionsMutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
