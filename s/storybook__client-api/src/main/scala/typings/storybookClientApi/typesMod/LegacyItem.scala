package typings.storybookClientApi.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookClientApi.AnonStoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyItem extends js.Object {
  var fileName: String
  var index: Double
  var kind: String
  var revision: js.UndefOr[Double] = js.undefined
  var selection: js.UndefOr[AnonStoryId] = js.undefined
  var stories: StringDictionary[js.Any]
}

object LegacyItem {
  @scala.inline
  def apply(
    fileName: String,
    index: Double,
    kind: String,
    stories: StringDictionary[js.Any],
    revision: Int | Double = null,
    selection: AnonStoryId = null
  ): LegacyItem = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyItem]
  }
}

