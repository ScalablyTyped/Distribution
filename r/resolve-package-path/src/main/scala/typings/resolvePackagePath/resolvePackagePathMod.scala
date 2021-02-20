package typings.resolvePackagePath

import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolvePackagePathMod {
  
  @JSImport("resolve-package-path/lib/resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any
  ): String | Null = js.native
  @JSImport("resolve-package-path/lib/resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any,
    name: js.UndefOr[scala.Nothing],
    dir: String
  ): String | Null = js.native
  @JSImport("resolve-package-path/lib/resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any,
    name: String
  ): String | Null = js.native
  @JSImport("resolve-package-path/lib/resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any,
    name: String,
    dir: String
  ): String | Null = js.native
  
  @JSImport("resolve-package-path/lib/resolve-package-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_findPackagePath")
  @js.native
  def findPackagePath: js.Function3[/* realFilePathCache */ Cache, /* name */ String, /* dir */ String, String | Null] = js.native
  
  @scala.inline
  def findPackagePath_=(x: js.Function3[/* realFilePathCache */ Cache, /* name */ String, /* dir */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_findPackagePath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_getRealDirectoryPath")
  @js.native
  def getRealDirectoryPath: js.Function2[/* realDirectoryPathCache */ Cache, /* directoryPath */ String, String | Null] = js.native
  
  @scala.inline
  def getRealDirectoryPath_=(x: js.Function2[/* realDirectoryPathCache */ Cache, /* directoryPath */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getRealDirectoryPath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_getRealFilePath")
  @js.native
  def getRealFilePath: js.Function2[/* realFilePathCache */ Cache, /* filePath */ String, String | Null] = js.native
  
  @scala.inline
  def getRealFilePath_=(x: js.Function2[/* realFilePathCache */ Cache, /* filePath */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getRealFilePath")(x.asInstanceOf[js.Any])
}
