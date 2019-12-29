package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconSize with Double] = js.native
  /* 0 */ @js.native
  object size16 extends TopLevel[size16 with Double]
  
  /* 2 */ @js.native
  object size256 extends TopLevel[size256 with Double]
  
  /* 1 */ @js.native
  object size32 extends TopLevel[size32 with Double]
  
}

