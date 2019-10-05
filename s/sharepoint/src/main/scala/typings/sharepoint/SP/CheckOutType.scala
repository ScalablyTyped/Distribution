package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val none: typings.sharepoint.SP.CheckOutType.none with Double = js.native
  /* 1 */ val offline: typings.sharepoint.SP.CheckOutType.offline with Double = js.native
  /* 0 */ val online: typings.sharepoint.SP.CheckOutType.online with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckOutType with Double] = js.native
}

