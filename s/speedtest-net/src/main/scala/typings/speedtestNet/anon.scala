package typings.speedtestNet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Download extends StObject {
    
    var download: IsScalingEnabled
    
    var stableStop: IsEnabled
  }
  object Download {
    
    @scala.inline
    def apply(download: IsScalingEnabled, stableStop: IsEnabled): Download = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], stableStop = stableStop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Download]
    }
    
    @scala.inline
    implicit class DownloadMutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: IsScalingEnabled): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStableStop(value: IsEnabled): Self = StObject.set(x, "stableStop", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dynamic extends StObject {
    
    var dynamic: Download
    
    var engine: IsUploadFirst
  }
  object Dynamic {
    
    @scala.inline
    def apply(dynamic: Download, engine: IsUploadFirst): Dynamic = {
      val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dynamic]
    }
    
    @scala.inline
    implicit class DynamicMutableBuilder[Self <: Dynamic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamic(value: Download): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: IsUploadFirst): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var url: String
  }
  object Id {
    
    @scala.inline
    def apply(id: String, url: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsClientPrimaryMeasureMethod extends StObject {
    
    var isClientPrimaryMeasureMethod: Boolean
    
    var isServerUploadEnabled: Boolean
  }
  object IsClientPrimaryMeasureMethod {
    
    @scala.inline
    def apply(isClientPrimaryMeasureMethod: Boolean, isServerUploadEnabled: Boolean): IsClientPrimaryMeasureMethod = {
      val __obj = js.Dynamic.literal(isClientPrimaryMeasureMethod = isClientPrimaryMeasureMethod.asInstanceOf[js.Any], isServerUploadEnabled = isServerUploadEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsClientPrimaryMeasureMethod]
    }
    
    @scala.inline
    implicit class IsClientPrimaryMeasureMethodMutableBuilder[Self <: IsClientPrimaryMeasureMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsClientPrimaryMeasureMethod(value: Boolean): Self = StObject.set(x, "isClientPrimaryMeasureMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsServerUploadEnabled(value: Boolean): Self = StObject.set(x, "isServerUploadEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsEnabled extends StObject {
    
    var isEnabled: Boolean
  }
  object IsEnabled {
    
    @scala.inline
    def apply(isEnabled: Boolean): IsEnabled = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsEnabled]
    }
    
    @scala.inline
    implicit class IsEnabledMutableBuilder[Self <: IsEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsScalingEnabled extends StObject {
    
    var isScalingEnabled: Boolean
    
    var maxThreadCount: Double
  }
  object IsScalingEnabled {
    
    @scala.inline
    def apply(isScalingEnabled: Boolean, maxThreadCount: Double): IsScalingEnabled = {
      val __obj = js.Dynamic.literal(isScalingEnabled = isScalingEnabled.asInstanceOf[js.Any], maxThreadCount = maxThreadCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsScalingEnabled]
    }
    
    @scala.inline
    implicit class IsScalingEnabledMutableBuilder[Self <: IsScalingEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsScalingEnabled(value: Boolean): Self = StObject.set(x, "isScalingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxThreadCount(value: Double): Self = StObject.set(x, "maxThreadCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsUploadFirst extends StObject {
    
    var isUploadFirst: Boolean
    
    var packetSizeBytes: Double
    
    var testDurationSeconds: Double
    
    var threadCount: Double
  }
  object IsUploadFirst {
    
    @scala.inline
    def apply(isUploadFirst: Boolean, packetSizeBytes: Double, testDurationSeconds: Double, threadCount: Double): IsUploadFirst = {
      val __obj = js.Dynamic.literal(isUploadFirst = isUploadFirst.asInstanceOf[js.Any], packetSizeBytes = packetSizeBytes.asInstanceOf[js.Any], testDurationSeconds = testDurationSeconds.asInstanceOf[js.Any], threadCount = threadCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsUploadFirst]
    }
    
    @scala.inline
    implicit class IsUploadFirstMutableBuilder[Self <: IsUploadFirst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsUploadFirst(value: Boolean): Self = StObject.set(x, "isUploadFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacketSizeBytes(value: Double): Self = StObject.set(x, "packetSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestDurationSeconds(value: Double): Self = StObject.set(x, "testDurationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadCount(value: Double): Self = StObject.set(x, "threadCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latency extends StObject {
    
    var latency: PingCount
    
    var upload: IsClientPrimaryMeasureMethod
  }
  object Latency {
    
    @scala.inline
    def apply(latency: PingCount, upload: IsClientPrimaryMeasureMethod): Latency = {
      val __obj = js.Dynamic.literal(latency = latency.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latency]
    }
    
    @scala.inline
    implicit class LatencyMutableBuilder[Self <: Latency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatency(value: PingCount): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload(value: IsClientPrimaryMeasureMethod): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var version: String
  }
  object Message {
    
    @scala.inline
    def apply(message: String, version: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PingCount extends StObject {
    
    var pingCount: Double
  }
  object PingCount {
    
    @scala.inline
    def apply(pingCount: Double): PingCount = {
      val __obj = js.Dynamic.literal(pingCount = pingCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingCount]
    }
    
    @scala.inline
    implicit class PingCountMutableBuilder[Self <: PingCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPingCount(value: Double): Self = StObject.set(x, "pingCount", value.asInstanceOf[js.Any])
    }
  }
}
