package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.JsGrid.UpdateSerializeMode.Cancel
import typings.sharepoint.SP.JsGrid.UpdateSerializeMode.Default
import typings.sharepoint.SP.JsGrid.UpdateSerializeMode.PropBoth
import typings.sharepoint.SP.JsGrid.UpdateSerializeMode.PropDataOnly
import typings.sharepoint.SP.JsGrid.UpdateSerializeMode.PropLocalizedOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateSerializeMode extends js.Object

@JSGlobal("SP.JsGrid.UpdateSerializeMode")
@js.native
object UpdateSerializeMode extends js.Object {
   // 0,
  @js.native
  sealed trait Cancel extends UpdateSerializeMode
  
   // 1,
  @js.native
  sealed trait Default extends UpdateSerializeMode
  
  @js.native
  sealed trait PropBoth extends UpdateSerializeMode
  
   // 2,
  @js.native
  sealed trait PropDataOnly extends UpdateSerializeMode
  
   // 3,
  @js.native
  sealed trait PropLocalizedOnly extends UpdateSerializeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpdateSerializeMode with Double] = js.native
  /* 0 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 4 */ @js.native
  object PropBoth extends TopLevel[PropBoth with Double]
  
  /* 2 */ @js.native
  object PropDataOnly extends TopLevel[PropDataOnly with Double]
  
  /* 3 */ @js.native
  object PropLocalizedOnly extends TopLevel[PropLocalizedOnly with Double]
  
}

