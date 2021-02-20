package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait High extends StObject {
  
  var High: Double = js.native
  
  var Low: Double = js.native
}
object High {
  
  @scala.inline
  def apply(High: Double, Low: Double): High = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
  
  @scala.inline
  implicit class HighMutableBuilder[Self <: High] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
  }
}
