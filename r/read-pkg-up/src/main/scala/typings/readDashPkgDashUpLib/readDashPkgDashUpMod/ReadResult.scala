package typings
package readDashPkgDashUpLib.readDashPkgDashUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadResult extends js.Object {
  var `package`: PackageJson
  var path: java.lang.String
}

object ReadResult {
  @scala.inline
  def apply(`package`: PackageJson, path: java.lang.String): ReadResult = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[ReadResult]
  }
}

