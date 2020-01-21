package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogApi")
@js.native
/**
  * Constructs a new CatalogApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class CatalogApi () extends js.Object {
  def this(apiClient: ApiClient) = this()
  /**
    * Returns a list of [CatalogObject](#type-catalogobject)s that includes all objects of a set of desired types
    * (for example, all [CatalogItem](#type-catalogitem) and [CatalogTax](#type-catalogtax) objects) in the catalog.
    * The `types` parameter is specified as a comma-separated list of valid [CatalogObject](#type-catalogobject)
    * types: `ITEM`, `ITEM_VARIATION`, `MODIFIER`, `MODIFIER_LIST`, `CATEGORY`, `DISCOUNT`, `TAX`.
    * @note ListCatalog does not return deleted catalog items. To retrieve deleted catalog items, use SearchCatalogObjects
    * and set `include_deleted_objects` to `true`.
    */
  def batchDeleteCatalogObjects(args: js.Any*): js.Promise[BatchDeleteCatalogObjectsResponse] = js.native
  /**
    * Returns a set of objects based on the provided ID. Each [CatalogItem](#type-catalogitem) returned in the set includes all of
    * its child information including: all of its [CatalogItemVariation](#type-catalogitemvariation) objects, references to its
    * [CatalogModifierList](#type-catalogmodifierlist) objects, and the ids of any [CatalogTax](#type-catalogtax) objects that apply to it.
    */
  def batchRetrieveCatalogObjects(args: js.Any*): js.Promise[BatchRetrieveCatalogObjectsResponse] = js.native
  /**
    * Creates or updates up to 10,000 target objects based on the provided list of objects. The target objects are grouped into
    * batches and each batch is inserted/updated in an all-or-nothing manner. If an object within a batch is malformed in some way,
    * or violates a database constraint, the entire batch containing that item will be disregarded. However, other batches in
    * the same request may still succeed. Each batch may contain up to 1,000 objects, and batches will be processed in order as long
    * as the total object count for the request (items, variations, modifier lists, discounts, and taxes) is no more than 10,000.
    */
  def batchUpsertCatalogObjects(args: js.Any*): js.Promise[BatchUpsertCatalogObjectsResponse] = js.native
  /**
    * Returns information about the Square Catalog API, such as batch size limits for `BatchUpsertCatalogObjects`.
    */
  def catalogInfo(args: js.Any*): js.Promise[CatalogInfoResponse] = js.native
  /**
    * Deletes a single [CatalogObject](#type-catalogobject) based on the provided ID and returns the set of successfully deleted
    * IDs in the response. Deletion is a cascading event such that all children of the targeted object are also deleted.
    * For example, deleting a [CatalogItem](#type-catalogitem) will also delete all of its
    * [CatalogItemVariation](#type-catalogitemvariation) children.
    */
  def deleteCatalogObject(args: js.Any*): js.Promise[DeleteCatalogObjectResponse] = js.native
  /**
    * Returns a list of [CatalogObject](#type-catalogobject)s that includes all objects of a set of desired types
    * (for example, all [CatalogItem](#type-catalogitem) and [CatalogTax](#type-catalogtax) objects) in the catalog.
    * The types parameter is specified as a comma-separated list of valid [CatalogObject](#type-catalogobject)
    * types: `ITEM`, `ITEM_VARIATION`, `MODIFIER`, `MODIFIER_LIST`, `CATEGORY`, `DISCOUNT`, `TAX`.
    */
  def listCatalog(args: js.Any*): js.Promise[ListCatalogResponse] = js.native
  /**
    * Returns a single [CatalogItem](#type-catalogitem) as a [CatalogObject](#type-catalogobject) based on the provided ID.
    * The returned object includes all of the relevant [CatalogItem](#type-catalogitem) information including:
    * [CatalogItemVariation](#type-catalogitemvariation) children, references to its [CatalogModifierList](#type-catalogmodifierlist)
    * objects, and the ids of any [CatalogTax](#type-catalogtax) objects that apply to it.
    */
  def retrieveCatalogObject(args: js.Any*): js.Promise[RetrieveCatalogObjectResponse] = js.native
  /**
    * Queries the targeted catalog using a variety of query types: [CatalogQuerySortedAttribute](#type-catalogquerysortedattribute),
    * [CatalogQueryExact](#type-catalogqueryexact), [CatalogQueryRange](#type-catalogqueryrange),
    * [CatalogQueryText](#type-catalogquerytext), [CatalogQueryItemsForTax](#type-catalogqueryitemsfortax),
    * and [CatalogQueryItemsForModifierList](#type-catalogqueryitemsformodifierlist).
    */
  def searchCatalogObjects(args: js.Any*): js.Promise[SearchCatalogObjectsResponse] = js.native
  /**
    * Updates the [CatalogModifierList](#type-catalogmodifierlist) objects that apply to the targeted
    * [CatalogItem](#type-catalogitem) without having to perform an upsert on the entire item.
    */
  def updateItemModifierLists(args: js.Any*): js.Promise[UpdateItemModifierListsResponse] = js.native
  /**
    * Updates the [CatalogTax](#type-catalogtax) objects that apply to the targeted [CatalogItem](#type-catalogitem)
    * without having to perform an upsert on the entire item.
    */
  def updateItemTaxes(args: js.Any*): js.Promise[UpdateItemTaxesResponse] = js.native
  /**
    * Creates or updates the target [CatalogObject](#type-catalogobject).
    */
  def upsertCatalogObject(args: js.Any*): js.Promise[UpsertCatalogObjectResponse] = js.native
}

