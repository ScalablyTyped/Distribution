package typings.reactNativeRssParser.mod

import typings.reactNativeRssParser.anon.Block
import typings.reactNativeRssParser.anon.Description
import typings.reactNativeRssParser.anon.Name
import typings.reactNativeRssParser.anon.Rel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feed extends js.Object {
  
  var authors: js.Array[Maybe[Name]] = js.native
  
  var categories: js.Array[Maybe[Name]] = js.native
  
  var copyright: Maybe[String] = js.native
  
  var description: String = js.native
  
  var image: Description = js.native
  
  var items: js.Array[FeedItem] = js.native
  
  var itunes: Block = js.native
  
  var language: String = js.native
  
  var lastPublished: String = js.native
  
  var lastUpdated: String = js.native
  
  var links: js.Array[Rel] = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
}
object Feed {
  
  @scala.inline
  def apply(
    authors: js.Array[Maybe[Name]],
    categories: js.Array[Maybe[Name]],
    description: String,
    image: Description,
    items: js.Array[FeedItem],
    itunes: Block,
    language: String,
    lastPublished: String,
    lastUpdated: String,
    links: js.Array[Rel],
    title: String,
    `type`: String
  ): Feed = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feed]
  }
  
  @scala.inline
  implicit class FeedOps[Self <: Feed] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Description): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: FeedItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[FeedItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItunes(value: Block): Self = this.set("itunes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPublished(value: String): Self = this.set("lastPublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: String): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: Rel*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Rel]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyright(value: Maybe[String]): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
  }
}
