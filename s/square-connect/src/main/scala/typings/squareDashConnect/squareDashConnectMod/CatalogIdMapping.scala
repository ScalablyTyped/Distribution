package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogIdMapping")
@js.native
class CatalogIdMapping () extends js.Object {
  /**
    * The client-supplied, temporary `#`-prefixed ID for a new [CatalogObject](#type-catalogobject).
    */
  var client_object_id: js.UndefOr[String] = js.native
  /**
    * The permanent ID for the [CatalogObject](#type-catalogobject) created by the server.
    */
  var object_id: js.UndefOr[String] = js.native
}

