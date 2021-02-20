package typings.serverlessTencentScf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Appid extends StObject {
    
    var appid: String = js.native
    
    var name: String = js.native
    
    var region: String = js.native
  }
  object Appid {
    
    @scala.inline
    def apply(appid: String, name: String, region: String): Appid = {
      val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[Appid]
    }
    
    @scala.inline
    implicit class AppidMutableBuilder[Self <: Appid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CosBucket extends StObject {
    
    var cosBucket: Appid = js.native
    
    var cosNotificationId: String = js.native
    
    var cosObject: Key = js.native
    
    var cosSchemaVersion: String = js.native
  }
  object CosBucket {
    
    @scala.inline
    def apply(cosBucket: Appid, cosNotificationId: String, cosObject: Key, cosSchemaVersion: String): CosBucket = {
      val __obj = js.Dynamic.literal(cosBucket = cosBucket.asInstanceOf[js.Any], cosNotificationId = cosNotificationId.asInstanceOf[js.Any], cosObject = cosObject.asInstanceOf[js.Any], cosSchemaVersion = cosSchemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[CosBucket]
    }
    
    @scala.inline
    implicit class CosBucketMutableBuilder[Self <: CosBucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCosBucket(value: Appid): Self = StObject.set(x, "cosBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCosNotificationId(value: String): Self = StObject.set(x, "cosNotificationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCosObject(value: Key): Self = StObject.set(x, "cosObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCosSchemaVersion(value: String): Self = StObject.set(x, "cosSchemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventName extends StObject {
    
    var eventName: String = js.native
    
    var eventQueue: String = js.native
    
    var eventSource: String = js.native
    
    var eventTime: Double = js.native
    
    var eventVersion: String = js.native
    
    var reqid: Double = js.native
    
    var requestParameters: RequestHeaders = js.native
    
    var reservedInfo: String = js.native
  }
  object EventName {
    
    @scala.inline
    def apply(
      eventName: String,
      eventQueue: String,
      eventSource: String,
      eventTime: Double,
      eventVersion: String,
      reqid: Double,
      requestParameters: RequestHeaders,
      reservedInfo: String
    ): EventName = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventQueue = eventQueue.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], reqid = reqid.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], reservedInfo = reservedInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventQueue(value: String): Self = StObject.set(x, "eventQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqid(value: Double): Self = StObject.set(x, "reqid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestParameters(value: RequestHeaders): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedInfo(value: String): Self = StObject.set(x, "reservedInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var meta: StringDictionary[String] = js.native
    
    var size: Double = js.native
    
    var url: String = js.native
    
    var vid: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, meta: StringDictionary[String], size: Double, url: String, vid: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vid = vid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: StringDictionary[String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVid(value: String): Self = StObject.set(x, "vid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MsgBody extends StObject {
    
    var msgBody: String = js.native
    
    var msgId: String = js.native
    
    var msgTag: String = js.native
    
    var publishTime: String = js.native
    
    var requestId: String = js.native
    
    var subscriptionName: String = js.native
    
    var topicName: String = js.native
    
    var topicOwner: Double = js.native
    
    var `type`: String = js.native
  }
  object MsgBody {
    
    @scala.inline
    def apply(
      msgBody: String,
      msgId: String,
      msgTag: String,
      publishTime: String,
      requestId: String,
      subscriptionName: String,
      topicName: String,
      topicOwner: Double,
      `type`: String
    ): MsgBody = {
      val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], msgTag = msgTag.asInstanceOf[js.Any], publishTime = publishTime.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any], topicName = topicName.asInstanceOf[js.Any], topicOwner = topicOwner.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgBody]
    }
    
    @scala.inline
    implicit class MsgBodyMutableBuilder[Self <: MsgBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsgBody(value: String): Self = StObject.set(x, "msgBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgId(value: String): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgTag(value: String): Self = StObject.set(x, "msgTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionName(value: String): Self = StObject.set(x, "subscriptionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicOwner(value: Double): Self = StObject.set(x, "topicOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MsgKey extends StObject {
    
    var msgBody: String = js.native
    
    var msgKey: String = js.native
    
    var offset: Double = js.native
    
    var partition: Double = js.native
    
    var topic: String = js.native
  }
  object MsgKey {
    
    @scala.inline
    def apply(msgBody: String, msgKey: String, offset: Double, partition: Double, topic: String): MsgKey = {
      val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgKey]
    }
    
    @scala.inline
    implicit class MsgKeyMutableBuilder[Self <: MsgKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsgBody(value: String): Self = StObject.set(x, "msgBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgKey(value: String): Self = StObject.set(x, "msgKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestHeaders extends StObject {
    
    var requestHeaders: StringDictionary[String] = js.native
    
    var requestSourceIP: String = js.native
  }
  object RequestHeaders {
    
    @scala.inline
    def apply(requestHeaders: StringDictionary[String], requestSourceIP: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestSourceIP = requestSourceIP.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHeaders]
    }
    
    @scala.inline
    implicit class RequestHeadersMutableBuilder[Self <: RequestHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHeaders(value: StringDictionary[String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestSourceIP(value: String): Self = StObject.set(x, "requestSourceIP", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecretId extends StObject {
    
    var secretId: js.UndefOr[String] = js.native
  }
  object SecretId {
    
    @scala.inline
    def apply(): SecretId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretId]
    }
    
    @scala.inline
    implicit class SecretIdMutableBuilder[Self <: SecretId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretIdUndefined: Self = StObject.set(x, "secretId", js.undefined)
    }
  }
  
  @js.native
  trait Stage extends StObject {
    
    var stage: String = js.native
  }
  object Stage {
    
    @scala.inline
    def apply(stage: String): Stage = {
      val __obj = js.Dynamic.literal(stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stage]
    }
    
    @scala.inline
    implicit class StageMutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
}
