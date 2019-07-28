package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslatableExposed extends js.Object {
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]] = js.undefined
}

object TranslatableExposed {
  @scala.inline
  def apply(translations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])] = null): TranslatableExposed = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[TranslatableExposed]
  }
}

