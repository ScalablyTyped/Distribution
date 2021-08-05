package typings.sccBrokerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: typings.std.Error
  }
  object Error {
    
    inline def apply(error: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoMatchingPublishTargetError extends StObject {
    
    def NoMatchingPublishTargetError(channelName: String): typings.std.Error
    
    def NoMatchingSubscribeTargetError(channelName: String): typings.std.Error
    
    def NoMatchingUnsubscribeTargetError(channelName: String): typings.std.Error
  }
  object NoMatchingPublishTargetError {
    
    inline def apply(
      NoMatchingPublishTargetError: String => typings.std.Error,
      NoMatchingSubscribeTargetError: String => typings.std.Error,
      NoMatchingUnsubscribeTargetError: String => typings.std.Error
    ): NoMatchingPublishTargetError = {
      val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
      __obj.asInstanceOf[NoMatchingPublishTargetError]
    }
    
    extension [Self <: NoMatchingPublishTargetError](x: Self) {
      
      inline def setNoMatchingPublishTargetError(value: String => typings.std.Error): Self = StObject.set(x, "NoMatchingPublishTargetError", js.Any.fromFunction1(value))
      
      inline def setNoMatchingSubscribeTargetError(value: String => typings.std.Error): Self = StObject.set(x, "NoMatchingSubscribeTargetError", js.Any.fromFunction1(value))
      
      inline def setNoMatchingUnsubscribeTargetError(value: String => typings.std.Error): Self = StObject.set(x, "NoMatchingUnsubscribeTargetError", js.Any.fromFunction1(value))
    }
  }
}
