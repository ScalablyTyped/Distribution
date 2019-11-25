package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.atReachRouter.atReachRouterMod.WindowLocation
import typings.atStorybookApi.atStorybookApiStrings.info
import typings.atStorybookApi.atStorybookApiStrings.settings
import typings.atStorybookApi.atStorybookApiStrings.story
import typings.atStorybookApi.distModulesUrlMod.Additions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomQueryParamsInfo extends js.Object {
  var customQueryParams: StringDictionary[js.Any]
  var layout: Additions
  var location: WindowLocation
  var path: String
  var selectedPanel: js.Any
  var storyId: String
  var viewMode: story | info | settings
}

object Anon_CustomQueryParamsInfo {
  @scala.inline
  def apply(
    customQueryParams: StringDictionary[js.Any],
    layout: Additions,
    location: WindowLocation,
    path: String,
    selectedPanel: js.Any,
    storyId: String,
    viewMode: story | info | settings
  ): Anon_CustomQueryParamsInfo = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CustomQueryParamsInfo]
  }
}

