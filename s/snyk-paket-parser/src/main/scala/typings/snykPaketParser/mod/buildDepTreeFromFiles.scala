package typings.snykPaketParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-paket-parser", "buildDepTreeFromFiles")
@js.native
object buildDepTreeFromFiles extends js.Object {
  def apply(root: String, manifestFilePath: String, lockFilePath: String): js.Promise[DepTree] = js.native
  def apply(root: String, manifestFilePath: String, lockFilePath: String, includeDev: Boolean): js.Promise[DepTree] = js.native
  def apply(root: String, manifestFilePath: String, lockFilePath: String, includeDev: Boolean, strict: Boolean): js.Promise[DepTree] = js.native
}

