package typings.sharepoint.CUI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommandType with Double] = js.native
  /* 0 */ @js.native
  object general extends TopLevel[general with Double]
  
  /* 8 */ @js.native
  object ignoredByMenu extends TopLevel[ignoredByMenu with Double]
  
  /* 9 */ @js.native
  object menuClose extends TopLevel[menuClose with Double]
  
  /* 3 */ @js.native
  object menuCreation extends TopLevel[menuCreation with Double]
  
  /* 6 */ @js.native
  object optionPreview extends TopLevel[optionPreview with Double]
  
  /* 7 */ @js.native
  object optionPreviewRevert extends TopLevel[optionPreviewRevert with Double]
  
  /* 2 */ @js.native
  object optionSelection extends TopLevel[optionSelection with Double]
  
  /* 4 */ @js.native
  object preview extends TopLevel[preview with Double]
  
  /* 5 */ @js.native
  object previewRevert extends TopLevel[previewRevert with Double]
  
  /* 10 */ @js.native
  object rootEvent extends TopLevel[rootEvent with Double]
  
  /* 1 */ @js.native
  object tabSelection extends TopLevel[tabSelection with Double]
  
}

