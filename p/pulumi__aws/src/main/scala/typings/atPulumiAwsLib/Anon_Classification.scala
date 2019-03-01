package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classification extends js.Object {
  var classification: java.lang.String
  var customPatterns: js.UndefOr[java.lang.String] = js.undefined
  var grokPattern: java.lang.String
}

object Anon_Classification {
  @scala.inline
  def apply(
    classification: java.lang.String,
    grokPattern: java.lang.String,
    customPatterns: java.lang.String = null
  ): Anon_Classification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classification")(classification)
    __obj.updateDynamic("grokPattern")(grokPattern)
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns)
    __obj.asInstanceOf[Anon_Classification]
  }
}

