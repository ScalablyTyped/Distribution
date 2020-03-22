package typings.sanctuary

import typings.sanctuary.sanctuaryStrings.sanctuarySlashMaybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `@@type`: sanctuarySlashMaybe
}

object AnonType {
  @scala.inline
  def apply(`@@type`: sanctuarySlashMaybe): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

