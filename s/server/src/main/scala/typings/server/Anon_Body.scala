package typings.server

import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.bodyDashParser.bodyDashParserMod.OptionsText
import typings.bodyDashParser.bodyDashParserMod.OptionsUrlencoded
import typings.express.expressMod.CookieOptions
import typings.server.typingsOptionsMod.DataParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[OptionsUrlencoded] = js.undefined
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var data: js.UndefOr[DataParserOptions] = js.undefined
  var json: js.UndefOr[OptionsJson] = js.undefined
  var text: js.UndefOr[OptionsText] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: OptionsUrlencoded = null,
    cookie: CookieOptions = null,
    data: DataParserOptions = null,
    json: OptionsJson = null,
    text: OptionsText = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

