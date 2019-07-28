package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeMatchedPatternPattern extends js.Object {
  var excludeMatchedPattern: js.UndefOr[Input[Boolean]] = js.undefined
  var pattern: Input[String]
  var `type`: Input[String]
}

object Anon_ExcludeMatchedPatternPattern {
  @scala.inline
  def apply(pattern: Input[String], `type`: Input[String], excludeMatchedPattern: Input[Boolean] = null): Anon_ExcludeMatchedPatternPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (excludeMatchedPattern != null) __obj.updateDynamic("excludeMatchedPattern")(excludeMatchedPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeMatchedPatternPattern]
  }
}

