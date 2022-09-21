package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateLocationRequest")
@js.native
open class CreateLocationRequest () extends StObject {
  
  /**
    * The initial values of the location being created. The `name` field is required. All other fields are optional.
    * Unspecified fields will be set to default values using existing location data.
    */
  var location: js.UndefOr[Location] = js.native
}
