package typings.seatsio.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictticketType extends /* ticketType */ StringDictionary[Double] {
  
  var NO_TICKET_TYPE: Double = js.native
}
object DictticketType {
  
  @scala.inline
  def apply(NO_TICKET_TYPE: Double): DictticketType = {
    val __obj = js.Dynamic.literal(NO_TICKET_TYPE = NO_TICKET_TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictticketType]
  }
  
  @scala.inline
  implicit class DictticketTypeOps[Self <: DictticketType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNO_TICKET_TYPE(value: Double): Self = this.set("NO_TICKET_TYPE", value.asInstanceOf[js.Any])
  }
}
