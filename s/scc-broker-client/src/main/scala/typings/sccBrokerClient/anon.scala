package typings.sccBrokerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: typings.std.Error
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoMatchingPublishTargetError extends StObject {
    
    def NoMatchingPublishTargetError(channelName: String): typings.std.Error
    
    def NoMatchingSubscribeTargetError(channelName: String): typings.std.Error
    
    def NoMatchingUnsubscribeTargetError(channelName: String): typings.std.Error
  }
  object NoMatchingPublishTargetError {
    
    @scala.inline
    def apply(
      NoMatchingPublishTargetError: String => typings.std.Error,
      NoMatchingSubscribeTargetError: String => typings.std.Error,
      NoMatchingUnsubscribeTargetError: String => typings.std.Error
    ): NoMatchingPublishTargetError = {
      val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
      __obj.asInstanceOf[NoMatchingPublishTargetError]
    }
    
    @scala.inline
    implicit class NoMatchingPublishTargetErrorMutableBuilder[Self <: NoMatchingPublishTargetError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoMatchingPublishTargetError(value: String => typings.std.Error): Self = StObject.set(x, "NoMatchingPublishTargetError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchingSubscribeTargetError(value: String => typings.std.Error): Self = StObject.set(x, "NoMatchingSubscribeTargetError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchingUnsubscribeTargetError(value: String => typings.std.Error): Self = StObject.set(x, "NoMatchingUnsubscribeTargetError", js.Any.fromFunction1(value))
    }
  }
}
