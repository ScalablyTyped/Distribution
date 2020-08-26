package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots.@storybook/addon-storyshots/dist/Stories2SnapsConverter.Stories2SnapsConverterOptions> */
@js.native
trait PartialStories2SnapsConve extends js.Object {
  var snapshotExtension: js.UndefOr[String] = js.native
  var snapshotsDirName: js.UndefOr[String] = js.native
  var storiesExtensions: js.UndefOr[js.Array[String]] = js.native
}

object PartialStories2SnapsConve {
  @scala.inline
  def apply(): PartialStories2SnapsConve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStories2SnapsConve]
  }
  @scala.inline
  implicit class PartialStories2SnapsConveOps[Self <: PartialStories2SnapsConve] (val x: Self) extends AnyVal {
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
    def setSnapshotExtension(value: String): Self = this.set("snapshotExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotExtension: Self = this.set("snapshotExtension", js.undefined)
    @scala.inline
    def setSnapshotsDirName(value: String): Self = this.set("snapshotsDirName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotsDirName: Self = this.set("snapshotsDirName", js.undefined)
    @scala.inline
    def setStoriesExtensionsVarargs(value: String*): Self = this.set("storiesExtensions", js.Array(value :_*))
    @scala.inline
    def setStoriesExtensions(value: js.Array[String]): Self = this.set("storiesExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoriesExtensions: Self = this.set("storiesExtensions", js.undefined)
  }
  
}

