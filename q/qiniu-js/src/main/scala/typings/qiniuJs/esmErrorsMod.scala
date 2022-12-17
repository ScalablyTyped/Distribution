package typings.qiniuJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmErrorsMod {
  
  @JSImport("qiniu-js/esm/errors", "QiniuError")
  @js.native
  open class QiniuError protected ()
    extends StObject
       with Error {
    def this(name: QiniuErrorName, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_QiniuError: QiniuErrorName = js.native
  }
  
  @js.native
  sealed trait QiniuErrorName extends StObject
  @JSImport("qiniu-js/esm/errors", "QiniuErrorName")
  @js.native
  object QiniuErrorName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[QiniuErrorName & String] = js.native
    
    @js.native
    sealed trait FileReaderReadFailed
      extends StObject
         with QiniuErrorName
    /* "FileReaderReadFailed" */ val FileReaderReadFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.FileReaderReadFailed & String = js.native
    
    @js.native
    sealed trait GetCanvasContextFailed
      extends StObject
         with QiniuErrorName
    /* "GetCanvasContextFailed" */ val GetCanvasContextFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.GetCanvasContextFailed & String = js.native
    
    @js.native
    sealed trait InvalidCacheData
      extends StObject
         with QiniuErrorName
    /* "InvalidCacheData" */ val InvalidCacheData: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidCacheData & String = js.native
    
    @js.native
    sealed trait InvalidChunkSize
      extends StObject
         with QiniuErrorName
    /* "InvalidChunkSize" */ val InvalidChunkSize: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidChunkSize & String = js.native
    
    @js.native
    sealed trait InvalidCustomVars
      extends StObject
         with QiniuErrorName
    /* "InvalidCustomVars" */ val InvalidCustomVars: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidCustomVars & String = js.native
    
    @js.native
    sealed trait InvalidFile
      extends StObject
         with QiniuErrorName
    /* "InvalidFile" */ val InvalidFile: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidFile & String = js.native
    
    @js.native
    sealed trait InvalidMetadata
      extends StObject
         with QiniuErrorName
    /* "InvalidMetadata" */ val InvalidMetadata: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidMetadata & String = js.native
    
    @js.native
    sealed trait InvalidProgressEventTarget
      extends StObject
         with QiniuErrorName
    /* "InvalidProgressEventTarget" */ val InvalidProgressEventTarget: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidProgressEventTarget & String = js.native
    
    @js.native
    sealed trait InvalidToken
      extends StObject
         with QiniuErrorName
    /* "InvalidToken" */ val InvalidToken: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidToken & String = js.native
    
    @js.native
    sealed trait NotAvailableUploadHost
      extends StObject
         with QiniuErrorName
    /* "NotAvailableUploadHost" */ val NotAvailableUploadHost: typings.qiniuJs.esmErrorsMod.QiniuErrorName.NotAvailableUploadHost & String = js.native
    
    @js.native
    sealed trait NotAvailableXMLHttpRequest
      extends StObject
         with QiniuErrorName
    /* "NotAvailableXMLHttpRequest" */ val NotAvailableXMLHttpRequest: typings.qiniuJs.esmErrorsMod.QiniuErrorName.NotAvailableXMLHttpRequest & String = js.native
    
    @js.native
    sealed trait ReadCacheFailed
      extends StObject
         with QiniuErrorName
    /* "ReadCacheFailed" */ val ReadCacheFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.ReadCacheFailed & String = js.native
    
    @js.native
    sealed trait RemoveCacheFailed
      extends StObject
         with QiniuErrorName
    /* "RemoveCacheFailed" */ val RemoveCacheFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.RemoveCacheFailed & String = js.native
    
    @js.native
    sealed trait RequestError
      extends StObject
         with QiniuErrorName
    /* "RequestError" */ val RequestError: typings.qiniuJs.esmErrorsMod.QiniuErrorName.RequestError & String = js.native
    
    @js.native
    sealed trait UnsupportedFileType
      extends StObject
         with QiniuErrorName
    /* "UnsupportedFileType" */ val UnsupportedFileType: typings.qiniuJs.esmErrorsMod.QiniuErrorName.UnsupportedFileType & String = js.native
    
    @js.native
    sealed trait WriteCacheFailed
      extends StObject
         with QiniuErrorName
    /* "WriteCacheFailed" */ val WriteCacheFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.WriteCacheFailed & String = js.native
  }
  
  @JSImport("qiniu-js/esm/errors", "QiniuNetworkError")
  @js.native
  open class QiniuNetworkError protected () extends QiniuRequestError {
    def this(message: String) = this()
    def this(message: String, reqId: String) = this()
  }
  
  @JSImport("qiniu-js/esm/errors", "QiniuRequestError")
  @js.native
  open class QiniuRequestError protected () extends QiniuError {
    def this(code: Double, reqId: String, message: String) = this()
    def this(code: Double, reqId: String, message: String, data: Any) = this()
    
    var code: Double = js.native
    
    /**
      * @description 发生错误时服务端返回的错误信息，如果返回不是一个合法的 json、则该字段为 undefined
      */
    var data: js.UndefOr[Any] = js.native
    
    /**
      * @description 标记当前的 error 类型是一个 QiniuRequestError
      * @deprecated 下一个大版本将会移除，不推荐使用，推荐直接使用 instanceof 进行判断
      */
    var isRequestError: Boolean = js.native
    
    var reqId: String = js.native
  }
}
