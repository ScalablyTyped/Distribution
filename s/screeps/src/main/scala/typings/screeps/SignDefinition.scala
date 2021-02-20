package typings.screeps

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignDefinition extends StObject {
  
  var datetime: Date = js.native
  
  var text: String = js.native
  
  var time: Double = js.native
  
  var username: String = js.native
}
object SignDefinition {
  
  @scala.inline
  def apply(datetime: Date, text: String, time: Double, username: String): SignDefinition = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignDefinition]
  }
  
  @scala.inline
  implicit class SignDefinitionMutableBuilder[Self <: SignDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatetime(value: Date): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
