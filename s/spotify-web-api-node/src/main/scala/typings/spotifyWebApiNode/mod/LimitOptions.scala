package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
}
object LimitOptions {
  
  @scala.inline
  def apply(): LimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitOptions]
  }
  
  @scala.inline
  implicit class LimitOptionsMutableBuilder[Self <: LimitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
