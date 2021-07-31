package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogIdMapping")
@js.native
class CatalogIdMapping () extends StObject {
  
  /**
    * The client-supplied temporary `#`-prefixed ID for a new `CatalogObject`.
    */
  var client_object_id: js.UndefOr[String] = js.native
  
  /**
    * The permanent ID for the CatalogObject created by the server.
    */
  var object_id: js.UndefOr[String] = js.native
}
