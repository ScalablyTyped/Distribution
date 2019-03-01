package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathType extends js.Object {
  var path: java.lang.String
  var `type`: java.lang.String
}

object Anon_PathType {
  @scala.inline
  def apply(path: java.lang.String, `type`: java.lang.String): Anon_PathType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_PathType]
  }
}

