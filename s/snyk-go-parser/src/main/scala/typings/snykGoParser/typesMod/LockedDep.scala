package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockedDep extends js.Object {
  var name: String
  var version: String
}

object LockedDep {
  @scala.inline
  def apply(name: String, version: String): LockedDep = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockedDep]
  }
}

