package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  var params: select2Lib.Anon_Data
  var `type`: select2Lib.select2LibStrings.`select2:select`
}

object Trigger {
  @scala.inline
  def apply(params: select2Lib.Anon_Data, `type`: select2Lib.select2LibStrings.`select2:select`): Trigger = {
    val __obj = js.Dynamic.literal(params = params)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Trigger]
  }
}

