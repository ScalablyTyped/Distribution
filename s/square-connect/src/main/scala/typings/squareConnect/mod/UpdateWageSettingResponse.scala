package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateWageSettingResponse")
@js.native
class UpdateWageSettingResponse () extends StObject {
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The successfully updated `WageSetting` object.
    */
  var wage_setting: js.UndefOr[WageSetting] = js.native
}
