package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Online Store
  */
trait Article
  extends StObject
     with Node
     with HasMetafields
     with OnlineStorePublishable
     with MetafieldParentResource {
  
  /**
    * @deprecated
    */
  var author: ArticleAuthor
  
  var authorV2: js.UndefOr[ArticleAuthor] = js.undefined
  
  var blog: Blog
  
  var comments: js.Array[Comment]
  
  var content: String
  
  var contentHtml: String
  
  var excerpt: js.UndefOr[String] = js.undefined
  
  var excerptHtml: js.UndefOr[String] = js.undefined
  
  var handle: String
  
  var image: js.UndefOr[Image] = js.undefined
  
  var publishedAt: DateTime
  
  var seo: js.UndefOr[SEO] = js.undefined
  
  var tags: js.Array[String]
  
  var title: js.Array[String]
}
object Article {
  
  inline def apply(
    author: ArticleAuthor,
    blog: Blog,
    comments: js.Array[Comment],
    content: String,
    contentHtml: String,
    handle: String,
    id: ID,
    metafields: js.Array[Metafield],
    publishedAt: DateTime,
    tags: js.Array[String],
    title: js.Array[String]
  ): Article = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentHtml = contentHtml.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Article]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Article] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: ArticleAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorV2(value: ArticleAuthor): Self = StObject.set(x, "authorV2", value.asInstanceOf[js.Any])
    
    inline def setAuthorV2Undefined: Self = StObject.set(x, "authorV2", js.undefined)
    
    inline def setBlog(value: Blog): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentHtml(value: String): Self = StObject.set(x, "contentHtml", value.asInstanceOf[js.Any])
    
    inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
    
    inline def setExcerptHtml(value: String): Self = StObject.set(x, "excerptHtml", value.asInstanceOf[js.Any])
    
    inline def setExcerptHtmlUndefined: Self = StObject.set(x, "excerptHtml", js.undefined)
    
    inline def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setPublishedAt(value: DateTime): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setSeo(value: SEO): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
  }
}
