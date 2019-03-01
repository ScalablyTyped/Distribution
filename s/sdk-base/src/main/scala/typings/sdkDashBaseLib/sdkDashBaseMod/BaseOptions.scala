package typings
package sdkDashBaseLib.sdkDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var initMethod: js.UndefOr[java.lang.String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    initMethod: java.lang.String = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (initMethod != null) __obj.updateDynamic("initMethod")(initMethod)
    __obj.asInstanceOf[BaseOptions]
  }
}

