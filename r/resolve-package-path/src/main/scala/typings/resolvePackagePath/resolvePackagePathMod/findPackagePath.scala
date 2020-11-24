package typings.resolvePackagePath.resolvePackagePathMod

import typings.std.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("resolve-package-path/lib/resolve-package-path", "_findPackagePath")
@js.native
object findPackagePath extends js.Object {
  
  def apply(realFilePathCache: Cache, name: String, dir: String): String | Null = js.native
}
