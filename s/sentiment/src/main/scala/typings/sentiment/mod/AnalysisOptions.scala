package typings.sentiment.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalysisOptions extends js.Object {
  var extras: js.UndefOr[StringDictionary[Double]] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object AnalysisOptions {
  @scala.inline
  def apply(extras: StringDictionary[Double] = null, language: String = null): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisOptions]
  }
}

