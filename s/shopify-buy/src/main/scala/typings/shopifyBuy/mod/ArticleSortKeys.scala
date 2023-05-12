package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArticleSortKeys extends StObject
// end GraphQL Types - Scalars
// GraphQL Types - Enums
@JSImport("shopify-buy", "ArticleSortKeys")
@js.native
object ArticleSortKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArticleSortKeys & String] = js.native
  
  @js.native
  sealed trait AUTHOR
    extends StObject
       with ArticleSortKeys
  /* "author" */ val AUTHOR: typings.shopifyBuy.mod.ArticleSortKeys.AUTHOR & String = js.native
  
  @js.native
  sealed trait BLOG_TITLE
    extends StObject
       with ArticleSortKeys
  /* "blog_title" */ val BLOG_TITLE: typings.shopifyBuy.mod.ArticleSortKeys.BLOG_TITLE & String = js.native
  
  @js.native
  sealed trait ID
    extends StObject
       with ArticleSortKeys
  /* "id" */ val ID: typings.shopifyBuy.mod.ArticleSortKeys.ID & String = js.native
  
  @js.native
  sealed trait PUBLISHED_AT
    extends StObject
       with ArticleSortKeys
  /* "published_at" */ val PUBLISHED_AT: typings.shopifyBuy.mod.ArticleSortKeys.PUBLISHED_AT & String = js.native
  
  @js.native
  sealed trait RELEVANCE
    extends StObject
       with ArticleSortKeys
  /* "query" */ val RELEVANCE: typings.shopifyBuy.mod.ArticleSortKeys.RELEVANCE & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with ArticleSortKeys
  /* "title" */ val TITLE: typings.shopifyBuy.mod.ArticleSortKeys.TITLE & String = js.native
  
  @js.native
  sealed trait UPDATED_AT
    extends StObject
       with ArticleSortKeys
  /* "updated_at" */ val UPDATED_AT: typings.shopifyBuy.mod.ArticleSortKeys.UPDATED_AT & String = js.native
}
