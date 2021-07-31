package typings.readConfigFile

import org.scalablytyped.runtime.StringDictionary
import typings.dotenv.mod.DotenvParseOutput
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("read-config-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findAndReadConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAndReadConfig")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadConfigResult[T] | Null]]
  
  @scala.inline
  def getConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadConfigResult[T] | Null]]
  @scala.inline
  def getConfig[T](request: ReadConfigRequest, configPath: String): js.Promise[ReadConfigResult[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(request.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfigResult[T] | Null]]
  
  @scala.inline
  def loadConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadConfigResult[T] | Null]]
  
  @scala.inline
  def loadEnv(envFile: String): js.Promise[DotenvParseOutput | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnv")(envFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DotenvParseOutput | Null]]
  
  @scala.inline
  def loadParentConfig[T](request: ReadConfigRequest, spec: String): js.Promise[ReadConfigResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadParentConfig")(request.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadConfigResult[T]]]
  
  @scala.inline
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("orIfFileNotExist")(promise.asInstanceOf[js.Any], fallbackValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("orNullIfFileNotExist")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  
  trait ReadConfigRequest extends StObject {
    
    var configFilename: String
    
    var packageKey: String
    
    var packageMetadata: (Lazy[StringDictionary[js.Any] | Null]) | Null
    
    var projectDir: String
  }
  object ReadConfigRequest {
    
    @scala.inline
    def apply(configFilename: String, packageKey: String, projectDir: String): ReadConfigRequest = {
      val __obj = js.Dynamic.literal(configFilename = configFilename.asInstanceOf[js.Any], packageKey = packageKey.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], packageMetadata = null)
      __obj.asInstanceOf[ReadConfigRequest]
    }
    
    @scala.inline
    implicit class ReadConfigRequestMutableBuilder[Self <: ReadConfigRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageKey(value: String): Self = StObject.set(x, "packageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageMetadata(value: Lazy[StringDictionary[js.Any] | Null]): Self = StObject.set(x, "packageMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageMetadataNull: Self = StObject.set(x, "packageMetadata", null)
      
      @scala.inline
      def setProjectDir(value: String): Self = StObject.set(x, "projectDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadConfigResult[T] extends StObject {
    
    val configFile: String | Null
    
    val result: T
  }
  object ReadConfigResult {
    
    @scala.inline
    def apply[T](result: T): ReadConfigResult[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], configFile = null)
      __obj.asInstanceOf[ReadConfigResult[T]]
    }
    
    @scala.inline
    implicit class ReadConfigResultMutableBuilder[Self <: ReadConfigResult[?], T] (val x: Self & ReadConfigResult[T]) extends AnyVal {
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileNull: Self = StObject.set(x, "configFile", null)
      
      @scala.inline
      def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
