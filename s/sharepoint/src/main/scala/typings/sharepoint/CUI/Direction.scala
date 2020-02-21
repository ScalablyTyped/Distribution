package typings.sharepoint.CUI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("CUI.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait LTR extends Direction
  
  @js.native
  sealed trait RTL extends Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
  /* 0 */ @js.native
  object LTR extends TopLevel[LTR with Double]
  
  /* 1 */ @js.native
  object RTL extends TopLevel[RTL with Double]
  
}

