package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.LocationState
import typings.reachRouter.mod.WindowLocation
import typings.storybookApi.storybookApiStrings.info
import typings.storybookApi.storybookApiStrings.settings
import typings.storybookApi.storybookApiStrings.story
import typings.storybookApi.urlMod.Additions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var customQueryParams: StringDictionary[js.Any]
  var layout: Additions
  var location: WindowLocation[LocationState]
  var path: String
  var selectedPanel: js.Any
  var storyId: String
  var viewMode: story | info | settings
}

object Location {
  @scala.inline
  def apply(
    customQueryParams: StringDictionary[js.Any],
    layout: Additions,
    location: WindowLocation[LocationState],
    path: String,
    selectedPanel: js.Any,
    storyId: String,
    viewMode: story | info | settings
  ): Location = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

