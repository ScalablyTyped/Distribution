package typings.resolvePackagePath.resolvePackagePathMod

import typings.std.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("resolve-package-path/lib/resolve-package-path", "_getRealFilePath")
@js.native
object getRealFilePath extends js.Object {
  
  def apply(realFilePathCache: Cache, filePath: String): String | Null = js.native
}
