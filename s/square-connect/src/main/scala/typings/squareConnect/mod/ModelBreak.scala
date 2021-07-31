package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ModelBreak")
@js.native
class ModelBreak () extends StObject {
  
  /**
    * The `BreakType` this `Break` was templated on.
    */
  var break_type_id: String = js.native
  
  /**
    * RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated.
    */
  var end_at: js.UndefOr[String] = js.native
  
  /**
    * Format: RFC-3339 P[n]Y[n]M[n]DT[n]H[n]M[n]S. The expected length of the break.
    */
  var expected_duration: String = js.native
  
  /**
    * UUID for this object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether this break counts towards time worked for compensation purposes.
    */
  var is_paid: Boolean = js.native
  
  /**
    * A human-readable name.
    */
  var name: String = js.native
  
  /**
    * RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated.
    */
  var start_at: String = js.native
}
