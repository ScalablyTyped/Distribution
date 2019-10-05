package typings.qiniu.qiniuMod.rpc

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.qiniu.qiniuMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rpc.postWithForm")
@js.native
object postWithForm extends js.Object {
  def apply(requestURI: String, requestForm: String, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: String, token: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, token: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param token
    * @param callback
    */
  def apply(requestURI: String, requestForm: Buffer, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Buffer, token: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, token: Null, callback: callback): Unit = js.native
}

