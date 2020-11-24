package typings.resolvePackagePath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("resolve-package-path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(target: String, basedir: String): String | Null = js.native
  def apply(
    target: String,
    basedir: String,
    _cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any
  ): String | Null = js.native
  def apply(target: String, basedir: String, _cache: Boolean): String | Null = js.native
  
  var _CACHE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheGroup */ js.Any = js.native
  
  var getRealDirectoryPath: js.Function1[/* directoryhPath */ String, js.Any] = js.native
  
  var getRealFilePath: js.Function1[/* filePath */ String, js.Any] = js.native
  
  @JSName("_resetCache")
  var resetCache: js.Function0[Unit] = js.native
}
