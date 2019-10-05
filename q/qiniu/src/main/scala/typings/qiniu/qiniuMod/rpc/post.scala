package typings.qiniu.qiniuMod.rpc

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.qiniu.qiniuMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rpc.post")
@js.native
object post extends js.Object {
  def apply(requestURI: String, requestForm: String, headers: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: String, headers: Headers, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, headers: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, headers: Headers, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Buffer, headers: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param headers
    * @param callback
    */
  def apply(requestURI: String, requestForm: Buffer, headers: Headers, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, headers: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, headers: Headers, callback: callback): Unit = js.native
}

