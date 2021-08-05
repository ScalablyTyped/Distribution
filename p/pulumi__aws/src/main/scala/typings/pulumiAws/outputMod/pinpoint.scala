package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinpoint {
  
  trait AppCampaignHook extends StObject {
    
    /**
      * Lambda function name or ARN to be called for delivery. Conflicts with `webUrl`
      */
    var lambdaFunctionName: js.UndefOr[String] = js.undefined
    
    /**
      * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /**
      * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambdaFunctionName`
      */
    var webUrl: js.UndefOr[String] = js.undefined
  }
  object AppCampaignHook {
    
    inline def apply(): AppCampaignHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCampaignHook]
    }
    
    extension [Self <: AppCampaignHook](x: Self) {
      
      inline def setLambdaFunctionName(value: String): Self = StObject.set(x, "lambdaFunctionName", value.asInstanceOf[js.Any])
      
      inline def setLambdaFunctionNameUndefined: Self = StObject.set(x, "lambdaFunctionName", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
      
      inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
    }
  }
  
  trait AppLimits extends StObject {
    
    /**
      * The maximum number of messages that the campaign can send daily.
      */
    var daily: js.UndefOr[Double] = js.undefined
    
    /**
      * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
      */
    var maximumDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
      */
    var messagesPerSecond: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum total number of messages that the campaign can send.
      */
    var total: js.UndefOr[Double] = js.undefined
  }
  object AppLimits {
    
    inline def apply(): AppLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppLimits]
    }
    
    extension [Self <: AppLimits](x: Self) {
      
      inline def setDaily(value: Double): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
      
      inline def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
      
      inline def setMaximumDuration(value: Double): Self = StObject.set(x, "maximumDuration", value.asInstanceOf[js.Any])
      
      inline def setMaximumDurationUndefined: Self = StObject.set(x, "maximumDuration", js.undefined)
      
      inline def setMessagesPerSecond(value: Double): Self = StObject.set(x, "messagesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setMessagesPerSecondUndefined: Self = StObject.set(x, "messagesPerSecond", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait AppQuietTime extends StObject {
    
    /**
      * The default end time for quiet time in ISO 8601 format. Required if `start` is set
      */
    var end: js.UndefOr[String] = js.undefined
    
    /**
      * The default start time for quiet time in ISO 8601 format. Required if `end` is set
      */
    var start: js.UndefOr[String] = js.undefined
  }
  object AppQuietTime {
    
    inline def apply(): AppQuietTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppQuietTime]
    }
    
    extension [Self <: AppQuietTime](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
