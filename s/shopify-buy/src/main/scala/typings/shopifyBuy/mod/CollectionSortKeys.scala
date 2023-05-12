package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CollectionSortKeys extends StObject
@JSImport("shopify-buy", "CollectionSortKeys")
@js.native
object CollectionSortKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CollectionSortKeys & String] = js.native
  
  @js.native
  sealed trait ID
    extends StObject
       with CollectionSortKeys
  /* "id" */ val ID: typings.shopifyBuy.mod.CollectionSortKeys.ID & String = js.native
  
  @js.native
  sealed trait RELEVANCE
    extends StObject
       with CollectionSortKeys
  /* "query" */ val RELEVANCE: typings.shopifyBuy.mod.CollectionSortKeys.RELEVANCE & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with CollectionSortKeys
  /* "title" */ val TITLE: typings.shopifyBuy.mod.CollectionSortKeys.TITLE & String = js.native
  
  @js.native
  sealed trait UPDATED_AT
    extends StObject
       with CollectionSortKeys
  /* "updated_at" */ val UPDATED_AT: typings.shopifyBuy.mod.CollectionSortKeys.UPDATED_AT & String = js.native
}
