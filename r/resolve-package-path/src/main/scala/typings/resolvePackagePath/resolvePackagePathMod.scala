package typings.resolvePackagePath

import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolvePackagePathMod {
  
  inline def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any
  ): String | Null = ^.asInstanceOf[js.Dynamic].apply(caches.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any,
    name: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(caches.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any,
    name: String,
    dir: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(caches.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    caches: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any,
    name: Unit,
    dir: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(caches.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("resolve-package-path/lib/resolve-package-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_findPackagePath")
  @js.native
  def findPackagePath: js.Function3[/* realFilePathCache */ Cache, /* name */ String, /* dir */ String, String | Null] = js.native
  
  inline def findPackagePath_=(x: js.Function3[/* realFilePathCache */ Cache, /* name */ String, /* dir */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_findPackagePath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_findUpPackagePath")
  @js.native
  def findUpPackagePath: js.Function2[/* findUpCache */ Cache, /* initialSearchDir */ String, String | Null] = js.native
  
  inline def findUpPackagePath_=(x: js.Function2[/* findUpCache */ Cache, /* initialSearchDir */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_findUpPackagePath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_getRealDirectoryPath")
  @js.native
  def getRealDirectoryPath: js.Function2[/* realDirectoryPathCache */ Cache, /* directoryPath */ String, String | Null] = js.native
  
  inline def getRealDirectoryPath_=(x: js.Function2[/* realDirectoryPathCache */ Cache, /* directoryPath */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getRealDirectoryPath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path/lib/resolve-package-path", "_getRealFilePath")
  @js.native
  def getRealFilePath: js.Function2[/* realFilePathCache */ Cache, /* filePath */ String, String | Null] = js.native
  
  inline def getRealFilePath_=(x: js.Function2[/* realFilePathCache */ Cache, /* filePath */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getRealFilePath")(x.asInstanceOf[js.Any])
}
