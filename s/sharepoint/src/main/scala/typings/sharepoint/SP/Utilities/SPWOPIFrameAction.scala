package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SPWOPIFrameAction extends StObject
@JSGlobal("SP.Utilities.SPWOPIFrameAction")
@js.native
object SPWOPIFrameAction extends StObject {
  
  @js.native
  sealed trait edit
    extends StObject
       with SPWOPIFrameAction
  
  @js.native
  sealed trait interactivePreview
    extends StObject
       with SPWOPIFrameAction
  
  @js.native
  sealed trait mobileView
    extends StObject
       with SPWOPIFrameAction
  
  @js.native
  sealed trait view
    extends StObject
       with SPWOPIFrameAction
}
