package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classification extends js.Object {
  var classification: String
  var customPatterns: js.UndefOr[String] = js.undefined
  var grokPattern: String
}

object Anon_Classification {
  @scala.inline
  def apply(classification: String, grokPattern: String, customPatterns: String = null): Anon_Classification = {
    val __obj = js.Dynamic.literal(classification = classification, grokPattern = grokPattern)
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns)
    __obj.asInstanceOf[Anon_Classification]
  }
}

