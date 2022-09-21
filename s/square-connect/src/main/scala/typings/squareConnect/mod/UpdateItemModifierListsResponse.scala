package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateItemModifierListsResponse")
@js.native
open class UpdateItemModifierListsResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The database [timestamp](https://developer.squareup.com/docs/build-basics/working-with-date) of this
    * update in RFC 3339 format, e.g., `2016-09-04T23:59:33.123Z`.
    */
  var updated_at: js.UndefOr[String] = js.native
}
