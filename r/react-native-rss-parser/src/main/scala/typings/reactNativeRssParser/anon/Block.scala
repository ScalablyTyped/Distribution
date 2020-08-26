package typings.reactNativeRssParser.anon

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var authors: js.Array[Name] = js.native
  var block: Maybe[String] = js.native
  var categories: js.Array[SubCategories] = js.native
  var complete: Maybe[String] = js.native
  var explicit: String = js.native
  var image: String = js.native
  var newFeedUrl: Maybe[String] = js.native
  var owner: Email = js.native
  var subtitle: Maybe[String] = js.native
  var summary: String = js.native
}

object Block {
  @scala.inline
  def apply(
    authors: js.Array[Name],
    categories: js.Array[SubCategories],
    explicit: String,
    image: String,
    owner: Email,
    summary: String
  ): Block = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setAuthorsVarargs(value: Name*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: js.Array[Name]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: SubCategories*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[SubCategories]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setExplicit(value: String): Self = this.set("explicit", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: Email): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: Maybe[String]): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setComplete(value: Maybe[String]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setNewFeedUrl(value: Maybe[String]): Self = this.set("newFeedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewFeedUrl: Self = this.set("newFeedUrl", js.undefined)
    @scala.inline
    def setSubtitle(value: Maybe[String]): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
  }
  
}

