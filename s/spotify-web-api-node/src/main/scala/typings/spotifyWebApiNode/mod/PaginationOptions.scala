package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationOptions
  extends StObject
     with LimitOptions {
  
  var offset: js.UndefOr[Double] = js.undefined
}
object PaginationOptions {
  
  @scala.inline
  def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  
  @scala.inline
  implicit class PaginationOptionsMutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
