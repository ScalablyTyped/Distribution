package typings.setCookieParser.anon

import typings.setCookieParser.setCookieParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined set-cookie-parser.set-cookie-parser.Options & {  map :false | undefined} */
@js.native
trait Optionsmapfalseundefined extends js.Object {
  var decodeValues: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
}

object Optionsmapfalseundefined {
  @scala.inline
  def apply(map: js.UndefOr[Boolean] with js.UndefOr[`false`]): Optionsmapfalseundefined = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsmapfalseundefined]
  }
  @scala.inline
  implicit class OptionsmapfalseundefinedOps[Self <: Optionsmapfalseundefined] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecodeValues(value: Boolean): Self = this.set("decodeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodeValues: Self = this.set("decodeValues", js.undefined)
  }
  
}

