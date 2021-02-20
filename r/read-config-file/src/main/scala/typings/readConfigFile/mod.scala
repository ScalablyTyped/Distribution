package typings.readConfigFile

import org.scalablytyped.runtime.StringDictionary
import typings.dotenv.mod.DotenvParseOutput
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("read-config-file", "findAndReadConfig")
  @js.native
  def findAndReadConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  
  @JSImport("read-config-file", "getConfig")
  @js.native
  def getConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  @JSImport("read-config-file", "getConfig")
  @js.native
  def getConfig[T](request: ReadConfigRequest, configPath: String): js.Promise[ReadConfigResult[T] | Null] = js.native
  
  @JSImport("read-config-file", "loadConfig")
  @js.native
  def loadConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  
  @JSImport("read-config-file", "loadEnv")
  @js.native
  def loadEnv(envFile: String): js.Promise[DotenvParseOutput | Null] = js.native
  
  @JSImport("read-config-file", "loadParentConfig")
  @js.native
  def loadParentConfig[T](request: ReadConfigRequest, spec: String): js.Promise[ReadConfigResult[T]] = js.native
  
  @JSImport("read-config-file", "orIfFileNotExist")
  @js.native
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = js.native
  
  @JSImport("read-config-file", "orNullIfFileNotExist")
  @js.native
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = js.native
  
  @js.native
  trait ReadConfigRequest extends StObject {
    
    var configFilename: String = js.native
    
    var packageKey: String = js.native
    
    var packageMetadata: (Lazy[StringDictionary[_] | Null]) | Null = js.native
    
    var projectDir: String = js.native
  }
  object ReadConfigRequest {
    
    @scala.inline
    def apply(configFilename: String, packageKey: String, projectDir: String): ReadConfigRequest = {
      val __obj = js.Dynamic.literal(configFilename = configFilename.asInstanceOf[js.Any], packageKey = packageKey.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadConfigRequest]
    }
    
    @scala.inline
    implicit class ReadConfigRequestMutableBuilder[Self <: ReadConfigRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageKey(value: String): Self = StObject.set(x, "packageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageMetadata(value: Lazy[StringDictionary[_] | Null]): Self = StObject.set(x, "packageMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageMetadataNull: Self = StObject.set(x, "packageMetadata", null)
      
      @scala.inline
      def setProjectDir(value: String): Self = StObject.set(x, "projectDir", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadConfigResult[T] extends StObject {
    
    val configFile: String | Null = js.native
    
    val result: T = js.native
  }
  object ReadConfigResult {
    
    @scala.inline
    def apply[T](result: T): ReadConfigResult[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadConfigResult[T]]
    }
    
    @scala.inline
    implicit class ReadConfigResultMutableBuilder[Self <: ReadConfigResult[_], T] (val x: Self with ReadConfigResult[T]) extends AnyVal {
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileNull: Self = StObject.set(x, "configFile", null)
      
      @scala.inline
      def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
