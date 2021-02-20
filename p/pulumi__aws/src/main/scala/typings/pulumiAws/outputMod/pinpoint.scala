package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinpoint {
  
  @js.native
  trait AppCampaignHook extends StObject {
    
    /**
      * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
      */
    var lambdaFunctionName: js.UndefOr[String] = js.native
    
    /**
      * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
      */
    var mode: js.UndefOr[String] = js.native
    
    /**
      * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
      */
    var webUrl: js.UndefOr[String] = js.native
  }
  object AppCampaignHook {
    
    @scala.inline
    def apply(): AppCampaignHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCampaignHook]
    }
    
    @scala.inline
    implicit class AppCampaignHookMutableBuilder[Self <: AppCampaignHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLambdaFunctionName(value: String): Self = StObject.set(x, "lambdaFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionNameUndefined: Self = StObject.set(x, "lambdaFunctionName", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
    }
  }
  
  @js.native
  trait AppLimits extends StObject {
    
    /**
      * The maximum number of messages that the campaign can send daily.
      */
    var daily: js.UndefOr[Double] = js.native
    
    /**
      * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
      */
    var maximumDuration: js.UndefOr[Double] = js.native
    
    /**
      * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
      */
    var messagesPerSecond: js.UndefOr[Double] = js.native
    
    /**
      * The maximum total number of messages that the campaign can send.
      */
    var total: js.UndefOr[Double] = js.native
  }
  object AppLimits {
    
    @scala.inline
    def apply(): AppLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppLimits]
    }
    
    @scala.inline
    implicit class AppLimitsMutableBuilder[Self <: AppLimits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDaily(value: Double): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
      
      @scala.inline
      def setMaximumDuration(value: Double): Self = StObject.set(x, "maximumDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDurationUndefined: Self = StObject.set(x, "maximumDuration", js.undefined)
      
      @scala.inline
      def setMessagesPerSecond(value: Double): Self = StObject.set(x, "messagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesPerSecondUndefined: Self = StObject.set(x, "messagesPerSecond", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  @js.native
  trait AppQuietTime extends StObject {
    
    /**
      * The default end time for quiet time in ISO 8601 format. Required if `start` is set
      */
    var end: js.UndefOr[String] = js.native
    
    /**
      * The default start time for quiet time in ISO 8601 format. Required if `end` is set
      */
    var start: js.UndefOr[String] = js.native
  }
  object AppQuietTime {
    
    @scala.inline
    def apply(): AppQuietTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppQuietTime]
    }
    
    @scala.inline
    implicit class AppQuietTimeMutableBuilder[Self <: AppQuietTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
