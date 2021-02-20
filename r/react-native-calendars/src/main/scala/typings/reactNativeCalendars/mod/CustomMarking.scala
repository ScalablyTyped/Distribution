package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMarking extends Marking {
  
  var customStyles: MarkedDateCustomStyles = js.native
}
object CustomMarking {
  
  @scala.inline
  def apply(customStyles: MarkedDateCustomStyles): CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarking]
  }
  
  @scala.inline
  implicit class CustomMarkingMutableBuilder[Self <: CustomMarking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomStyles(value: MarkedDateCustomStyles): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
  }
}
