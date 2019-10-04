package typings.readDashPkgDashUp.readDashPkgDashUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedReadResult extends js.Object {
  var packageJson: NormalizedPackageJson
  var path: String
}

object NormalizedReadResult {
  @scala.inline
  def apply(packageJson: NormalizedPackageJson, path: String): NormalizedReadResult = {
    val __obj = js.Dynamic.literal(packageJson = packageJson, path = path)
  
    __obj.asInstanceOf[NormalizedReadResult]
  }
}

