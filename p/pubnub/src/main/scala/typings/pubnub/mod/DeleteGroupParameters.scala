package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupParameters extends StObject {
  
  var channelGroup: String
}
object DeleteGroupParameters {
  
  inline def apply(channelGroup: String): DeleteGroupParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGroupParameters] (val x: Self) extends AnyVal {
    
    inline def setChannelGroup(value: String): Self = StObject.set(x, "channelGroup", value.asInstanceOf[js.Any])
  }
}
