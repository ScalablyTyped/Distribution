package typings.select2.select2Mod

import typings.select2.Anon_Data
import typings.select2.select2Strings.`select2:select`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  var params: Anon_Data
  var `type`: `select2:select`
}

object Trigger {
  @scala.inline
  def apply(params: Anon_Data, `type`: `select2:select`): Trigger = {
    val __obj = js.Dynamic.literal(params = params)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Trigger]
  }
}

