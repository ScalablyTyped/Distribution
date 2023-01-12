package typings.sccBrokerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.Error
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoMatchingPublishTargetError extends StObject {
    
    def NoMatchingPublishTargetError(channelName: String): js.Error
    
    def NoMatchingSubscribeTargetError(channelName: String): js.Error
    
    def NoMatchingUnsubscribeTargetError(channelName: String): js.Error
  }
  object NoMatchingPublishTargetError {
    
    inline def apply(
      NoMatchingPublishTargetError: String => js.Error,
      NoMatchingSubscribeTargetError: String => js.Error,
      NoMatchingUnsubscribeTargetError: String => js.Error
    ): NoMatchingPublishTargetError = {
      val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
      __obj.asInstanceOf[NoMatchingPublishTargetError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoMatchingPublishTargetError] (val x: Self) extends AnyVal {
      
      inline def setNoMatchingPublishTargetError(value: String => js.Error): Self = StObject.set(x, "NoMatchingPublishTargetError", js.Any.fromFunction1(value))
      
      inline def setNoMatchingSubscribeTargetError(value: String => js.Error): Self = StObject.set(x, "NoMatchingSubscribeTargetError", js.Any.fromFunction1(value))
      
      inline def setNoMatchingUnsubscribeTargetError(value: String => js.Error): Self = StObject.set(x, "NoMatchingUnsubscribeTargetError", js.Any.fromFunction1(value))
    }
  }
}
