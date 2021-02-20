package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeOptions extends LimitOptions {
  
  var before: js.UndefOr[Double] = js.native
}
object BeforeOptions {
  
  @scala.inline
  def apply(): BeforeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeOptions]
  }
  
  @scala.inline
  implicit class BeforeOptionsMutableBuilder[Self <: BeforeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
