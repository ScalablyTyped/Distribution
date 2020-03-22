package typings.setCookieParser

import typings.setCookieParser.setCookieParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined set-cookie-parser.set-cookie-parser.Options & {  map ? :false} */
trait Optionsmapfalse extends js.Object {
  var decodeValues: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Boolean with `false`] = js.undefined
}

object Optionsmapfalse {
  @scala.inline
  def apply(
    decodeValues: js.UndefOr[Boolean] = js.undefined,
    map: js.UndefOr[Boolean with `false`] = js.undefined
  ): Optionsmapfalse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeValues)) __obj.updateDynamic("decodeValues")(decodeValues.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsmapfalse]
  }
}

