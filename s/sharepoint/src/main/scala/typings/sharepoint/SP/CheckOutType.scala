package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckOutType extends js.Object
@JSGlobal("SP.CheckOutType")
@js.native
object CheckOutType extends js.Object {
  
  @js.native
  sealed trait none extends CheckOutType
  
  @js.native
  sealed trait offline extends CheckOutType
  
  @js.native
  sealed trait online extends CheckOutType
}
