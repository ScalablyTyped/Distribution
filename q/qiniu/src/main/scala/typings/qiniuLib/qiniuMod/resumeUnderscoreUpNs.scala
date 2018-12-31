package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "resume_up")
@js.native
object resumeUnderscoreUpNs extends js.Object {
  @js.native
  /**
    * 上传可选参数
    * @param fname 请求体中的文件的名称
    * @param params 额外参数设置，参数名称必须以x:开头
    * @param mimeType 指定文件的mimeType
    * @param resumeRecordFile
    * @param progressCallback
    */
  class PutExtra () extends js.Object {
    def this(fname: java.lang.String) = this()
    def this(fname: java.lang.String, params: js.Any) = this()
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String) = this()
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String, resumeRecordFile: java.lang.String) = this()
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String, resumeRecordFile: java.lang.String, progressCallback: js.Function1[/* data */ js.Any, scala.Unit]) = this()
    /**
      * @default ''
      */
    var fname: java.lang.String = js.native
    /**
      * @default null
      */
    var mimeType: js.UndefOr[java.lang.String] = js.native
    /**
      * @default {}
      */
    var params: js.Any = js.native
  }
  
  @js.native
  class ResumeUploader () extends js.Object {
    def this(config: qiniuLib.qiniuMod.confNs.Config) = this()
    var config: qiniuLib.qiniuMod.confNs.Config = js.native
    /**
      *
      * @param uploadToken
      * @param key
      * @param localFile
      * @param putExtra
      * @param callback
      */
    def putFile(
      uploadToken: java.lang.String,
      key: java.lang.String,
      localFile: java.lang.String,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putFile(
      uploadToken: java.lang.String,
      key: java.lang.String,
      localFile: java.lang.String,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putFile(
      uploadToken: java.lang.String,
      key: scala.Null,
      localFile: java.lang.String,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putFile(
      uploadToken: java.lang.String,
      key: scala.Null,
      localFile: java.lang.String,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
      *
      * @param uploadToken
      * @param localFile
      * @param putExtra
      * @param callback
      */
    def putFileWithoutKey(
      uploadToken: java.lang.String,
      localFile: java.lang.String,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putFileWithoutKey(
      uploadToken: java.lang.String,
      localFile: java.lang.String,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
      *
      * @param uploadToken
      * @param key
      * @param rsStream
      * @param rsStreamLen
      * @param putExtra
      * @param callback
      */
    def putStream(
      uploadToken: java.lang.String,
      key: java.lang.String,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      rsStreamLen: scala.Double,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putStream(
      uploadToken: java.lang.String,
      key: java.lang.String,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      rsStreamLen: scala.Double,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putStream(
      uploadToken: java.lang.String,
      key: scala.Null,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      rsStreamLen: scala.Double,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    def putStream(
      uploadToken: java.lang.String,
      key: scala.Null,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      rsStreamLen: scala.Double,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
  }
  
}

