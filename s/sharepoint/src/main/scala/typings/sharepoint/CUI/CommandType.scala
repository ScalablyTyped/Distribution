package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandType extends js.Object

@JSGlobal("CUI.CommandType")
@js.native
object CommandType extends js.Object {
  @js.native
  sealed trait general extends CommandType
  
  @js.native
  sealed trait ignoredByMenu extends CommandType
  
  @js.native
  sealed trait menuClose extends CommandType
  
  @js.native
  sealed trait menuCreation extends CommandType
  
  @js.native
  sealed trait optionPreview extends CommandType
  
  @js.native
  sealed trait optionPreviewRevert extends CommandType
  
  @js.native
  sealed trait optionSelection extends CommandType
  
  @js.native
  sealed trait preview extends CommandType
  
  @js.native
  sealed trait previewRevert extends CommandType
  
  @js.native
  sealed trait rootEvent extends CommandType
  
  @js.native
  sealed trait tabSelection extends CommandType
  
}

