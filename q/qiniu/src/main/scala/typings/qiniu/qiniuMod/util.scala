package typings.qiniu.qiniuMod

import typings.node.Buffer
import typings.qiniu.qiniuMod.auth.digest.Mac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "util")
@js.native
object util extends js.Object {
  def base64ToUrlSafe(v: String): String = js.native
  def encodedEntry(bucket: String): String = js.native
  def encodedEntry(bucket: String, key: String): String = js.native
  /**
    * 创建AccessToken凭证
    * @param mac AK&SK对象
    * @param requestURI 请求URL
    * @param reqBody  请求Body，仅当请求的ContentType为application/x-www-form-urlencoded 时才需要传入该参数
    */
  def generateAccessToken(mac: Mac, requestURI: String): String = js.native
  def generateAccessToken(mac: Mac, requestURI: String, reqBody: String): String = js.native
  /**
    * 创建AccessToken凭证
    * @param mac            AK&SK对象
    * @param requestURI     请求URL
    * @param reqMethod      请求方法，例如 GET，POST
    * @param reqContentType 请求类型，例如 application/json 或者  application/x-www-form-urlencoded
    * @param reqBody        请求Body，仅当请求的 ContentType 为 application/json 或者 application/x-www-form-urlencoded 时才需要传入该参数
    */
  def generateAccessTokenV2(mac: Mac, requestURI: String, reqMethod: String, reqContentType: String): String = js.native
  def generateAccessTokenV2(mac: Mac, requestURI: String, reqMethod: String, reqContentType: String, reqBody: String): String = js.native
  def getAKFromUptoken(uploadToken: String): String = js.native
  def getBucketFromUptoken(uploadToken: String): String = js.native
  def hmacSha1(encodedFlags: String, secretKey: String): String = js.native
  def hmacSha1(encodedFlags: String, secretKey: Buffer): String = js.native
  def hmacSha1(encodedFlags: Buffer, secretKey: String): String = js.native
  def hmacSha1(encodedFlags: Buffer, secretKey: Buffer): String = js.native
  /**
    * 校验七牛上传回调的Authorization
    * @param mac AK&SK对象
    * @param requestURI 回调的URL中的requestURI
    * @param reqBody 回调的URL中的requestURI 请求Body，仅当请求的ContentType为application/x-www-form-urlencoded时才需要传入该参数
    * @param callbackAuth 回调时请求的Authorization头部值
    */
  def isQiniuCallback(mac: Mac, requestURI: String, reqBody: String, callbackAuth: String): Boolean = js.native
  def isQiniuCallback(mac: Mac, requestURI: String, reqBody: Null, callbackAuth: String): Boolean = js.native
  def isTimestampExpired(timestamp: Double): Boolean = js.native
  def urlSafeBase64Decode(fromStr: String): String = js.native
  def urlSafeToBase64(v: String): String = js.native
  def urlsafeBase64Encode(jsonFlags: String): String = js.native
}

