package typings.resolvePackagePath

import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: String, baseDir: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    target: String,
    baseDir: String,
    _cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], _cache.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(target: String, baseDir: String, _cache: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], _cache.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("resolve-package-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("resolve-package-path", "_CACHE")
  @js.native
  def _CACHE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any = js.native
  inline def _CACHE_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CACHE")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "_FIND_UP_CACHE")
  @js.native
  def _FIND_UP_CACHE: Cache = js.native
  inline def _FIND_UP_CACHE_=(x: Cache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FIND_UP_CACHE")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "findUpPackagePath")
  @js.native
  def findUpPackagePath: js.Function2[/* baseDir */ String, /* _cache */ js.UndefOr[Cache | Boolean], String | Null] = js.native
  inline def findUpPackagePath_=(x: js.Function2[/* baseDir */ String, /* _cache */ js.UndefOr[Cache | Boolean], String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findUpPackagePath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "getRealDirectoryPath")
  @js.native
  def getRealDirectoryPath: js.Function1[/* directoryPath */ String, String | Null] = js.native
  inline def getRealDirectoryPath_=(x: js.Function1[/* directoryPath */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRealDirectoryPath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "getRealFilePath")
  @js.native
  def getRealFilePath: js.Function1[/* filePath */ String, String | Null] = js.native
  inline def getRealFilePath_=(x: js.Function1[/* filePath */ String, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRealFilePath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "_resetCache")
  @js.native
  def resetCache: js.Function0[Unit] = js.native
  
  inline def resetCache_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resetCache")(x.asInstanceOf[js.Any])
}
