package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraPoolOptions extends PoolOptions {
  
  var maxSockets: js.UndefOr[Double] = js.native
}
object ExtraPoolOptions {
  
  @scala.inline
  def apply(): ExtraPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraPoolOptions]
  }
  
  @scala.inline
  implicit class ExtraPoolOptionsMutableBuilder[Self <: ExtraPoolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
  }
}
