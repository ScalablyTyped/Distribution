package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded] = js.undefined
  var cookie: js.UndefOr[expressLib.expressMod.CookieOptions] = js.undefined
  var data: js.UndefOr[serverLib.typingsOptionsMod.DataParserOptions] = js.undefined
  var json: js.UndefOr[bodyDashParserLib.bodyDashParserMod.OptionsJson] = js.undefined
  var text: js.UndefOr[bodyDashParserLib.bodyDashParserMod.OptionsText] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded = null,
    cookie: expressLib.expressMod.CookieOptions = null,
    data: serverLib.typingsOptionsMod.DataParserOptions = null,
    json: bodyDashParserLib.bodyDashParserMod.OptionsJson = null,
    text: bodyDashParserLib.bodyDashParserMod.OptionsText = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (data != null) __obj.updateDynamic("data")(data)
    if (json != null) __obj.updateDynamic("json")(json)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Body]
  }
}

