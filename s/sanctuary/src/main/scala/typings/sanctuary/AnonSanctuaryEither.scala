package typings.sanctuary

import typings.sanctuary.sanctuaryStrings.sanctuarySlashEither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSanctuaryEither extends js.Object {
  var `@@type`: sanctuarySlashEither
}

object AnonSanctuaryEither {
  @scala.inline
  def apply(`@@type`: sanctuarySlashEither): AnonSanctuaryEither = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSanctuaryEither]
  }
}

