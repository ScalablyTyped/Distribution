package typings.storybookCoreCommon

import typings.storybookCoreCommon.anon.Files
import typings.storybookCoreCommon.anon.Path
import typings.storybookCoreCommon.anon.Paths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileCacheMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/file-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/file-cache", "FileSystemCache")
  @js.native
  open class FileSystemCache protected () extends StObject {
    def this(options: Options) = this()
    
    def clear(): js.Promise[Unit] = js.native
    
    def ensureBasePath(): js.Promise[Unit] = js.native
    
    def fileExists(key: String): js.Promise[Boolean] = js.native
    
    def get(key: String): js.Promise[Any] = js.native
    def get(key: String, defaultValue: Any): js.Promise[Any] = js.native
    
    def getSync(key: String): Any = js.native
    def getSync(key: String, defaultValue: Any): Any = js.native
    
    /* private */ var internal: Any = js.native
    
    def load(): js.Promise[Files] = js.native
    
    def path(key: String): String = js.native
    
    def remove(key: String): js.Promise[Unit] = js.native
    
    def save(): js.Promise[Paths] = js.native
    
    def set(key: String, value: Any): js.Promise[Path] = js.native
    
    def setSync(key: String, value: Any): this.type = js.native
  }
  
  inline def createFileSystemCache(options: Options): FileSystemCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemCache")(options.asInstanceOf[js.Any]).asInstanceOf[FileSystemCache]
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var ns: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setNs(value: String | js.Array[String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setNsVarargs(value: String*): Self = StObject.set(x, "ns", js.Array(value*))
    }
  }
}
