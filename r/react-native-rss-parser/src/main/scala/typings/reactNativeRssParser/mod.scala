package typings.reactNativeRssParser

import typings.reactNativeRssParser.anon.Authors
import typings.reactNativeRssParser.anon.Block
import typings.reactNativeRssParser.anon.Description
import typings.reactNativeRssParser.anon.Length
import typings.reactNativeRssParser.anon.Name
import typings.reactNativeRssParser.anon.Rel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-rss-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(feedUrl: String): js.Promise[Feed] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(feedUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Feed]]
  
  trait Feed extends StObject {
    
    var authors: js.Array[Maybe[Name]]
    
    var categories: js.Array[Maybe[Name]]
    
    var copyright: Maybe[String]
    
    var description: String
    
    var image: Description
    
    var items: js.Array[FeedItem]
    
    var itunes: Block
    
    var language: String
    
    var lastPublished: String
    
    var lastUpdated: String
    
    var links: js.Array[Rel]
    
    var title: String
    
    var `type`: String
  }
  object Feed {
    
    inline def apply(
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
    
    extension [Self <: Feed](x: Self) {
      
      inline def setAuthors(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsVarargs(value: Maybe[Name]*): Self = StObject.set(x, "authors", js.Array(value*))
      
      inline def setCategories(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Maybe[Name]*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCopyright(value: Maybe[String]): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Description): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[FeedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: FeedItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setItunes(value: Block): Self = StObject.set(x, "itunes", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLastPublished(value: String): Self = StObject.set(x, "lastPublished", value.asInstanceOf[js.Any])
      
      inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[Rel]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Rel*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedItem extends StObject {
    
    var authors: js.Array[Maybe[Name]]
    
    var categories: js.Array[Maybe[Name]]
    
    var content: String
    
    var description: String
    
    var enclosures: js.Array[Length]
    
    var id: String
    
    var itunes: Authors
    
    var links: js.Array[Rel]
    
    var published: String
    
    var title: String
  }
  object FeedItem {
    
    inline def apply(
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
    
    extension [Self <: FeedItem](x: Self) {
      
      inline def setAuthors(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsVarargs(value: Maybe[Name]*): Self = StObject.set(x, "authors", js.Array(value*))
      
      inline def setCategories(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Maybe[Name]*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnclosures(value: js.Array[Length]): Self = StObject.set(x, "enclosures", value.asInstanceOf[js.Any])
      
      inline def setEnclosuresVarargs(value: Length*): Self = StObject.set(x, "enclosures", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItunes(value: Authors): Self = StObject.set(x, "itunes", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[Rel]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Rel*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Maybe[T] = js.UndefOr[T]
}
