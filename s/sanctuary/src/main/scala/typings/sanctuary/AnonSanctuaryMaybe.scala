package typings.sanctuary

import typings.sanctuary.sanctuaryStrings.sanctuarySlashMaybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSanctuaryMaybe extends js.Object {
  var `@@type`: sanctuarySlashMaybe
}

object AnonSanctuaryMaybe {
  @scala.inline
  def apply(`@@type`: sanctuarySlashMaybe): AnonSanctuaryMaybe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSanctuaryMaybe]
  }
}

