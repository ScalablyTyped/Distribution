package typings.reactNativeRssParser.mod

import typings.reactNativeRssParser.anon.Authors
import typings.reactNativeRssParser.anon.Length
import typings.reactNativeRssParser.anon.Name
import typings.reactNativeRssParser.anon.Rel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedItem extends js.Object {
  var authors: js.Array[Maybe[Name]] = js.native
  var categories: js.Array[Maybe[Name]] = js.native
  var content: String = js.native
  var description: String = js.native
  var enclosures: js.Array[Length] = js.native
  var id: String = js.native
  var itunes: Authors = js.native
  var links: js.Array[Rel] = js.native
  var published: String = js.native
  var title: String = js.native
}

object FeedItem {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[Name]],
    categories: js.Array[Maybe[Name]],
    content: String,
    description: String,
    enclosures: js.Array[Length],
    id: String,
    itunes: Authors,
    links: js.Array[Rel],
    published: String,
    title: String
  ): FeedItem = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItem]
  }
  @scala.inline
  implicit class FeedItemOps[Self <: FeedItem] (val x: Self) extends AnyVal {
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
    def setAuthorsVarargs(value: Maybe[Name]*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: js.Array[Maybe[Name]]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: Maybe[Name]*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[Maybe[Name]]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnclosuresVarargs(value: Length*): Self = this.set("enclosures", js.Array(value :_*))
    @scala.inline
    def setEnclosures(value: js.Array[Length]): Self = this.set("enclosures", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItunes(value: Authors): Self = this.set("itunes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksVarargs(value: Rel*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Rel]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

