package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSGlobal("SP.JsGrid.EditMode")
@js.native
object EditMode extends js.Object {
  @js.native
  sealed trait Defer extends EditMode
  
   // 0,
  @js.native
  sealed trait ReadOnly extends EditMode
  
   // 2,
  @js.native
  sealed trait ReadOnlyDefer extends EditMode
  
   // 1,
  @js.native
  sealed trait ReadWrite extends EditMode
  
   // 3,
  @js.native
  sealed trait ReadWriteDefer extends EditMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
  /* 4 */ @js.native
  object Defer extends TopLevel[Defer with Double]
  
  /* 0 */ @js.native
  object ReadOnly extends TopLevel[ReadOnly with Double]
  
  /* 2 */ @js.native
  object ReadOnlyDefer extends TopLevel[ReadOnlyDefer with Double]
  
  /* 1 */ @js.native
  object ReadWrite extends TopLevel[ReadWrite with Double]
  
  /* 3 */ @js.native
  object ReadWriteDefer extends TopLevel[ReadWriteDefer with Double]
  
}

