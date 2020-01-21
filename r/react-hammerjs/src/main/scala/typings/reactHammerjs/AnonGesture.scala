package typings.reactHammerjs

import org.scalablytyped.runtime.StringDictionary
import typings.hammerjs.RecognizerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGesture extends js.Object {
  var recognizers: js.UndefOr[StringDictionary[RecognizerOptions]] = js.undefined
}

object AnonGesture {
  @scala.inline
  def apply(recognizers: StringDictionary[RecognizerOptions] = null): AnonGesture = {
    val __obj = js.Dynamic.literal()
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGesture]
  }
}

