package typings.sentiment.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sentiment.anon.Apply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageModule extends js.Object {
  var labels: StringDictionary[Double]
  var scoringStrategy: js.UndefOr[Apply] = js.undefined
}

object LanguageModule {
  @scala.inline
  def apply(labels: StringDictionary[Double], scoringStrategy: Apply = null): LanguageModule = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    if (scoringStrategy != null) __obj.updateDynamic("scoringStrategy")(scoringStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageModule]
  }
}

