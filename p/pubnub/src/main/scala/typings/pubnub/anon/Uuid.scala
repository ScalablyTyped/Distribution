package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uuid extends StObject {
  
  var channel: Id = js.native
  
  var uuid: Id = js.native
}
object Uuid {
  
  @scala.inline
  def apply(channel: Id, uuid: Id): Uuid = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  
  @scala.inline
  implicit class UuidMutableBuilder[Self <: Uuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Id): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: Id): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
