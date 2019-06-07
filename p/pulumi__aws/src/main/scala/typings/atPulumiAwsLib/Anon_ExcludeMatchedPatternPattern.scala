package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeMatchedPatternPattern extends js.Object {
  var excludeMatchedPattern: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var pattern: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ExcludeMatchedPatternPattern {
  @scala.inline
  def apply(
    pattern: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    excludeMatchedPattern: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_ExcludeMatchedPatternPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (excludeMatchedPattern != null) __obj.updateDynamic("excludeMatchedPattern")(excludeMatchedPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeMatchedPatternPattern]
  }
}

