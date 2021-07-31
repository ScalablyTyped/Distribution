package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddFieldOptions extends StObject
@JSGlobal("SP.AddFieldOptions")
@js.native
object AddFieldOptions extends StObject {
  
  @js.native
  sealed trait addFieldCheckDisplayName
    extends StObject
       with AddFieldOptions
  
  @js.native
  sealed trait addFieldInternalNameHint
    extends StObject
       with AddFieldOptions
  
  @js.native
  sealed trait addFieldToDefaultView
    extends StObject
       with AddFieldOptions
  
  @js.native
  sealed trait addToAllContentTypes
    extends StObject
       with AddFieldOptions
  
  @js.native
  sealed trait addToDefaultContentType
    extends StObject
       with AddFieldOptions
  
  @js.native
  sealed trait addToNoContentType
    extends StObject
       with AddFieldOptions
  
  @js.native
  sealed trait defaultValue
    extends StObject
       with AddFieldOptions
}
