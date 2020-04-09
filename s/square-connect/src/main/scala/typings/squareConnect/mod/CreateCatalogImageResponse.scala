package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateCatalogImageResponse")
@js.native
class CreateCatalogImageResponse () extends js.Object {
  /**
    * Information on any errors encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The newly created `CatalogImage` including a Square-generated URL for each image.
    */
  var image: js.UndefOr[CatalogObject] = js.native
}

