package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Device")
@js.native
class Device () extends js.Object {
  
  /**
    * The device's Square-issued ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The device's merchant-specified name.
    */
  var name: js.UndefOr[String] = js.native
}
