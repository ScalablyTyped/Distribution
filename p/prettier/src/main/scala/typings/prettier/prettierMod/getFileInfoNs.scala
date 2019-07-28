package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "getFileInfo")
@js.native
object getFileInfoNs extends js.Object {
  def sync(filePath: String): FileInfoResult = js.native
  def sync(filePath: String, options: FileInfoOptions): FileInfoResult = js.native
}

