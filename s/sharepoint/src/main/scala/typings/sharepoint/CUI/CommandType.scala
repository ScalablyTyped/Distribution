package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandType extends StObject
@JSGlobal("CUI.CommandType")
@js.native
object CommandType extends StObject {
  
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
