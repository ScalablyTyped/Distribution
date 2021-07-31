package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandType extends StObject
@JSGlobal("CUI.CommandType")
@js.native
object CommandType extends StObject {
  
  @js.native
  sealed trait general
    extends StObject
       with CommandType
  
  @js.native
  sealed trait ignoredByMenu
    extends StObject
       with CommandType
  
  @js.native
  sealed trait menuClose
    extends StObject
       with CommandType
  
  @js.native
  sealed trait menuCreation
    extends StObject
       with CommandType
  
  @js.native
  sealed trait optionPreview
    extends StObject
       with CommandType
  
  @js.native
  sealed trait optionPreviewRevert
    extends StObject
       with CommandType
  
  @js.native
  sealed trait optionSelection
    extends StObject
       with CommandType
  
  @js.native
  sealed trait preview
    extends StObject
       with CommandType
  
  @js.native
  sealed trait previewRevert
    extends StObject
       with CommandType
  
  @js.native
  sealed trait rootEvent
    extends StObject
       with CommandType
  
  @js.native
  sealed trait tabSelection
    extends StObject
       with CommandType
}
