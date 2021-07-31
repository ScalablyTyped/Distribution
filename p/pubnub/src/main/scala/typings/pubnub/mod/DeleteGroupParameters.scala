package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupParameters extends StObject {
  
  var channelGroup: String
}
object DeleteGroupParameters {
  
  @scala.inline
  def apply(channelGroup: String): DeleteGroupParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupParameters]
  }
  
  @scala.inline
  implicit class DeleteGroupParametersMutableBuilder[Self <: DeleteGroupParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelGroup(value: String): Self = StObject.set(x, "channelGroup", value.asInstanceOf[js.Any])
  }
}
