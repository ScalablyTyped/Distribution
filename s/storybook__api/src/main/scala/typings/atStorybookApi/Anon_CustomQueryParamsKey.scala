package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.atReachRouter.atReachRouterMod.WindowLocation
import typings.atStorybookApi.distModulesUrlMod.Additions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomQueryParamsKey extends js.Object {
  var customQueryParams: StringDictionary[js.Any]
  var layout: Additions
  var location: WindowLocation
  var path: String
  var selectedPanel: js.Any
}

object Anon_CustomQueryParamsKey {
  @scala.inline
  def apply(
    customQueryParams: StringDictionary[js.Any],
    layout: Additions,
    location: WindowLocation,
    path: String,
    selectedPanel: js.Any
  ): Anon_CustomQueryParamsKey = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams, layout = layout, location = location, path = path, selectedPanel = selectedPanel)
  
    __obj.asInstanceOf[Anon_CustomQueryParamsKey]
  }
}

