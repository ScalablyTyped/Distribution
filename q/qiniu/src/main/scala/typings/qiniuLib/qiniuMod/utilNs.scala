package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "util")
@js.native
object utilNs extends js.Object {
  def base64ToUrlSafe(v: java.lang.String): java.lang.String = js.native
  def encodedEntry(bucket: java.lang.String): java.lang.String = js.native
  def encodedEntry(bucket: java.lang.String, key: java.lang.String): java.lang.String = js.native
  /**
       * 创建AccessToken凭证
       * @param mac AK&SK对象
       * @param requestURI 请求URL
       * @param reqBody  请求Body，仅当请求的ContentType为application/x-www-form-urlencoded 时才需要传入该参数
       */
  def generateAccessToken(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac, requestURI: java.lang.String): java.lang.String = js.native
  /**
       * 创建AccessToken凭证
       * @param mac AK&SK对象
       * @param requestURI 请求URL
       * @param reqBody  请求Body，仅当请求的ContentType为application/x-www-form-urlencoded 时才需要传入该参数
       */
  def generateAccessToken(
    mac: qiniuLib.qiniuMod.authNs.digestNs.Mac,
    requestURI: java.lang.String,
    reqBody: java.lang.String
  ): java.lang.String = js.native
  /**
       * 创建AccessToken凭证
       * @param mac            AK&SK对象
       * @param requestURI     请求URL
       * @param reqMethod      请求方法，例如 GET，POST
       * @param reqContentType 请求类型，例如 application/json 或者  application/x-www-form-urlencoded
       * @param reqBody        请求Body，仅当请求的 ContentType 为 application/json 或者 application/x-www-form-urlencoded 时才需要传入该参数
       */
  def generateAccessTokenV2(
    mac: qiniuLib.qiniuMod.authNs.digestNs.Mac,
    requestURI: java.lang.String,
    reqMethod: java.lang.String,
    reqContentType: java.lang.String
  ): java.lang.String = js.native
  /**
       * 创建AccessToken凭证
       * @param mac            AK&SK对象
       * @param requestURI     请求URL
       * @param reqMethod      请求方法，例如 GET，POST
       * @param reqContentType 请求类型，例如 application/json 或者  application/x-www-form-urlencoded
       * @param reqBody        请求Body，仅当请求的 ContentType 为 application/json 或者 application/x-www-form-urlencoded 时才需要传入该参数
       */
  def generateAccessTokenV2(
    mac: qiniuLib.qiniuMod.authNs.digestNs.Mac,
    requestURI: java.lang.String,
    reqMethod: java.lang.String,
    reqContentType: java.lang.String,
    reqBody: java.lang.String
  ): java.lang.String = js.native
  def getAKFromUptoken(uploadToken: java.lang.String): java.lang.String = js.native
  def getBucketFromUptoken(uploadToken: java.lang.String): java.lang.String = js.native
  def hmacSha1(encodedFlags: java.lang.String, secretKey: java.lang.String): java.lang.String = js.native
  def hmacSha1(encodedFlags: java.lang.String, secretKey: nodeLib.Buffer): java.lang.String = js.native
  def hmacSha1(encodedFlags: nodeLib.Buffer, secretKey: java.lang.String): java.lang.String = js.native
  def hmacSha1(encodedFlags: nodeLib.Buffer, secretKey: nodeLib.Buffer): java.lang.String = js.native
  /**
       * 校验七牛上传回调的Authorization
       * @param mac AK&SK对象
       * @param requestURI 回调的URL中的requestURI
       * @param reqBody 回调的URL中的requestURI 请求Body，仅当请求的ContentType为application/x-www-form-urlencoded时才需要传入该参数
       * @param callbackAuth 回调时请求的Authorization头部值
       */
  def isQiniuCallback(
    mac: qiniuLib.qiniuMod.authNs.digestNs.Mac,
    requestURI: java.lang.String,
    reqBody: java.lang.String,
    callbackAuth: java.lang.String
  ): scala.Boolean = js.native
  /**
       * 校验七牛上传回调的Authorization
       * @param mac AK&SK对象
       * @param requestURI 回调的URL中的requestURI
       * @param reqBody 回调的URL中的requestURI 请求Body，仅当请求的ContentType为application/x-www-form-urlencoded时才需要传入该参数
       * @param callbackAuth 回调时请求的Authorization头部值
       */
  def isQiniuCallback(
    mac: qiniuLib.qiniuMod.authNs.digestNs.Mac,
    requestURI: java.lang.String,
    reqBody: scala.Null,
    callbackAuth: java.lang.String
  ): scala.Boolean = js.native
  def isTimestampExpired(timestamp: scala.Double): scala.Boolean = js.native
  def urlSafeBase64Decode(fromStr: java.lang.String): java.lang.String = js.native
  def urlSafeToBase64(v: java.lang.String): java.lang.String = js.native
  def urlsafeBase64Encode(jsonFlags: java.lang.String): java.lang.String = js.native
}

