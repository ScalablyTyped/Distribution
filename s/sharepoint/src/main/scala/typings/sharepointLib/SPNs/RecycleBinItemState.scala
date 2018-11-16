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
  
  val firstStageRecycleBin: firstStageRecycleBin with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val secondStageRecycleBin: secondStageRecycleBin with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.RecycleBinItemState with java.lang.String] = js.native
}

