package typings.seatsio.anon

import typings.seatsio.Seatsio.SelectionValidator
import typings.seatsio.seatsioStrings.consecutiveSeats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with SelectionValidator {
  
  var `type`: consecutiveSeats
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("consecutiveSeats")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: consecutiveSeats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
