package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckOutType with Double] = js.native
  /* 2 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object offline extends TopLevel[offline with Double]
  
  /* 0 */ @js.native
  object online extends TopLevel[online with Double]
  
}

