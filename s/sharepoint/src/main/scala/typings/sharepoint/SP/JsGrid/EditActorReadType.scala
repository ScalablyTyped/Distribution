package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorReadType extends js.Object

@JSGlobal("SP.JsGrid.EditActorReadType")
@js.native
object EditActorReadType extends js.Object {
   // 1,
  @js.native
  sealed trait Both extends EditActorReadType
  
  @js.native
  sealed trait DataOnly extends EditActorReadType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly extends EditActorReadType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorReadType with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 2 */ @js.native
  object DataOnly extends TopLevel[DataOnly with Double]
  
  /* 1 */ @js.native
  object LocalizedOnly extends TopLevel[LocalizedOnly with Double]
  
}

