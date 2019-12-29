package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

@JSGlobal("SP.JsGrid.TextDirection")
@js.native
object TextDirection extends js.Object {
   // 0,
  @js.native
  sealed trait Default extends TextDirection
  
  @js.native
  sealed trait LeftToRight extends TextDirection
  
   // 1,
  @js.native
  sealed trait RightToLeft extends TextDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object LeftToRight extends TopLevel[LeftToRight with Double]
  
  /* 1 */ @js.native
  object RightToLeft extends TopLevel[RightToLeft with Double]
  
}

