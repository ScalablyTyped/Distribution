package typings.qiniuJs

import typings.qiniuJs.anon.PartialExtra
import typings.qiniuJs.esmApiMod.UploadCompleteData
import typings.qiniuJs.esmErrorsMod.QiniuError
import typings.qiniuJs.esmErrorsMod.QiniuNetworkError
import typings.qiniuJs.esmErrorsMod.QiniuRequestError
import typings.qiniuJs.esmLoggerMod.default
import typings.qiniuJs.esmUploadBaseMod.Config
import typings.qiniuJs.esmUploadBaseMod.UploadHandlers
import typings.qiniuJs.esmUploadBaseMod.UploadOptions
import typings.qiniuJs.esmUploadBaseMod.UploadProgress
import typings.qiniuJs.esmUploadHostsMod.HostPool
import typings.qiniuJs.esmUtilsMod.Observable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUploadMod {
  
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
  
  inline def createUploadManager(options: UploadOptions, handlers: UploadHandlers, hostPool: HostPool, logger: default): typings.qiniuJs.esmUploadResumeMod.default | typings.qiniuJs.esmUploadDirectMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createUploadManager")(options.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], hostPool.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.qiniuJs.esmUploadResumeMod.default | typings.qiniuJs.esmUploadDirectMod.default]
}
