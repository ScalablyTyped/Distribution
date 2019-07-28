package typings.sharepoint.SPNs

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
  
  /* 1 */ val firstStageRecycleBin: typings.sharepoint.SPNs.RecycleBinItemState.firstStageRecycleBin with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.RecycleBinItemState.none with Double = js.native
  /* 2 */ val secondStageRecycleBin: typings.sharepoint.SPNs.RecycleBinItemState.secondStageRecycleBin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecycleBinItemState with Double] = js.native
}

