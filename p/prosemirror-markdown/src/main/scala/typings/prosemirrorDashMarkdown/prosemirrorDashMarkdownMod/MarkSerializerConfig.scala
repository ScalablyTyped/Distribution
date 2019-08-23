package typings.prosemirrorDashMarkdown.prosemirrorDashMarkdownMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkSerializerConfig[S /* <: Schema[_, _] */] extends js.Object {
  var close: String | MarkSerializerMethod[S]
  var escape: js.UndefOr[Boolean] = js.undefined
  var expelEnclosingWhitespace: js.UndefOr[Boolean] = js.undefined
  var mixable: js.UndefOr[Boolean] = js.undefined
  var open: String | MarkSerializerMethod[S]
}

object MarkSerializerConfig {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    close: String | MarkSerializerMethod[S],
    open: String | MarkSerializerMethod[S],
    escape: js.UndefOr[Boolean] = js.undefined,
    expelEnclosingWhitespace: js.UndefOr[Boolean] = js.undefined,
    mixable: js.UndefOr[Boolean] = js.undefined
  ): MarkSerializerConfig[S] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (!js.isUndefined(expelEnclosingWhitespace)) __obj.updateDynamic("expelEnclosingWhitespace")(expelEnclosingWhitespace)
    if (!js.isUndefined(mixable)) __obj.updateDynamic("mixable")(mixable)
    __obj.asInstanceOf[MarkSerializerConfig[S]]
  }
}

