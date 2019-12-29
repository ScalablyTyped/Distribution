package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecycleBinItemState extends js.Object

@JSGlobal("SP.RecycleBinItemState")
@js.native
object RecycleBinItemState extends js.Object {
  @js.native
  sealed trait firstStageRecycleBin extends RecycleBinItemState
  
  @js.native
  sealed trait none extends RecycleBinItemState
  
  @js.native
  sealed trait secondStageRecycleBin extends RecycleBinItemState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecycleBinItemState with Double] = js.native
  /* 1 */ @js.native
  object firstStageRecycleBin extends TopLevel[firstStageRecycleBin with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object secondStageRecycleBin extends TopLevel[secondStageRecycleBin with Double]
  
}

