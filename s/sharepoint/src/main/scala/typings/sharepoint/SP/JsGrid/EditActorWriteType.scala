package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorWriteType extends js.Object

@JSGlobal("SP.JsGrid.EditActorWriteType")
@js.native
object EditActorWriteType extends js.Object {
   // 1,
  @js.native
  sealed trait Both extends EditActorWriteType
  
   // 3,
  @js.native
  sealed trait DataOnly extends EditActorWriteType
  
  @js.native
  sealed trait Either extends EditActorWriteType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly extends EditActorWriteType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorWriteType with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 2 */ @js.native
  object DataOnly extends TopLevel[DataOnly with Double]
  
  /* 3 */ @js.native
  object Either extends TopLevel[Either with Double]
  
  /* 1 */ @js.native
  object LocalizedOnly extends TopLevel[LocalizedOnly with Double]
  
}

