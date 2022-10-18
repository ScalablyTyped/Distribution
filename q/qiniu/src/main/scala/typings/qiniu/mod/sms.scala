package typings.qiniu.mod

import typings.qiniu.anon.Content
import typings.qiniu.anon.Mobile
import typings.qiniu.anon.Mobiles
import typings.qiniu.mod.auth.digest.Mac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sms {
  
  object message {
    
    @JSImport("qiniu", "sms.message")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 发送全文本短信(不需要传模版 ID) (POST Fulltext Message)
      * @link https://developer.qiniu.com/sms/5897/sms-api-send-message#4
      * @param reqBody
      * @param mac
      * @param callback
      */
    inline def sendFulltextMessage(
      reqBody: Content,
      mac: Mac,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback<{  job_id :string}> */ Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendFulltextMessage")(reqBody.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 发送短信 (POST Message)
      * @link https://developer.qiniu.com/sms/5897/sms-api-send-message#1
      * @param reqBody
      * @param mac
      * @param callback
      */
    inline def sendMessage(
      reqBody: Mobiles,
      mac: Mac,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback<{  job_id :string}> */ Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(reqBody.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 发送国际/港澳台短信 (POST Oversea Message)
      * @link https://developer.qiniu.com/sms/5897/sms-api-send-message#3
      * @param reqBody
      * @param mac
      * @param callback
      */
    inline def sendOverseaMessage(
      reqBody: Mobile,
      mac: Mac,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback<{  message_id :string}> */ Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendOverseaMessage")(reqBody.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 发送单条短信 (POST Single Message)
      * @link https://developer.qiniu.com/sms/5897/sms-api-send-message#2
      * @param reqBody
      * @param mac
      * @param callback
      */
    inline def sendSingleMessage(
      reqBody: Mobile,
      mac: Mac,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback<{  message_id :string}> */ Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSingleMessage")(reqBody.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
