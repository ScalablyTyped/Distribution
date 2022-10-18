package typings.qiniu.mod

import typings.node.bufferMod.global.Buffer
import typings.qiniu.mod.auth.digest.Mac
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("qiniu", "util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64ToUrlSafe(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToUrlSafe")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def canonicalMimeHeaderKey(fieldName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalMimeHeaderKey")(fieldName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodedEntry(bucket: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodedEntry")(bucket.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodedEntry(bucket: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodedEntry")(bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateUTC(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDateUTC")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDateUTC(date: String, layout: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateUTC")(date.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * 使用 UTC 时间来格式化日期时间
    *
    * @param date 与 new Date() 接受的参数一样，内部会使用 new Date(date) 生成日期时间对象
    * @param layout 目前仅接受
    *      YYYY
    *      MM
    *      DD
    *      HH
    *      mm
    *      ss
    *      SSS
    */
  inline def formatDateUTC(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDateUTC")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDateUTC(date: js.Date, layout: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateUTC")(date.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDateUTC(date: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDateUTC")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDateUTC(date: Double, layout: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateUTC")(date.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * 创建AccessToken凭证
    * @param mac AK&SK对象
    * @param requestURI 请求URL
    * @param reqBody  请求Body，仅当请求的ContentType为application/x-www-form-urlencoded 时才需要传入该参数
    */
  inline def generateAccessToken(mac: Mac, requestURI: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAccessToken")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateAccessToken(mac: Mac, requestURI: String, reqBody: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAccessToken")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqBody.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * 创建AccessToken凭证
    * @param mac            AK&SK对象
    * @param requestURI     请求URL
    * @param reqMethod      请求方法，例如 GET，POST
    * @param reqContentType 请求类型，例如 application/json 或者  application/x-www-form-urlencoded
    * @param reqBody        请求Body，仅当请求的 ContentType 为 application/json 或者 application/x-www-form-urlencoded 时才需要传入该参数
    * @param reqHeaders     请求Headers，例如 {"X-Qiniu-Name": "Qiniu", "Content-Type": "application/x-www-form-urlencoded"}
    */
  inline def generateAccessTokenV2(mac: Mac, requestURI: String, reqMethod: String, reqContentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAccessTokenV2")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqMethod.asInstanceOf[js.Any], reqContentType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateAccessTokenV2(mac: Mac, requestURI: String, reqMethod: String, reqContentType: String, reqBody: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAccessTokenV2")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqMethod.asInstanceOf[js.Any], reqContentType.asInstanceOf[js.Any], reqBody.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateAccessTokenV2(
    mac: Mac,
    requestURI: String,
    reqMethod: String,
    reqContentType: String,
    reqBody: String,
    reqHeaders: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAccessTokenV2")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqMethod.asInstanceOf[js.Any], reqContentType.asInstanceOf[js.Any], reqBody.asInstanceOf[js.Any], reqHeaders.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateAccessTokenV2(
    mac: Mac,
    requestURI: String,
    reqMethod: String,
    reqContentType: String,
    reqBody: Unit,
    reqHeaders: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAccessTokenV2")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqMethod.asInstanceOf[js.Any], reqContentType.asInstanceOf[js.Any], reqBody.asInstanceOf[js.Any], reqHeaders.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAKFromUptoken(uploadToken: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAKFromUptoken")(uploadToken.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBucketFromUptoken(uploadToken: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketFromUptoken")(uploadToken.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hmacSha1(encodedFlags: String, secretKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha1")(encodedFlags.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmacSha1(encodedFlags: String, secretKey: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha1")(encodedFlags.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmacSha1(encodedFlags: Buffer, secretKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha1")(encodedFlags.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmacSha1(encodedFlags: Buffer, secretKey: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha1")(encodedFlags.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * 校验七牛上传回调的Authorization
    * @param mac AK&SK对象
    * @param requestURI 回调的URL中的requestURI
    * @param reqBody 回调的URL中的requestURI 请求Body，仅当请求的ContentType为application/x-www-form-urlencoded时才需要传入该参数
    * @param callbackAuth 回调时请求的Authorization头部值
    */
  inline def isQiniuCallback(mac: Mac, requestURI: String, reqBody: String, callbackAuth: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isQiniuCallback")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqBody.asInstanceOf[js.Any], callbackAuth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isQiniuCallback(mac: Mac, requestURI: String, reqBody: Null, callbackAuth: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isQiniuCallback")(mac.asInstanceOf[js.Any], requestURI.asInstanceOf[js.Any], reqBody.asInstanceOf[js.Any], callbackAuth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTimestampExpired(timestamp: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimestampExpired")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def urlSafeBase64Decode(fromStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Decode")(fromStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlSafeToBase64(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeToBase64")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlsafeBase64Encode(jsonFlags: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlsafeBase64Encode")(jsonFlags.asInstanceOf[js.Any]).asInstanceOf[String]
}
