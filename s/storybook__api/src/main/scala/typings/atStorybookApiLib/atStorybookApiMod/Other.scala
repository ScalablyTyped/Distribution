package typings
package atStorybookApiLib.atStorybookApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var customQueryParams: atStorybookApiLib.distModulesUrlMod.QueryParams
}

object Other {
  @scala.inline
  def apply(
    customQueryParams: atStorybookApiLib.distModulesUrlMod.QueryParams,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Other = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Other]
  }
}

