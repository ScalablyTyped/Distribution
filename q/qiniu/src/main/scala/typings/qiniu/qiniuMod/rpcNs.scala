package typings.qiniu.qiniuMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.qiniu.qiniuMod.rpcNs.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rpc")
@js.native
object rpcNs extends js.Object {
  trait Headers extends js.Object {
    var Connection: js.UndefOr[String] = js.undefined
    var `User-Agent`: js.UndefOr[String] = js.undefined
  }
  
  def post(requestURI: String, requestForm: String, headers: Null, callback: callback): Unit = js.native
  def post(requestURI: String, requestForm: String, headers: Headers, callback: callback): Unit = js.native
  def post(requestURI: String, requestForm: Null, headers: Null, callback: callback): Unit = js.native
  def post(requestURI: String, requestForm: Null, headers: Headers, callback: callback): Unit = js.native
  def post(requestURI: String, requestForm: Buffer, headers: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param headers
    * @param callback
    */
  def post(requestURI: String, requestForm: Buffer, headers: Headers, callback: callback): Unit = js.native
  def post(requestURI: String, requestForm: ReadableStream, headers: Null, callback: callback): Unit = js.native
  def post(requestURI: String, requestForm: ReadableStream, headers: Headers, callback: callback): Unit = js.native
  def postMultipart(requestURI: String, requestForm: String, callback: callback): Unit = js.native
  def postMultipart(requestURI: String, requestForm: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param callback
    */
  def postMultipart(requestURI: String, requestForm: Buffer, callback: callback): Unit = js.native
  def postMultipart(requestURI: String, requestForm: ReadableStream, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: String, token: String, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: String, token: Null, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: Null, token: String, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: Null, token: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param token
    * @param callback
    */
  def postWithForm(requestURI: String, requestForm: Buffer, token: String, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: Buffer, token: Null, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: ReadableStream, token: String, callback: callback): Unit = js.native
  def postWithForm(requestURI: String, requestForm: ReadableStream, token: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param token
    * @param callback
    */
  def postWithoutForm(requestURI: String, token: String, callback: callback): Unit = js.native
  def postWithoutForm(requestURI: String, token: Null, callback: callback): Unit = js.native
}

