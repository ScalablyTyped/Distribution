package typings.readDashPkgDashUp.readDashPkgDashUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedReadResult extends js.Object {
  var `package`: NormalizedPackageJson
  var path: String
}

object NormalizedReadResult {
  @scala.inline
  def apply(`package`: NormalizedPackageJson, path: String): NormalizedReadResult = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[NormalizedReadResult]
  }
}

