package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rpc")
@js.native
object rpcNs extends js.Object {
  trait Headers extends js.Object {
    var Connection: js.UndefOr[java.lang.String] = js.undefined
    var `User-Agent`: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def post(
    requestURI: java.lang.String,
    requestForm: java.lang.String,
    headers: Headers,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def post(
    requestURI: java.lang.String,
    requestForm: java.lang.String,
    headers: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param headers
    * @param callback
    */
  def post(
    requestURI: java.lang.String,
    requestForm: nodeLib.Buffer,
    headers: Headers,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def post(
    requestURI: java.lang.String,
    requestForm: nodeLib.Buffer,
    headers: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def post(
    requestURI: java.lang.String,
    requestForm: nodeLib.NodeJSNs.ReadableStream,
    headers: Headers,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def post(
    requestURI: java.lang.String,
    requestForm: nodeLib.NodeJSNs.ReadableStream,
    headers: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def post(
    requestURI: java.lang.String,
    requestForm: scala.Null,
    headers: Headers,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def post(
    requestURI: java.lang.String,
    requestForm: scala.Null,
    headers: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postMultipart(requestURI: java.lang.String, requestForm: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param callback
    */
  def postMultipart(requestURI: java.lang.String, requestForm: nodeLib.Buffer, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
  def postMultipart(
    requestURI: java.lang.String,
    requestForm: nodeLib.NodeJSNs.ReadableStream,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postMultipart(requestURI: java.lang.String, requestForm: scala.Null, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: java.lang.String,
    token: java.lang.String,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: java.lang.String,
    token: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param token
    * @param callback
    */
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: nodeLib.Buffer,
    token: java.lang.String,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: nodeLib.Buffer,
    token: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: nodeLib.NodeJSNs.ReadableStream,
    token: java.lang.String,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: nodeLib.NodeJSNs.ReadableStream,
    token: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: scala.Null,
    token: java.lang.String,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  def postWithForm(
    requestURI: java.lang.String,
    requestForm: scala.Null,
    token: scala.Null,
    callback: qiniuLib.qiniuMod.callback
  ): scala.Unit = js.native
  /**
    *
    * @param requestURI
    * @param token
    * @param callback
    */
  def postWithoutForm(requestURI: java.lang.String, token: java.lang.String, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
  def postWithoutForm(requestURI: java.lang.String, token: scala.Null, callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
}

