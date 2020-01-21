package typings.qiniu.mod

import typings.node.NodeJS.ReadableStream
import typings.qiniu.mod.conf.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "resume_up")
@js.native
object resumeUp extends js.Object {
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
    def this(fname: String) = this()
    def this(fname: String, params: js.Any) = this()
    def this(fname: String, params: js.Any, mimeType: String) = this()
    def this(fname: String, params: js.Any, mimeType: String, resumeRecordFile: String) = this()
    def this(
      fname: String,
      params: js.Any,
      mimeType: String,
      resumeRecordFile: String,
      progressCallback: js.Function1[/* data */ js.Any, Unit]
    ) = this()
    /**
      * @default ''
      */
    var fname: String = js.native
    /**
      * @default null
      */
    var mimeType: js.UndefOr[String] = js.native
    /**
      * @default {}
      */
    var params: js.Any = js.native
  }
  
  @js.native
  class ResumeUploader () extends js.Object {
    def this(config: Config) = this()
    var config: Config = js.native
    def putFile(uploadToken: String, key: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
    /**
      *
      * @param uploadToken
      * @param key
      * @param localFile
      * @param putExtra
      * @param callback
      */
    def putFile(uploadToken: String, key: String, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
    def putFile(uploadToken: String, key: Null, localFile: String, putExtra: Null, callback: callback): Unit = js.native
    def putFile(uploadToken: String, key: Null, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
    def putFileWithoutKey(uploadToken: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
    /**
      *
      * @param uploadToken
      * @param localFile
      * @param putExtra
      * @param callback
      */
    def putFileWithoutKey(uploadToken: String, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
    def putStream(
      uploadToken: String,
      key: String,
      rsStream: ReadableStream,
      rsStreamLen: Double,
      putExtra: Null,
      callback: callback
    ): Unit = js.native
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
      uploadToken: String,
      key: String,
      rsStream: ReadableStream,
      rsStreamLen: Double,
      putExtra: PutExtra,
      callback: callback
    ): Unit = js.native
    def putStream(
      uploadToken: String,
      key: Null,
      rsStream: ReadableStream,
      rsStreamLen: Double,
      putExtra: Null,
      callback: callback
    ): Unit = js.native
    def putStream(
      uploadToken: String,
      key: Null,
      rsStream: ReadableStream,
      rsStreamLen: Double,
      putExtra: PutExtra,
      callback: callback
    ): Unit = js.native
  }
  
}

