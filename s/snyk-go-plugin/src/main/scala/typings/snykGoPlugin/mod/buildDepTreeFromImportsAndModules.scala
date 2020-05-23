package typings.snykGoPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-plugin", "buildDepTreeFromImportsAndModules")
@js.native
object buildDepTreeFromImportsAndModules extends js.Object {
  def apply(): js.Promise[DepTree] = js.native
  def apply(root: String): js.Promise[DepTree] = js.native
  def apply(root: String, targetFile: String): js.Promise[DepTree] = js.native
}

