package typings.server.anon

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsText
import typings.bodyParser.mod.OptionsUrlencoded
import typings.express.mod.CookieOptions
import typings.server.optionsMod.DataParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.UndefOr[OptionsUrlencoded] = js.undefined
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var data: js.UndefOr[DataParserOptions] = js.undefined
  var json: js.UndefOr[OptionsJson] = js.undefined
  var text: js.UndefOr[OptionsText] = js.undefined
}

object Body {
  @scala.inline
  def apply(
    body: OptionsUrlencoded = null,
    cookie: CookieOptions = null,
    data: DataParserOptions = null,
    json: OptionsJson = null,
    text: OptionsText = null
  ): Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

