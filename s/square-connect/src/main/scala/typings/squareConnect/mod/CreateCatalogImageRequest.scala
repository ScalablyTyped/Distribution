package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateCatalogImageRequest")
@js.native
class CreateCatalogImageRequest () extends StObject {
  
  /**
    * A unique string that identifies this CreateCatalogImage request.
    * Keys can be any valid string but must be unique for every CreateCatalogImage request.
    * See [Idempotency keys](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: String = js.native
  
  /**
    * The new `IMAGE`-type `CatalogObject` to be attached to this `CatalogImage`.
    * If the `CatalogObject` already has a `CatalogImage`, this call will overwrite it.
    */
  var image: js.UndefOr[CatalogObject] = js.native
  
  /**
    * Unique ID of the `CatalogObject` to attach to this `CatalogImage`. Leave this field empty to create unattached images,
    * for example if you are building an integration where these images can be attached to catalog items at a later time.
    */
  var object_id: js.UndefOr[String] = js.native
}
