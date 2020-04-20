package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionDescriptor extends js.Object {
  var name: PermissionName
}

object PermissionDescriptor {
  @scala.inline
  def apply(name: PermissionName): PermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDescriptor]
  }
}

