package typings.rest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var param: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, param: String = null, prefix: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (param != null) __obj.updateDynamic("param")(param)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Name]
  }
}

