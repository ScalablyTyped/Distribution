package typings.qiniuJs

import typings.qiniuJs.anon.PartialExtra
import typings.qiniuJs.apiMod.UploadCompleteData
import typings.qiniuJs.baseMod.Config
import typings.qiniuJs.baseMod.UploadHandlers
import typings.qiniuJs.baseMod.UploadOptions
import typings.qiniuJs.baseMod.UploadProgress
import typings.qiniuJs.errorsMod.QiniuError
import typings.qiniuJs.errorsMod.QiniuNetworkError
import typings.qiniuJs.errorsMod.QiniuRequestError
import typings.qiniuJs.hostsMod.HostPool
import typings.qiniuJs.loggerMod.default
import typings.qiniuJs.utilsMod.Observable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod {
  
  @JSImport("qiniu-js/esm/upload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(file: File, key: String, token: String): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: String, token: String, putExtra: Unit, config: Config): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: String, token: String, putExtra: PartialExtra): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: String, token: String, putExtra: PartialExtra, config: Config): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Null, token: String): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Null, token: String, putExtra: Unit, config: Config): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Null, token: String, putExtra: PartialExtra): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Null, token: String, putExtra: PartialExtra, config: Config): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Unit, token: String): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Unit, token: String, putExtra: Unit, config: Config): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Unit, token: String, putExtra: PartialExtra): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def default(file: File, key: Unit, token: String, putExtra: PartialExtra, config: Config): Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    QiniuError | QiniuRequestError | QiniuNetworkError, 
    UploadCompleteData
  ]]
  
  @JSImport("qiniu-js/esm/upload", "DEFAULT_CHUNK_SIZE")
  @js.native
  val DEFAULT_CHUNK_SIZE: /* 4 */ Double = js.native
  
  @JSImport("qiniu-js/esm/upload", "FREEZE_CODE_LIST")
  @js.native
  val FREEZE_CODE_LIST: js.Array[Double] = js.native
  
  @JSImport("qiniu-js/esm/upload", "RETRY_CODE_LIST")
  @js.native
  val RETRY_CODE_LIST: js.Array[Double] = js.native
  
  inline def createUploadManager(options: UploadOptions, handlers: UploadHandlers, hostPool: HostPool, logger: default): typings.qiniuJs.resumeMod.default | typings.qiniuJs.directMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadManager")(options.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], hostPool.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.qiniuJs.resumeMod.default | typings.qiniuJs.directMod.default]
}
