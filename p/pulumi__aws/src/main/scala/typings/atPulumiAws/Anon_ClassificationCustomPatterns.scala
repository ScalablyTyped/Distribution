package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassificationCustomPatterns extends js.Object {
  var classification: Input[String]
  var customPatterns: js.UndefOr[Input[String]] = js.undefined
  var grokPattern: Input[String]
}

object Anon_ClassificationCustomPatterns {
  @scala.inline
  def apply(classification: Input[String], grokPattern: Input[String], customPatterns: Input[String] = null): Anon_ClassificationCustomPatterns = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassificationCustomPatterns]
  }
}

