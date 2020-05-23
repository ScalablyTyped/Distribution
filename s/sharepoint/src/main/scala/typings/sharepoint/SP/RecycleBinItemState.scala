package typings.sharepoint.SP

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
  
}

