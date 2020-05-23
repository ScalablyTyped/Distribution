package typings.snykRpmParser.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParserResponse extends js.Object {
  var error: js.UndefOr[ParserError] = js.undefined
  var response: String
  var rpmMetadata: js.UndefOr[IRpmMetadata] = js.undefined
}

object IParserResponse {
  @scala.inline
  def apply(response: String, error: ParserError = null, rpmMetadata: IRpmMetadata = null): IParserResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (rpmMetadata != null) __obj.updateDynamic("rpmMetadata")(rpmMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParserResponse]
  }
}

