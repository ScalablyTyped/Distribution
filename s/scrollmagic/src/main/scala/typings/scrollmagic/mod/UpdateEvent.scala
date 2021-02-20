package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.update
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEvent extends Event[update] {
  
  val endPos: Double = js.native
  
  val scrollPos: Double = js.native
  
  val startPos: Double = js.native
}
object UpdateEvent {
  
  @scala.inline
  def apply(
    currentTarget: Scene,
    endPos: Double,
    namespace: String,
    scrollPos: Double,
    startPos: Double,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: update
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
  
  @scala.inline
  implicit class UpdateEventMutableBuilder[Self <: UpdateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPos(value: Double): Self = StObject.set(x, "scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
  }
}
