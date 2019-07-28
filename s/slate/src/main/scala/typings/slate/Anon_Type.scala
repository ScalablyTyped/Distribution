package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: String | (js.Function1[/* type */ String, Boolean])
}

object Anon_Type {
  @scala.inline
  def apply(`type`: String | (js.Function1[/* type */ String, Boolean])): Anon_Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

