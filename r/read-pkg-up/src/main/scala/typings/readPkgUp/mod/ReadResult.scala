package typings.readPkgUp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadResult extends js.Object {
  var packageJson: PackageJson
  var path: String
}

object ReadResult {
  @scala.inline
  def apply(packageJson: PackageJson, path: String): ReadResult = {
    val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResult]
  }
}

