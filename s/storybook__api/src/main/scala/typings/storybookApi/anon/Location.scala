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

@js.native
trait Location extends js.Object {
  var customQueryParams: StringDictionary[js.Any] = js.native
  var layout: Additions = js.native
  var location: WindowLocation[LocationState] = js.native
  var path: String = js.native
  var selectedPanel: js.Any = js.native
  var storyId: String = js.native
  var viewMode: story | info | settings = js.native
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
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomQueryParams(value: StringDictionary[js.Any]): Self = this.set("customQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: Additions): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedPanel(value: js.Any): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMode(value: story | info | settings): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
  
}

