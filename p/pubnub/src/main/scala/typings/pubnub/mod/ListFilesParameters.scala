package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// files
trait ListFilesParameters extends StObject {
  
  var channel: String
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
}
object ListFilesParameters {
  
  @scala.inline
  def apply(channel: String): ListFilesParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFilesParameters]
  }
  
  @scala.inline
  implicit class ListFilesParametersMutableBuilder[Self <: ListFilesParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
