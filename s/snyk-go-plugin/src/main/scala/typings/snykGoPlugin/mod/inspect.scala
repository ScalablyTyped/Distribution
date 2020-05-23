package typings.snykGoPlugin.mod

import typings.snykGoPlugin.anon.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-plugin", "inspect")
@js.native
object inspect extends js.Object {
  def apply(root: js.Any, targetFile: js.Any): js.Promise[Package] = js.native
  def apply(root: js.Any, targetFile: js.Any, options: Options): js.Promise[Package] = js.native
}

