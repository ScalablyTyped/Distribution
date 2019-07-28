package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeMatchedPattern extends js.Object {
  var excludeMatchedPattern: js.UndefOr[Boolean] = js.undefined
  var pattern: String
  var `type`: String
}

object Anon_ExcludeMatchedPattern {
  @scala.inline
  def apply(pattern: String, `type`: String, excludeMatchedPattern: js.UndefOr[Boolean] = js.undefined): Anon_ExcludeMatchedPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(excludeMatchedPattern)) __obj.updateDynamic("excludeMatchedPattern")(excludeMatchedPattern)
    __obj.asInstanceOf[Anon_ExcludeMatchedPattern]
  }
}

