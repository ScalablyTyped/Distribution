package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateCatalogImageResponse")
@js.native
open class CreateCatalogImageResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The newly created `CatalogImage` including a Square-generated URL for each image.
    */
  var image: js.UndefOr[CatalogObject] = js.native
}
