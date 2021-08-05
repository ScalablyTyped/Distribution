package typings.reactNativeRssParser

import typings.reactNativeRssParser.mod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Authors extends StObject {
    
    var authors: Maybe[js.Array[Name]]
    
    var block: Maybe[String]
    
    var duration: String
    
    var explicit: String
    
    var image: Maybe[String]
    
    var isClosedCaptioned: Maybe[String]
    
    var order: Maybe[String]
    
    var subtitle: String
    
    var summary: Maybe[String]
  }
  object Authors {
    
    inline def apply(duration: String, explicit: String, subtitle: String): Authors = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authors]
    }
    
    extension [Self <: Authors](x: Self) {
      
      inline def setAuthors(value: Maybe[js.Array[Name]]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
      
      inline def setAuthorsVarargs(value: Name*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      inline def setBlock(value: Maybe[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setExplicit(value: String): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Maybe[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setIsClosedCaptioned(value: Maybe[String]): Self = StObject.set(x, "isClosedCaptioned", value.asInstanceOf[js.Any])
      
      inline def setIsClosedCaptionedUndefined: Self = StObject.set(x, "isClosedCaptioned", js.undefined)
      
      inline def setOrder(value: Maybe[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: Maybe[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  trait Block extends StObject {
    
    var authors: js.Array[Name]
    
    var block: Maybe[String]
    
    var categories: js.Array[SubCategories]
    
    var complete: Maybe[String]
    
    var explicit: String
    
    var image: String
    
    var newFeedUrl: Maybe[String]
    
    var owner: Email
    
    var subtitle: Maybe[String]
    
    var summary: String
  }
  object Block {
    
    inline def apply(
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
    
    extension [Self <: Block](x: Self) {
      
      inline def setAuthors(value: js.Array[Name]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
      
      inline def setAuthorsVarargs(value: Name*): Self = StObject.set(x, "authors", js.Array(value :_*))
      
      inline def setBlock(value: Maybe[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setCategories(value: js.Array[SubCategories]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: SubCategories*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      inline def setComplete(value: Maybe[String]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setExplicit(value: String): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setNewFeedUrl(value: Maybe[String]): Self = StObject.set(x, "newFeedUrl", value.asInstanceOf[js.Any])
      
      inline def setNewFeedUrlUndefined: Self = StObject.set(x, "newFeedUrl", js.undefined)
      
      inline def setOwner(value: Email): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: Maybe[String]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: Maybe[String]
    
    var height: Maybe[String]
    
    var title: String
    
    var url: String
    
    var width: Maybe[String]
  }
  object Description {
    
    inline def apply(title: String, url: String): Description = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: Maybe[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeight(value: Maybe[String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Maybe[String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: String
    
    var name: String
  }
  object Email {
    
    inline def apply(email: String, name: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: String
    
    var mimeType: String
    
    var url: String
  }
  object Length {
    
    inline def apply(length: String, mimeType: String, url: String): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rel extends StObject {
    
    var rel: String
    
    var url: String
  }
  object Rel {
    
    inline def apply(rel: String, url: String): Rel = {
      val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rel]
    }
    
    extension [Self <: Rel](x: Self) {
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubCategories extends StObject {
    
    var name: String
    
    var subCategories: js.Array[Maybe[Name]]
  }
  object SubCategories {
    
    inline def apply(name: String, subCategories: js.Array[Maybe[Name]]): SubCategories = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subCategories = subCategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubCategories]
    }
    
    extension [Self <: SubCategories](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubCategories(value: js.Array[Maybe[Name]]): Self = StObject.set(x, "subCategories", value.asInstanceOf[js.Any])
      
      inline def setSubCategoriesVarargs(value: Maybe[Name]*): Self = StObject.set(x, "subCategories", js.Array(value :_*))
    }
  }
}
