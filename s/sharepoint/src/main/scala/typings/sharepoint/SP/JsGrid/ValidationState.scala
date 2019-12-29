package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationState extends js.Object

@JSGlobal("SP.JsGrid.ValidationState")
@js.native
object ValidationState extends js.Object {
  @js.native
  sealed trait Invalid extends ValidationState
  
   // 1,
  @js.native
  sealed trait Pending extends ValidationState
  
   // 0,
  @js.native
  sealed trait Valid extends ValidationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationState with Double] = js.native
  /* 2 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 0 */ @js.native
  object Valid extends TopLevel[Valid with Double]
  
}

