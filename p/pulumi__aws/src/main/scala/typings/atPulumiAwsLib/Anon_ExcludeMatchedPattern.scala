package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeMatchedPattern extends js.Object {
  var excludeMatchedPattern: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: java.lang.String
  var `type`: java.lang.String
}

object Anon_ExcludeMatchedPattern {
  @scala.inline
  def apply(
    pattern: java.lang.String,
    `type`: java.lang.String,
    excludeMatchedPattern: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ExcludeMatchedPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(excludeMatchedPattern)) __obj.updateDynamic("excludeMatchedPattern")(excludeMatchedPattern)
    __obj.asInstanceOf[Anon_ExcludeMatchedPattern]
  }
}

