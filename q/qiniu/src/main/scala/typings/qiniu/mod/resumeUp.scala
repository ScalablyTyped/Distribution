package typings.qiniu.mod

import typings.node.NodeJS.ReadableStream
import typings.qiniu.mod.conf.Config
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resumeUp {
  
  @JSImport("qiniu", "resume_up.PutExtra")
  @js.native
  open class PutExtra protected () extends StObject {
    /**
      * 上传可选参数
      * @param fname 请求体中的文件的名称
      * @param params 额外参数设置，参数名称必须以x:开头
      * @param mimeType 指定文件的mimeType
      * @param resumeRecordFile
      * @param progressCallback
      * @param partSize 分片上传v2必传字段 默认大小为4MB 分片大小范围为1 MB - 1 GB
      * @param version 分片上传版本 目前支持v1/v2版本 默认v1
      * @param metadata 元数据设置，参数名称必须以 x-qn-meta-${name}: 开头
      */
    def this(
      fname: js.UndefOr[String],
      params: js.UndefOr[Record[String, String]],
      mimeType: js.UndefOr[String],
      resumeRecordFile: js.UndefOr[String],
      progressCallback: js.UndefOr[js.Function2[/* uploadBytes */ Double, /* totalBytes */ Double, Unit]],
      partSize: js.UndefOr[Double],
      version: js.UndefOr[String],
      metadata: js.UndefOr[Record[String, String]]
    ) = this()
    
    /**
      * @default ''
      */
    var fname: js.UndefOr[String] = js.native
    
    /**
      * @default {}
      */
    var metadata: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * @default null
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * @default {}
      */
    var params: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * @default 4 * 1024 * 1024
      */
    var partSize: js.UndefOr[Double] = js.native
    
    /**
      * @default null
      */
    var progressCallback: js.UndefOr[js.Function2[/* uploadBytes */ Double, /* totalBytes */ Double, Unit]] = js.native
    
    /**
      * @default null
      */
    var resumeRecordFile: js.UndefOr[String] = js.native
    
    /**
      * @default v1
      */
    var version: js.UndefOr[String] = js.native
  }
  
  @JSImport("qiniu", "resume_up.ResumeUploader")
  @js.native
  open class ResumeUploader () extends StObject {
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
