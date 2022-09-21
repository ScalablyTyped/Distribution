package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "FilterValue")
@js.native
open class FilterValue () extends StObject {
  
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
