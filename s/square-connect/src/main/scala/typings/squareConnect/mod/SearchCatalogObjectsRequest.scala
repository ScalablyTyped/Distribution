package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchCatalogObjectsRequest")
@js.native
class SearchCatalogObjectsRequest () extends StObject {
  
  /**
    * Return objects modified after this [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates),
    * in RFC 3339 format, e.g., `2016-09-04T23:59:33.123Z`. The timestamp is exclusive - objects with a timestamp equal
    * to `begin_time` will not be included in the response.
    */
  var begin_time: js.UndefOr[String] = js.native
  
  /**
    * The pagination cursor returned in the previous response. Leave unset for an initial request.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * If `true`, deleted objects will be included in the results.
    * Deleted objects will have their `is_deleted` field set to `true`.
    */
  var include_deleted_objects: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the response will include additional objects that are related to the requested object, as follows:
    *  - If a CatalogItem is returned in the object field of the response, its associated CatalogCategory, CatalogTax
    *  objects, CatalogImage objects and CatalogModifierList objects will be included in the `related_objects` field of the response.
    *  - If a CatalogItemVariation is returned in the object field of the response, its parent CatalogItem will be
    *  included in the `related_objects` field of the response.
    */
  var include_related_objects: js.UndefOr[Boolean] = js.native
  
  /**
    * A limit on the number of results to be returned in a single page.
    * The limit is advisory - the implementation may return more or fewer results.
    * If the supplied limit is negative, zero, or is higher than the maximum limit of 1,000, it will be ignored.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The desired set of object types to appear in the search results.
    * See [CatalogObjectType](#type-catalogobjecttype) for possible values
    */
  var object_types: js.UndefOr[js.Array[ObjectType]] = js.native
  
  /**
    * A query to be used to filter or sort the results. If no query is specified, the entire catalog will be returned.
    */
  var query: js.UndefOr[CatalogQuery] = js.native
}
