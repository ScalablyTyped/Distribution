package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blog
  extends StObject
     with Node
     with HasMetafields
     with OnlineStorePublishable
     with MetafieldParentResource {
  
  var articleByHandle: js.UndefOr[Article] = js.undefined
  
  var articles: js.Array[Article]
  
  var authors: js.Array[ArticleAuthor]
  
  var handle: String
  
  var seo: js.UndefOr[SEO] = js.undefined
  
  var title: String
}
object Blog {
  
  inline def apply(
    articles: js.Array[Article],
    authors: js.Array[ArticleAuthor],
    handle: String,
    id: ID,
    metafields: js.Array[Metafield],
    title: String
  ): Blog = {
    val __obj = js.Dynamic.literal(articles = articles.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blog] (val x: Self) extends AnyVal {
    
    inline def setArticleByHandle(value: Article): Self = StObject.set(x, "articleByHandle", value.asInstanceOf[js.Any])
    
    inline def setArticleByHandleUndefined: Self = StObject.set(x, "articleByHandle", js.undefined)
    
    inline def setArticles(value: js.Array[Article]): Self = StObject.set(x, "articles", value.asInstanceOf[js.Any])
    
    inline def setArticlesVarargs(value: Article*): Self = StObject.set(x, "articles", js.Array(value*))
    
    inline def setAuthors(value: js.Array[ArticleAuthor]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsVarargs(value: ArticleAuthor*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setSeo(value: SEO): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
