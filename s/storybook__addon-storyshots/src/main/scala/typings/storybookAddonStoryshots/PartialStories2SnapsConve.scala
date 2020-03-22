package typings.storybookAddonStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots.@storybook/addon-storyshots/dist/Stories2SnapsConverter.Stories2SnapsConverterOptions> */
trait PartialStories2SnapsConve extends js.Object {
  var snapshotExtension: js.UndefOr[String] = js.undefined
  var snapshotsDirName: js.UndefOr[String] = js.undefined
  var storiesExtensions: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialStories2SnapsConve {
  @scala.inline
  def apply(
    snapshotExtension: String = null,
    snapshotsDirName: String = null,
    storiesExtensions: js.Array[String] = null
  ): PartialStories2SnapsConve = {
    val __obj = js.Dynamic.literal()
    if (snapshotExtension != null) __obj.updateDynamic("snapshotExtension")(snapshotExtension.asInstanceOf[js.Any])
    if (snapshotsDirName != null) __obj.updateDynamic("snapshotsDirName")(snapshotsDirName.asInstanceOf[js.Any])
    if (storiesExtensions != null) __obj.updateDynamic("storiesExtensions")(storiesExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStories2SnapsConve]
  }
}

