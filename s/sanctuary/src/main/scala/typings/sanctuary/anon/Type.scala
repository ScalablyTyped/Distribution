package typings.sanctuary.anon

import typings.sanctuary.sanctuaryStrings.sanctuarySlashMaybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `@@type`: sanctuarySlashMaybe
}

object Type {
  @scala.inline
  def apply(`@@type`: sanctuarySlashMaybe): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

