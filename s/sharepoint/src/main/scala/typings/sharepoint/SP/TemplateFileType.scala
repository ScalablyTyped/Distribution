package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TemplateFileType extends StObject
@JSGlobal("SP.TemplateFileType")
@js.native
object TemplateFileType extends StObject {
  
  @js.native
  sealed trait formPage
    extends StObject
       with TemplateFileType
  
  @js.native
  sealed trait standardPage
    extends StObject
       with TemplateFileType
  
  @js.native
  sealed trait wikiPage
    extends StObject
       with TemplateFileType
}
