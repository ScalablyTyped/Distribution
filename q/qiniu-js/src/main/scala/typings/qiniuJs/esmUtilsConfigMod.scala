package typings.qiniuJs

import typings.qiniuJs.anon.PartialConfig
import typings.qiniuJs.esmLoggerMod.default
import typings.qiniuJs.esmUploadBaseMod.InternalConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsConfigMod {
  
  @JSImport("qiniu-js/esm/utils/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeUploadConfig(): InternalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")().asInstanceOf[InternalConfig]
  inline def normalizeUploadConfig(config: Unit, logger: default): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
  inline def normalizeUploadConfig(config: PartialConfig): InternalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")(config.asInstanceOf[js.Any]).asInstanceOf[InternalConfig]
  inline def normalizeUploadConfig(config: PartialConfig, logger: default): InternalConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUploadConfig")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[InternalConfig]
}
