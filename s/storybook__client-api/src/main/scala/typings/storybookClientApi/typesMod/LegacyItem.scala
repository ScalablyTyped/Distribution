package typings.storybookClientApi.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookClientApi.anon.StoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyItem extends js.Object {
  var fileName: String = js.native
  var index: Double = js.native
  var kind: String = js.native
  var revision: js.UndefOr[Double] = js.native
  var selection: js.UndefOr[StoryId] = js.native
  var stories: StringDictionary[js.Any] = js.native
}

object LegacyItem {
  @scala.inline
  def apply(fileName: String, index: Double, kind: String, stories: StringDictionary[js.Any]): LegacyItem = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyItem]
  }
  @scala.inline
  implicit class LegacyItemOps[Self <: LegacyItem] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStories(value: StringDictionary[js.Any]): Self = this.set("stories", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setSelection(value: StoryId): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
  
}

