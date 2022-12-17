package typings.qiniuJs

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.anon.Authorization
import typings.qiniuJs.anon.AuthorizationString
import typings.qiniuJs.anon.PartialConfig
import typings.qiniuJs.esmLoggerMod.default
import typings.qiniuJs.esmUploadBaseMod.InternalConfig
import typings.qiniuJs.esmUploadResumeMod.LocalInfo
import typings.qiniuJs.esmUtilsCompressMod.CompressOptions
import typings.qiniuJs.esmUtilsCompressMod.CompressResult
import typings.qiniuJs.esmUtilsHelperMod.PutPolicy
import typings.qiniuJs.esmUtilsHelperMod.RequestOptions
import typings.qiniuJs.esmUtilsHelperMod.ResponseSuccess
import typings.qiniuJs.esmUtilsObservableMod.PartialObserver
import typings.qiniuJs.esmUtilsObservableMod.TeardownLogic
import typings.qiniuJs.esmUtilsPoolMod.RunTask
import typings.std.Blob
import typings.std.File
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsMod {
  
  @JSImport("qiniu-js/esm/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qiniu-js/esm/utils", "MB")
  @js.native
  val MB: Double = js.native
  
  @JSImport("qiniu-js/esm/utils", "Observable")
  @js.native
  open class Observable[T, E, C] protected ()
    extends typings.qiniuJs.esmUtilsObservableMod.Observable[T, E, C] {
    def this(_subscribe: js.Function1[
            /* subscriber */ typings.qiniuJs.esmUtilsObservableMod.Subscriber[T, E, C], 
            TeardownLogic
          ]) = this()
  }
  
  @JSImport("qiniu-js/esm/utils", "Pool")
  @js.native
  open class Pool[T] protected ()
    extends typings.qiniuJs.esmUtilsPoolMod.Pool[T] {
    def this(runTask: RunTask[T], limit: Double) = this()
  }
  
  @JSImport("qiniu-js/esm/utils", "Subscriber")
  @js.native
  open class Subscriber[T, E, C] ()
    extends typings.qiniuJs.esmUtilsObservableMod.Subscriber[T, E, C] {
    def this(observerOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(observerOrNext: PartialObserver[T, E, C]) = this()
    def this(observerOrNext: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ E, Unit]) = this()
    def this(observerOrNext: Null, error: js.Function1[/* err */ E, Unit]) = this()
    def this(observerOrNext: Unit, error: js.Function1[/* err */ E, Unit]) = this()
    def this(observerOrNext: PartialObserver[T, E, C], error: js.Function1[/* err */ E, Unit]) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: Null,
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: Unit,
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(
      observerOrNext: Null,
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(observerOrNext: Null, error: Null, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(observerOrNext: Null, error: Unit, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(
      observerOrNext: Unit,
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(observerOrNext: Unit, error: Null, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(observerOrNext: Unit, error: Unit, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(
      observerOrNext: PartialObserver[T, E, C],
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(observerOrNext: PartialObserver[T, E, C], error: Null, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(observerOrNext: PartialObserver[T, E, C], error: Unit, complete: js.Function1[/* res */ C, Unit]) = this()
  }
  
  inline def compressImage(file: File, options: CompressOptions): js.Promise[CompressResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compressImage")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompressResult]]
  
  inline def computeMd5(data: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMd5")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def createLocalKey(name: String, key: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalKey")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createLocalKey(name: String, key: Null, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalKey")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createLocalKey(name: String, key: Unit, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalKey")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createObjectURL(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createXHR(): XMLHttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createXHR")().asInstanceOf[XMLHttpRequest]
  
  inline def getAuthHeaders(token: String): AuthorizationString = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthHeaders")(token.asInstanceOf[js.Any]).asInstanceOf[AuthorizationString]
  
  inline def getChunks(file: File, blockSize: Double): js.Array[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChunks")(file.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Blob]]
  
  inline def getDomainFromUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromUrl")().asInstanceOf[String]
  inline def getDomainFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHeadersForChunkUpload(token: String): Authorization = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForChunkUpload")(token.asInstanceOf[js.Any]).asInstanceOf[Authorization]
  
  inline def getHeadersForMkFile(token: String): Authorization = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForMkFile")(token.asInstanceOf[js.Any]).asInstanceOf[Authorization]
  
  inline def getLocalFileInfo(localKey: String, logger: default): LocalInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalFileInfo")(localKey.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[LocalInfo | Null]
  
  inline def getPortFromUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortFromUrl")().asInstanceOf[String]
  inline def getPortFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPutPolicy(token: String): PutPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("getPutPolicy")(token.asInstanceOf[js.Any]).asInstanceOf[PutPolicy]
  
  inline def isCustomVarsValid(params: StringDictionary[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomVarsValid")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMetaDataValid(params: StringDictionary[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaDataValid")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeUploadConfig(): InternalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")().asInstanceOf[InternalConfig]
  inline def normalizeUploadConfig(config: Unit, logger: default): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
  inline def normalizeUploadConfig(config: PartialConfig): InternalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")(config.asInstanceOf[js.Any]).asInstanceOf[InternalConfig]
  inline def normalizeUploadConfig(config: PartialConfig, logger: default): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
  
  inline def readAsArrayBuffer(data: Blob): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def removeLocalFileInfo(localKey: String, logger: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLocalFileInfo")(localKey.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def request[T](url: String, options: RequestOptions): js.Promise[ResponseSuccess[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseSuccess[T]]]
  
  inline def setLocalFileInfo(localKey: String, info: LocalInfo, logger: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocalFileInfo")(localKey.asInstanceOf[js.Any], info.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sum(list: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(list.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def urlSafeBase64Decode(v: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Decode")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlSafeBase64Encode(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Encode")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
}
