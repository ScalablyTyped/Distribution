package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlogSortKeys extends StObject
@JSImport("shopify-buy", "BlogSortKeys")
@js.native
object BlogSortKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlogSortKeys & String] = js.native
  
  @js.native
  sealed trait HANDLE
    extends StObject
       with BlogSortKeys
  /* "HANDLE" */ val HANDLE: typings.shopifyBuy.mod.BlogSortKeys.HANDLE & String = js.native
  
  @js.native
  sealed trait ID
    extends StObject
       with BlogSortKeys
  /* "id" */ val ID: typings.shopifyBuy.mod.BlogSortKeys.ID & String = js.native
  
  @js.native
  sealed trait RELEVANCE
    extends StObject
       with BlogSortKeys
  /* "query" */ val RELEVANCE: typings.shopifyBuy.mod.BlogSortKeys.RELEVANCE & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with BlogSortKeys
  /* "title" */ val TITLE: typings.shopifyBuy.mod.BlogSortKeys.TITLE & String = js.native
}
