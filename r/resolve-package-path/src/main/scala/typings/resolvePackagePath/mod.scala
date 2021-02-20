package typings.resolvePackagePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(target: String, basedir: String): String | Null = js.native
  @JSImport("resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(
    target: String,
    basedir: String,
    _cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any
  ): String | Null = js.native
  @JSImport("resolve-package-path", JSImport.Namespace)
  @js.native
  def apply(target: String, basedir: String, _cache: Boolean): String | Null = js.native
  
  @JSImport("resolve-package-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("resolve-package-path", "_CACHE")
  @js.native
  def _CACHE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any = js.native
  @scala.inline
  def _CACHE_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CACHE")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "getRealDirectoryPath")
  @js.native
  def getRealDirectoryPath: js.Function1[/* directoryhPath */ String, js.Any] = js.native
  @scala.inline
  def getRealDirectoryPath_=(x: js.Function1[/* directoryhPath */ String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRealDirectoryPath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "getRealFilePath")
  @js.native
  def getRealFilePath: js.Function1[/* filePath */ String, js.Any] = js.native
  @scala.inline
  def getRealFilePath_=(x: js.Function1[/* filePath */ String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRealFilePath")(x.asInstanceOf[js.Any])
  
  @JSImport("resolve-package-path", "_resetCache")
  @js.native
  def resetCache: js.Function0[Unit] = js.native
  
  @scala.inline
  def resetCache_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resetCache")(x.asInstanceOf[js.Any])
}
