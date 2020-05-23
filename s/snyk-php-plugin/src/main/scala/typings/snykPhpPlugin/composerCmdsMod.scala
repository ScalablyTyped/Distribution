package typings.snykPhpPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-php-plugin/dist/composer-cmds", JSImport.Namespace)
@js.native
object composerCmdsMod extends js.Object {
  val composerCmd: /* "composer --version" */ String = js.native
  val composerShowCmd: /* "composer show -p" */ String = js.native
  val pharCmd: String = js.native
  def cmdReturnsOk(cmd: js.Any): Boolean = js.native
  def execWithResult(cmd: js.Any, basePath: js.Any): String = js.native
}

