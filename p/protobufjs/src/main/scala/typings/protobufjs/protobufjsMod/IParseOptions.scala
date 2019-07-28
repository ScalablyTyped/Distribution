package typings.protobufjs.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParseOptions extends js.Object {
  /** Recognize double-slash comments in addition to doc-block comments. */
  var alternateCommentMode: js.UndefOr[Boolean] = js.undefined
  /** Keeps field casing instead of converting to camel case */
  var keepCase: js.UndefOr[Boolean] = js.undefined
}

object IParseOptions {
  @scala.inline
  def apply(
    alternateCommentMode: js.UndefOr[Boolean] = js.undefined,
    keepCase: js.UndefOr[Boolean] = js.undefined
  ): IParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternateCommentMode)) __obj.updateDynamic("alternateCommentMode")(alternateCommentMode)
    if (!js.isUndefined(keepCase)) __obj.updateDynamic("keepCase")(keepCase)
    __obj.asInstanceOf[IParseOptions]
  }
}

