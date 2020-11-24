package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerSegment")
@js.native
class CustomerSegment () extends js.Object {
  
  /**
    * The timestamp when the segment was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * Unique Square-generated ID for the segment.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the segment.
    */
  var name: String = js.native
  
  /**
    * The timestamp when the segment was last updated, in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}
