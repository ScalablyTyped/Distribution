package typings.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconSize extends js.Object

@JSGlobal("SP.Utilities.IconSize")
@js.native
object IconSize extends js.Object {
  @js.native
  sealed trait size16 extends IconSize
  
  @js.native
  sealed trait size256 extends IconSize
  
  @js.native
  sealed trait size32 extends IconSize
  
  /* 0 */ val size16: typings.sharepoint.SP.Utilities.IconSize.size16 with Double = js.native
  /* 2 */ val size256: typings.sharepoint.SP.Utilities.IconSize.size256 with Double = js.native
  /* 1 */ val size32: typings.sharepoint.SP.Utilities.IconSize.size32 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconSize with Double] = js.native
}

