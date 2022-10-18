package typings.snyk

import typings.snyk.anon.CustomRulesPath
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.EngineType
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionLocalCacheMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "CUSTOM_POLICY_ENGINE_WASM_PATH")
  @js.native
  val CUSTOM_POLICY_ENGINE_WASM_PATH: String = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "FailedToDownloadRulesError")
  @js.native
  open class FailedToDownloadRulesError () extends CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "FailedToExtractCustomRulesError")
  @js.native
  open class FailedToExtractCustomRulesError protected () extends CustomError {
    def this(path: String) = this()
    def this(path: String, message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "FailedToInitLocalCacheError")
  @js.native
  open class FailedToInitLocalCacheError () extends CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "InvalidCustomRules")
  @js.native
  open class InvalidCustomRules protected () extends CustomError {
    def this(path: String) = this()
    def this(path: String, message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "InvalidCustomRulesPath")
  @js.native
  open class InvalidCustomRulesPath protected () extends CustomError {
    def this(path: String) = this()
    def this(path: String, message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/local-cache", "LOCAL_POLICY_ENGINE_DIR")
  @js.native
  val LOCAL_POLICY_ENGINE_DIR: /* ".iac-data" */ String = js.native
  
  inline def assertNever(value: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def cleanLocalCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanLocalCache")().asInstanceOf[Unit]
  
  inline def getLocalCachePath(engineType: EngineType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalCachePath")(engineType.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def initLocalCache(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocalCache")().asInstanceOf[js.Promise[Unit]]
  inline def initLocalCache(hasCustomRulesPath: CustomRulesPath): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocalCache")(hasCustomRulesPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
