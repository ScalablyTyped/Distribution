package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslatableExposed extends js.Object {
  var translations: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])]
  ] = js.undefined
}

object TranslatableExposed {
  @scala.inline
  def apply(
    translations: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])] = null
  ): TranslatableExposed = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[TranslatableExposed]
  }
}

