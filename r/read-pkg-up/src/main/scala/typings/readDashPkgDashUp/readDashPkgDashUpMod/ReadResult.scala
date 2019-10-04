package typings.readDashPkgDashUp.readDashPkgDashUpMod

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
    val __obj = js.Dynamic.literal(packageJson = packageJson, path = path)
  
    __obj.asInstanceOf[ReadResult]
  }
}

