package typings.qiniu.mod

import typings.node.NodeJS.ReadableStream
import typings.qiniu.mod.conf.Config
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formUp {
  
  @JSImport("qiniu", "form_up.FormUploader")
  @js.native
  open class FormUploader () extends StObject {
    def this(config: Config) = this()
    
    var conf: Config = js.native
    
    def put(uploadToken: String, key: String, body: Any, putExtra: Null, callback: callback): Unit = js.native
    /**
      *
      * @param uploadToken
      * @param key
      * @param body
      * @param putExtra
      * @param callback
      */
    def put(uploadToken: String, key: String, body: Any, putExtra: PutExtra, callback: callback): Unit = js.native
    def put(uploadToken: String, key: Null, body: Any, putExtra: Null, callback: callback): Unit = js.native
    def put(uploadToken: String, key: Null, body: Any, putExtra: PutExtra, callback: callback): Unit = js.native
    
    def putFile(uploadToken: String, key: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
    /**
      * 上传本地文件
      * @param uploadToken 上传凭证
      * @param key 目标文件名
      * @param localFile 本地文件路径
      * @param putExtra 额外选项
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
    
    def putStream(uploadToken: String, key: String, rsStream: ReadableStream, putExtra: Null, callback: callback): Unit = js.native
    /**
      *
      * @param uploadToken
      * @param key
      * @param rsStream
      * @param putExtra
      * @param callback
      */
    def putStream(uploadToken: String, key: String, rsStream: ReadableStream, putExtra: PutExtra, callback: callback): Unit = js.native
    def putStream(uploadToken: String, key: Null, rsStream: ReadableStream, putExtra: Null, callback: callback): Unit = js.native
    def putStream(uploadToken: String, key: Null, rsStream: ReadableStream, putExtra: PutExtra, callback: callback): Unit = js.native
    
    def putWithoutKey(uploadToken: String, body: Any, putExtra: Null, callback: callback): Unit = js.native
    /**
      *
      * @param uploadToken
      * @param body
      * @param putExtra
      * @param callback
      */
    def putWithoutKey(uploadToken: String, body: Any, putExtra: PutExtra, callback: callback): Unit = js.native
  }
  
  @JSImport("qiniu", "form_up.PutExtra")
  @js.native
  open class PutExtra protected () extends StObject {
    /**
      * 上传可选参数
      * @param fname 请求体中的文件的名称
      * @param params 额外参数设置，参数名称必须以x:开头
      * @param mimeType 指定文件的mimeType
      * @param crc32 指定文件的crc32值
      * @param checkCrc 指定是否检测文件的crc32值
      * @param metadata 元数据设置，参数名称必须以 x-qn-meta-${name}: 开头
      */
    def this(
      fname: js.UndefOr[String],
      params: js.UndefOr[Record[String, String]],
      mimeType: js.UndefOr[String],
      crc32: js.UndefOr[String],
      checkCrc: js.UndefOr[Double | Boolean],
      metadata: js.UndefOr[Record[String, String]]
    ) = this()
    
    /**
      * @default 0|false
      */
    var checkCrc: js.UndefOr[Double | Boolean] = js.native
    
    /**
      * @default null
      */
    var crc32: js.UndefOr[String] = js.native
    
    /**
      * @default ''
      */
    var fname: String = js.native
    
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
    var params: Any = js.native
  }
}
