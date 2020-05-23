package typings.snykPhpPlugin

import typings.snykPhpPlugin.typesMod.PhpOptions
import typings.snykPhpPlugin.typesMod.PhpPluginResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-php-plugin/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def inspect(basePath: String, fileName: String): js.Promise[PhpPluginResult] = js.native
  def inspect(basePath: String, fileName: String, options: PhpOptions): js.Promise[PhpPluginResult] = js.native
}

