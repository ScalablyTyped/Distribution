package typings.select2.mod

import typings.select2.anon.Data
import typings.select2.select2Strings.select2Colonselect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  var params: Data
  var `type`: select2Colonselect
}

object Trigger {
  @scala.inline
  def apply(params: Data, `type`: select2Colonselect): Trigger = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}

