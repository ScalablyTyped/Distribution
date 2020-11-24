package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "FilterValue")
@js.native
class FilterValue () extends js.Object {
  
  /**
    * A list of terms that must be present on the field of the resource.
    */
  var all: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of terms where at least one of them must be present on the field of the resource.
    */
  var any: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of terms that must not be present on the field the resource
    */
  var none: js.UndefOr[js.Array[String]] = js.native
}
