package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecycleBinItemState extends StObject
@JSGlobal("SP.RecycleBinItemState")
@js.native
object RecycleBinItemState extends StObject {
  
  @js.native
  sealed trait firstStageRecycleBin extends RecycleBinItemState
  
  @js.native
  sealed trait none extends RecycleBinItemState
  
  @js.native
  sealed trait secondStageRecycleBin extends RecycleBinItemState
}
