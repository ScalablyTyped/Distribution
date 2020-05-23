package typings.snykPhpPlugin

import typings.snykComposerLockfileParser.typesMod.SystemPackages
import typings.snykPhpPlugin.typesMod.PhpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-php-plugin/dist/system-deps", JSImport.Namespace)
@js.native
object systemDepsMod extends js.Object {
  def systemDeps(basePath: String, options: PhpOptions): SystemPackages = js.native
}

