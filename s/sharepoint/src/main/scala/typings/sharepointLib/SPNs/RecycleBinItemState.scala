package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecycleBinItemState extends js.Object

@JSGlobal("SP.RecycleBinItemState")
@js.native
object RecycleBinItemState extends js.Object {
  @js.native
  sealed trait firstStageRecycleBin
    extends sharepointLib.SPNs.RecycleBinItemState
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.RecycleBinItemState
  
  @js.native
  sealed trait secondStageRecycleBin
    extends sharepointLib.SPNs.RecycleBinItemState
  
  /* 1 */ val firstStageRecycleBin: firstStageRecycleBin with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val secondStageRecycleBin: secondStageRecycleBin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.RecycleBinItemState with scala.Double] = js.native
}

