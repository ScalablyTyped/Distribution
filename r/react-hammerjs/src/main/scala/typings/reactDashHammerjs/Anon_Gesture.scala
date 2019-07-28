package typings.reactDashHammerjs

import org.scalablytyped.runtime.StringDictionary
import typings.hammerjs.RecognizerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gesture extends js.Object {
  var recognizers: js.UndefOr[StringDictionary[RecognizerOptions]] = js.undefined
}

object Anon_Gesture {
  @scala.inline
  def apply(recognizers: StringDictionary[RecognizerOptions] = null): Anon_Gesture = {
    val __obj = js.Dynamic.literal()
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers)
    __obj.asInstanceOf[Anon_Gesture]
  }
}

